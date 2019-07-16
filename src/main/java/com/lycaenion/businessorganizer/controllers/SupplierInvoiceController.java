package com.lycaenion.businessorganizer.controllers;

import com.lycaenion.businessorganizer.entities.SupplierInvoice;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/supplierInvoices")
public class SupplierInvoiceController {

    @RequestMapping("/addSupplierInvoice")
    private String addSupplierInvoice(@RequestBody SupplierInvoice supplierInvoice){
        return null;
    }

}
