package com.c0d3rj.citizenserver.model;

import javax.persistence.*;

@Entity
@Table(name = "citi_data_4")
public class Citizens {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Lob
    @Column(name = "SURNAME")
    private String surname;

    @Lob
    @Column(name = "NAME")
    private String name;

    @Lob
    @Column(name = "NRN")
    private String nrn;

    @Lob
    @Column(name = "GENDER")
    private String gender;

    @Column(name = "DOB")
    private String dob;

    @Lob
    @Column(name = "RS")
    private String rs;

    @Lob
    @Column(name = "CONSTITUENCY")
    private String constituency;

    @Lob
    @Column(name = "PD")
    private String pd;

    @Lob
    @Column(name = "ADDRESS")
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPd() {
        return pd;
    }

    public void setPd(String pd) {
        this.pd = pd;
    }

    public String getConstituency() {
        return constituency;
    }

    public void setConstituency(String constituency) {
        this.constituency = constituency;
    }

    public String getRs() {
        return rs;
    }

    public void setRs(String rs) {
        this.rs = rs;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNrn() {
        return nrn;
    }

    public void setNrn(String nrn) {
        this.nrn = nrn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}