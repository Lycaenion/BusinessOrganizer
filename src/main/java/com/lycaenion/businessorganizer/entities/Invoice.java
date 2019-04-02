package com.lycaenion.businessorganizer.entities;

import org.springframework.data.convert.JodaTimeConverters;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@Table(name = "Invoices")
public class Invoice {

    @Id
    private int invoiceId;
    @NotNull
    private LocalDate dateOfInvoice;
    @NotNull
    private LocalDate dueDateInvoice;
    @NotNull
    private boolean isPaid;
    @NotNull
    private long totalAmount;

    private LocalDate paidDate;

    @ManyToOne
    @JoinColumn
    private Customer customer;

    public int getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(int invoiceId) {
        this.invoiceId = invoiceId;
    }

    public LocalDate getDateOfInvoice() {
        return dateOfInvoice;
    }

    public void setDateOfInvoice(LocalDate dateOfInvoice) {
        this.dateOfInvoice = dateOfInvoice;
    }

    public LocalDate getDueDateInvoice() {
        return dueDateInvoice;
    }

    public void setDueDateInvoice(LocalDate dueDateInvoice) {
        this.dueDateInvoice = dueDateInvoice;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    public long getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(long totalAmount) {
        this.totalAmount = totalAmount;
    }

    public LocalDate getPaidDate() {
        return paidDate;
    }

    public void setPaidDate(LocalDate paidDate) {
        this.paidDate = paidDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
