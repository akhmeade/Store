// #####################################################
// ########## Packages and imported libraries ##########
// #####################################################

// Discounts.model
package org.springframework.online.store.discounts.model;
// JavaX.persistence
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;
// other
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.core.style.ToStringCreator;


// #####################################################
// ########## Constructing Table of payments ###########
// #####################################################

@Entity
@Table(name = "payments")
public class Payment {

    // ---------------------------------------------------
    // COLUMNS creation
    // ---------------------------------------------------
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "some_date")
    @Temporal(TemporalType.DATE)
    private Date someDate;

    @ManyToOne @JoinColumn(name = "type_id")
    private PaymentType type;

    @ManyToOne @JoinColumn(name = "owner_id")
    @JsonIgnore private Discount owner;

    // ---------------------------------------------------
    // GET-methods
    // ---------------------------------------------------
    public Integer get_id() {
        return id;
    }
    public String get_name() {
        return this.name;
    }
    public Date get_date() {
        return someDate;
    }
    public PaymentType get_type() {
        return type;
    }
    public Discount get_owner() {
        return owner;
    }
    // ---------------------------------------------------
    // SET-methods
    // ---------------------------------------------------
    public void set_id(final Integer id) {
        this.id = id;
    }
    public void set_name(final String name) {
        this.name = name;
    }
    public void set_date(final Date birthDate) {
        this.someDate = birthDate;
    }
    public void set_type(final PaymentType type) {
        this.type = type;
    }
    public void set_owner(final Discount owner) {
        this.owner = owner;
    }

    // -----------------------------------------------------
    // TABLE display
    // -----------------------------------------------------
    @Override
    public String toString() {
        return new ToStringCreator(this)
            .append("id", this.get_id())
            .append("name", this.get_name())
            .append("someDate", this.get_date())
            .append("type", this.get_type().get_name())
            .append("ownerFirstname", this.get_owner().get_name())
            .append("ownerLastname", this.get_owner().get_newPrice())
            .toString();
    }
}
