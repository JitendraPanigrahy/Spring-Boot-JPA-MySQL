package com.jitendra.ims.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jitendra.ims.model.Supplier;
import com.jitendra.ims.service.SupplierService;

@RestController
@RequestMapping("/supplier")
public class SupplierController {
    @Autowired
    private SupplierService supplierService;

    @PostMapping("/add")
    public Supplier addSupplier(@RequestBody Supplier supplier) {
        return supplierService.saveSupplier(supplier);
    }

    @GetMapping("/all")
    public List<Supplier> getAllSuppliers() {
        return supplierService.getAllSuppliers();
    }
}