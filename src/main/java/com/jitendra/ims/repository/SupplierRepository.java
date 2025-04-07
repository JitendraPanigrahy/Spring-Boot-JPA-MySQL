package com.jitendra.ims.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jitendra.ims.model.Supplier;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Long> {
}