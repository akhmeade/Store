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
/*package org.springframework.online.store.accounts.model;

import org.springframework.core.style.ToStringCreator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    @NotEmpty
    private String name;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return new ToStringCreator(this)

            .append("id", this.getId())
            .append("name", this.getName())
            .toString();
    }
}*/

package org.springframework.online.store.accounts.model;

import org.springframework.core.style.ToStringCreator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Entity
@Table(name = "accounts")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "firstname")
    @NotEmpty
    private String firstname;

    @Column(name = "name")
    @NotEmpty
    private String name;

    @Column(name = "gender")
    @NotEmpty
    private String gender;

    @Column(name = "someDate")
    @Temporal(TemporalType.DATE)
    private Date someDate;

    public Integer getId() {
        return id;
    }
    public void setId(final Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstname;
    }
    public void setFirstName(final String firstname) {
        this.firstname = firstname;
    }

    public String getName() {
        return name;
    }
    public void setName(final String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }
    public void setGender(final String gender) {
        this.gender = gender;
    }

    /*public Date getDate() {
        return someDate;
    }
    public void setDate(final Date someDate) {
        this.someDate = someDate;
    }*/

    @Override
    public String toString() {
        return new ToStringCreator(this)

            .append("id", this.getId())
            .append("firstname", this.getFirstName())
            .append("name", this.getName())
            .append("gender", this.getGender())
            //.append("someDate", this.getDate())
            .toString();
    }
}
