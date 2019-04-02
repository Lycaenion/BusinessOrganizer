package com.lycaenion.businessorganizer.repositories;

import com.lycaenion.businessorganizer.entities.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepository extends JpaRepository<Integer, Invoice> {
}
