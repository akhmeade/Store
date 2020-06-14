/*
 * Copyright 2002-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.online.store.carts.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.core.style.ToStringCreator;

import javax.validation.constraints.NotEmpty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "carts")
@Builder(builderMethodName = "carts")
@NoArgsConstructor
@AllArgsConstructor
public class Carts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "account")
    @NotEmpty
    private String account;

    @Column(name = "name")
    @NotEmpty
    private String name;

    @Column(name = "price")
    @NotEmpty
    private String price;

    @Column(name = "discount")
    private Integer discount;

    @Column(name = "payment")
    @NotEmpty
    private String payment;

    //@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "owner")
    //private Set<Cart> payments;

    public Integer getId() {
        return id;
    }

    public String getAccount() {
        return account;
    }

    public String getName() {
        return name;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public void setAccount(final String account) {
        this.account = account;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(final String price) {
        this.price = price;
    }

    public Integer getDiscount() {
        return discount;
    }

    public Carts setDiscount(Integer discount_) {
        this.discount = discount_;
        return this;
    }

    public String getPayment() {
        return payment;
    }
    public void setPayment(final String payment) {
        this.payment = payment;
    }

        @Override
        public String toString() {
            return new ToStringCreator(this)

                .append("id", this.getId())
                .append("account", this.getAccount())
                .append("name", this.getName())
                .append("price", this.getPrice())
                .append("discount", this.getDiscount())
                .append("payment", this.getPayment())
                .toString();
        }
    }
