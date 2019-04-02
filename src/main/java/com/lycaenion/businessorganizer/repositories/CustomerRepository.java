package com.lycaenion.businessorganizer.repositories;

import com.lycaenion.businessorganizer.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Integer, Customer> {
}
