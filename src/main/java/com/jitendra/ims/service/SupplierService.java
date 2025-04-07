package com.jitendra.ims.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jitendra.ims.model.Supplier;
import com.jitendra.ims.repository.SupplierRepository;

@Service
public class SupplierService {
    @Autowired
    private SupplierRepository supplierRepository;

    public Supplier saveSupplier(Supplier supplier) {
        return supplierRepository.save(supplier);
    }

    public List<Supplier> getAllSuppliers() {
        return supplierRepository.findAll();
    }
}