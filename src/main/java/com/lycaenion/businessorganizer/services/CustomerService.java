package com.lycaenion.businessorganizer.services;

import com.lycaenion.businessorganizer.dto.CustomerRequest;
import com.lycaenion.businessorganizer.entities.Customer;

public interface CustomerService {

    String saveCustomer(Customer customer);

    Customer editCustomer(Customer customer);

    Customer fetchCustomerByNameOrId(CustomerRequest customerRequest);
}
