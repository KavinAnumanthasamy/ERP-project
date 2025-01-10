package com.example.Myapplication.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
@Entity
@Data
public class CompanyInvoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public Date invoiceDate;
    public double amount;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee; // Employee who created the invoice

    // Constructors, getters, and setters
    public CompanyInvoice() {}

    public CompanyInvoice(Date invoiceDate, double amount, Employee employee) {
        this.invoiceDate = invoiceDate;
        this.amount = amount;
        this.employee = employee;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}

