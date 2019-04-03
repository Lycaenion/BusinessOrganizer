package com.lycaenion.businessorganizer.repositories;

import com.lycaenion.businessorganizer.entities.SupplierInvoice;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.Set;

public interface SupplierInvoiceRepository extends JpaRepository<SupplierInvoice, Long> {

    boolean existsByOcr(String ocr);

    boolean existsByMessage(String message);

    SupplierInvoice findByMessage(String message);

    SupplierInvoice getByOcr(String ocr);

    Set<SupplierInvoice> getByPayedDate(LocalDate payedDate);

    Set<SupplierInvoice> findAllByBankGiro(String bankGiro);

    Set<SupplierInvoice>findAllBySupplier(String Supplier);


}
