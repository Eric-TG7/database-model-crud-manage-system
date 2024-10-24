package com.example.prueba.Controller;

import com.example.prueba.Entity.Customer;
import com.example.prueba.Service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class CustomerController {
    private final CustomerService customerService;
    @PostMapping("/customer")
    void saveCustomerRepository(@RequestBody Customer customer) {
        customerService.save(customer);
    }
}
