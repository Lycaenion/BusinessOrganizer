package com.lycaenion.businessorganizer.repositories;

import com.lycaenion.businessorganizer.entities.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface InvoiceRepository extends JpaRepository<Invoice, Integer> {

    Set<Invoice> findAllByCustomer_CustomerId(int customerId);
    Set<Invoice> findAllByCustomer_CustomerIdAndIsPaidIsTrue(int customerId);
    Set<Invoice> findAllByCustomer_CustomerIdAndIsPaidIsFalse(int customerId);
}
