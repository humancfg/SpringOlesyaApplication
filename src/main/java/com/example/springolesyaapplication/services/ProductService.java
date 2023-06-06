package com.example.springolesyaapplication.services;

import com.example.springolesyaapplication.models.Product;
import com.example.springolesyaapplication.repositories.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//@Transactional(readOnly = true)
@AllArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public List<Product> getAllProduct(){
        return productRepository.findAll();
    }

    public void saveProduct(Product product){
        productRepository.save(product);
    }

}
