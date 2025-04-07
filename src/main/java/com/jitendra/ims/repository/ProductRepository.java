package com.jitendra.ims.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jitendra.ims.model.Product;


@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
