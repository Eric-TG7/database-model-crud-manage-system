package com.example.prueba.Controller;

import com.example.prueba.Entity.Category;
import com.example.prueba.Entity.Customer;
import com.example.prueba.Service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class CustomerController {
    private final CustomerService customerService;
    @PostMapping("/customer")
    void saveCustomerRepository(@RequestBody Customer customer) {
        customerService.save(customer);
    }
    @GetMapping("/customer2")
    public ResponseEntity<List<Customer>> returnCategoryRepository(){
        return new ResponseEntity<List<Customer>>(customerService.findAll(),null, HttpStatus.CREATED);
    }
}
