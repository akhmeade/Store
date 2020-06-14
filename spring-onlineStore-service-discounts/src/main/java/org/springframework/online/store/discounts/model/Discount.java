
// #####################################################
// ########## Packages and imported libraries ##########
// #####################################################

// Discounts.model
package org.springframework.online.store.discounts.model;
// JavaX.persistence
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
// from Spring Framework
import org.springframework.beans.support.MutableSortDefinition;
import org.springframework.beans.support.PropertyComparator;
import org.springframework.core.style.ToStringCreator;
// Java.utils
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// #####################################################
// ########## Constructing Table of discounts ##########
// #####################################################

@Entity
@Table(name = "discounts")
public class Discount {

    // ---------------------------------------------------
    // COLUMNS creation
    // ---------------------------------------------------
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    @NotEmpty private String name;

    @Column(name = "discount")
    @NotEmpty private String discount;

    @Column(name = "new_price")
    @NotEmpty private String new_price;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "owner")
    private Set<Payment> payments;

    // ---------------------------------------------------
    // GET-methods
    // ---------------------------------------------------
    public Integer get_id() {
        return id;
    }
    public String get_name() {
        return name;
    }
    public String get_discount() {
        return discount;
    }
    public String get_newPrice() {
        return this.new_price;
    }
    // ---------------------------------------------------
    // SET-methods
    // ---------------------------------------------------
    public void set_name(final String name) {
        this.name = name;
    }
    public void set_discount(final String discount) {
        this.discount = discount;
    }
    public void set_newPrice(String new_price) {
        this.new_price = new_price;
    }

    // -----------------------------------------------------
    // TABLE display
    // -----------------------------------------------------
    @Override
    public String toString() {
        return new ToStringCreator(this)

            .append("id", this.get_id())
            .append("name", this.get_name())
            .append("discount", this.get_discount())
            .append("new_price", this.get_newPrice())
            .toString();
    }

    // -----------------------------------------------------
    // VIEW the details
    // -----------------------------------------------------
    public void addPayment(Payment payment)
    {
        getPaymentsInternal().add(payment);
        payment.set_owner(this);
    }

    protected Set<Payment> getPaymentsInternal()
    {
        if (this.payments == null)
        { this.payments = new HashSet<>();}
        return this.payments;
    }

    public List<Payment> getPayments()
    {
        final List<Payment> sortedPayments = new ArrayList<>(getPaymentsInternal());
        PropertyComparator.sort(sortedPayments, new MutableSortDefinition("name", true, true));
        return Collections.unmodifiableList(sortedPayments);
    }
}


