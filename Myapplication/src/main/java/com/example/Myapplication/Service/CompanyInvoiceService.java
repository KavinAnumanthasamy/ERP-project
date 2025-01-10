package com.example.Myapplication.Service;


import com.example.Myapplication.Entity.CompanyInvoice;
import com.example.Myapplication.Repository.CompanyInvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyInvoiceService {

    @Autowired
    CompanyInvoiceRepository companyInvoiceRepository;

    public List<CompanyInvoice> getAllInvoices() {
        return companyInvoiceRepository.findAll();
    }

    public CompanyInvoice createInvoice(CompanyInvoice companyInvoice) {
        return companyInvoiceRepository.save(companyInvoice);
    }

    public CompanyInvoice getInvoiceById(Long id) {
        return companyInvoiceRepository.findById(id).orElse(null);
    }

    public void deleteInvoice(Long id) {
        companyInvoiceRepository.deleteById(id);
    }
}

