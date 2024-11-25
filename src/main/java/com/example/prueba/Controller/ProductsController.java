package com.example.prueba.Controller;

import com.example.prueba.Entity.Category;
import com.example.prueba.Entity.Product;
import com.example.prueba.Entity.Shipper;
import com.example.prueba.Service.ProductService;
import com.example.prueba.Service.ShipperService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class ProductsController {
    private final ProductService productService;
    @PostMapping("/product")
    void saveProductRepository(@RequestBody Product product) {
        productService.save(product);
    }
    @GetMapping("/product2")
    public ResponseEntity<List<Product>> returnCategoryRepository(){
        return new ResponseEntity<List<Product>>(productService.findAll(),null, HttpStatus.CREATED);
    }

}
