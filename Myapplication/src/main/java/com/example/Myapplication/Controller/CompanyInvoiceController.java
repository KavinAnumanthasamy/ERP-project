package com.example.Myapplication.Controller;
import com.example.Myapplication.Entity.CompanyInvoice;
import com.example.Myapplication.Service.CompanyInvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/invoices")
public class CompanyInvoiceController {

    @Autowired
    private CompanyInvoiceService companyInvoiceService;

    @GetMapping
    public List<CompanyInvoice> getAllInvoices() {
        return companyInvoiceService.getAllInvoices();
    }

    @PostMapping
    public ResponseEntity<CompanyInvoice> createInvoice(@RequestBody CompanyInvoice companyInvoice) {
        CompanyInvoice createdInvoice = companyInvoiceService.createInvoice(companyInvoice);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdInvoice);
    }
}

