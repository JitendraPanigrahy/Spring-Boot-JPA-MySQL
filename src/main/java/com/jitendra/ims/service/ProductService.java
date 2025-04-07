package com.jitendra.ims.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jitendra.ims.model.Product;
import com.jitendra.ims.repository.ProductRepository;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

	
	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}
	 

    public Product addOrUpdateProduct(Product product) {
        return productRepository.save(product);
    }
    
    
}