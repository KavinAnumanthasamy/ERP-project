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
    @GetMapping("/{id}")
    public ResponseEntity<CompanyInvoice> getInvoiceById(@PathVariable Long id) {
        CompanyInvoice companyInvoice = companyInvoiceService.getInvoiceById(id);

        if (companyInvoice != null) {
            return new ResponseEntity<>(companyInvoice, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteInvoice(@PathVariable Long id) {
        companyInvoiceService.deleteInvoice(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

