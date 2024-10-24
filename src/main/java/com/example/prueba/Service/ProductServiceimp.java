package com.example.prueba.Service;

import com.example.prueba.Entity.Product;
import com.example.prueba.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceimp extends CrudServiceImp<Product,Long> implements ProductService{
    @Autowired
    private ProductRepository productRepository;
    @Override
    protected JpaRepository<Product,Long> getRepository() {
        return productRepository;
    }
}
