package com.example.Myapplication.Repository;

import com.example.Myapplication.Entity.CompanyInvoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyInvoiceRepository extends JpaRepository<CompanyInvoice, Long> {
}
