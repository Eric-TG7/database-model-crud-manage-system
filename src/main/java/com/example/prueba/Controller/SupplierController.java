package com.example.prueba.Controller;

import com.example.prueba.Entity.Category;
import com.example.prueba.Entity.Supplier;
import com.example.prueba.Service.SupplierService;
import com.example.prueba.Service.SupplierServiceImp;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class SupplierController {
    private final SupplierService supplierService;// interface
    @PostMapping("/supplier")
    void supplierServiceSave(@RequestBody Supplier supplier) {
        supplierService.save(supplier);
    }
    @GetMapping("/supplier2")
    public ResponseEntity<List<Supplier>> returnCategoryRepository(){
        return new ResponseEntity<List<Supplier>>(supplierService.findAll(),null, HttpStatus.CREATED);
    }
}
