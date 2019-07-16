package com.lycaenion.businessorganizer.services;

import com.lycaenion.businessorganizer.entities.Invoice;

public interface InvoiceService {

    String saveInvoice(Invoice invoice);

    Invoice fetchInvoice(int id);

    String ChangeInvoiceStatus(int id);
}
