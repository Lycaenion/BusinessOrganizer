package com.lycaenion.businessorganizer.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/invoices")
public class InvoiceController {

    @RequestMapping("/greeting")
    private String greeting(){
        return "Hello from invoice";
    }

}
