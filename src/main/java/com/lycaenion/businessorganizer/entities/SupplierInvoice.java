package com.lycaenion.businessorganizer.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@Table(name="SupplierInvoices")
public class SupplierInvoice {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long supplierInvoiceId;
    @NotNull
    private int sum;
    @NotNull
    private LocalDate payedDate;
    @NotNull
    private String bankGiro;
    @NotNull
    private String supplier;

    private String ocr;
    private String message;

    public long getSupplierInvoiceId() {
        return supplierInvoiceId;
    }

    public void setSupplierInvoiceId(long supplierInvoiceId) {
        this.supplierInvoiceId = supplierInvoiceId;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public LocalDate getPayedDate() {
        return payedDate;
    }

    public void setPayedDate(LocalDate payedDate) {
        this.payedDate = payedDate;
    }

    public String getBankGiro() {
        return bankGiro;
    }

    public void setBankGiro(String bankGiro) {
        this.bankGiro = bankGiro;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getOcr() {
        return ocr;
    }

    public void setOCR(String ocr) {
        this.ocr = ocr;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
