package com.lycaenion.businessorganizer.repositories;

import com.lycaenion.businessorganizer.entities.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface InvoiceRepository extends JpaRepository<Invoice, Integer> {
}
