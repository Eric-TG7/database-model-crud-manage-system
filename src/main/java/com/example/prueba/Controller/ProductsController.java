package com.example.prueba.Controller;

import com.example.prueba.Entity.Product;
import com.example.prueba.Entity.Shipper;
import com.example.prueba.Service.ProductService;
import com.example.prueba.Service.ShipperService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class ProductsController {
    private final ProductService productService;
    @PostMapping("/product")
    void saveProductRepository(@RequestBody Product product) {
        productService.save(product);
    }

}
