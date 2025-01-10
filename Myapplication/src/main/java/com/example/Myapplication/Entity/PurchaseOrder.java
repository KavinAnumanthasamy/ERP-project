package com.example.Myapplication.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class PurchaseOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String supplierName;
    public Date orderDate;
    public double amount;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee; // Employee who placed the order

    // Constructors, getters, and setters
    public PurchaseOrder() {}

    public PurchaseOrder(String supplierName, Date orderDate, double amount, Employee employee) {
        this.supplierName = supplierName;
        this.orderDate = orderDate;
        this.amount = amount;
        this.employee = employee;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
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
