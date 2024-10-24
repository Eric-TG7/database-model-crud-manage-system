package com.example.prueba.Controller;

import com.example.prueba.Entity.Supplier;
import com.example.prueba.Service.SupplierService;
import com.example.prueba.Service.SupplierServiceImp;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class SupplierController {
    private final SupplierService supplierService;// interface
    @PostMapping("/supplier")
    void supplierServiceSave(@RequestBody Supplier supplier) {
        supplierService.save(supplier);
    }




}
