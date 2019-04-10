package com.lycaenion.businessorganizer.controllers;

import com.lycaenion.businessorganizer.entities.Invoice;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/invoices")
public class InvoiceController {

    @RequestMapping("/addInvoice")
    private ResponseEntity<String> addInvoice(@RequestBody Invoice invoice){
        return null;
    }

    @RequestMapping("/getInvoiceById")
    private ResponseEntity<Invoice> getInvoice(@RequestBody int id){
        return null;
    }

    @RequestMapping("/changeToPaid")
    private ResponseEntity<String> changeInvoiceToPaid(@RequestBody int id){
        return null;
    }

}
