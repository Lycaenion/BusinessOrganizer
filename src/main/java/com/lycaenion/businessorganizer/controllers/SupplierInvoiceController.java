package com.lycaenion.businessorganizer.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/supplierInvoices")
public class SupplierInvoiceController {

    @RequestMapping("/greeting")
    private String greeting(){
        return "Hello from supplierInvoice";
    }


}
