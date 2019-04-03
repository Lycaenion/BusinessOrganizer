package com.lycaenion.businessorganizer.repositories;

import com.lycaenion.businessorganizer.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    Customer findByName(String name);
}
