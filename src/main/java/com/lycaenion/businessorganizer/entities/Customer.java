package com.lycaenion.businessorganizer.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
@Table(name = "Customers")
public class Customer {

    @Id
    @NotNull
    private int customerId;
    @NotNull
    private String name;
    @NotNull
    private String Address;
    @NotNull
    private String zipCOde;
    @NotNull
    private String city;
    @NotNull
    private String reference;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private Set<Invoice> invoices;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getZipCOde() {
        return zipCOde;
    }

    public void setZipCOde(String zipCOde) {
        this.zipCOde = zipCOde;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Set<Invoice> getInvoices() {
        return invoices;
    }

    public void setInvoices(Set<Invoice> invoices) {
        this.invoices = invoices;
    }
}
