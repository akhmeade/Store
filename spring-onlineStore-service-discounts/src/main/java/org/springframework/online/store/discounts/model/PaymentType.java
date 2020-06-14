
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
import javax.persistence.Table;


// #####################################################
// ####### Constructing Table of payment types #########
// #####################################################

@Entity
@Table(name = "types")
public class PaymentType {

    // ---------------------------------------------------
    // COLUMNS creation
    // ---------------------------------------------------
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    // ---------------------------------------------------
    // GET-methods
    // ---------------------------------------------------
    public Integer get_id() {return id;}
    public String get_name() {return this.name;}
    // ---------------------------------------------------
    // SET-methods
    // ---------------------------------------------------
    public void set_id(final Integer id) {this.id = id;}
}
