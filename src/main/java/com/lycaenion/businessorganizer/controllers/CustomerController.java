package com.lycaenion.businessorganizer.controllers;

import com.lycaenion.businessorganizer.dto.CustomerRequest;
import com.lycaenion.businessorganizer.entities.Customer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {

    @RequestMapping("/addCustomer")
    private String addCustomer(@RequestBody Customer customer){
        return null;
    }

    @RequestMapping("/editCustomer")
    private ResponseEntity<Customer> editCustomer(@RequestBody Customer customer){
        return null;
    }

    @RequestMapping("/getCustomer")
    private ResponseEntity<Customer> getCustomerByNameOrId(@RequestBody CustomerRequest customerRequest){

        return null;
    }

}
