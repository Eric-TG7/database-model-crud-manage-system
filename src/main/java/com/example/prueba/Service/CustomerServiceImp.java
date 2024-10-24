package com.example.prueba.Service;

import com.example.prueba.Entity.Customer;
import com.example.prueba.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImp extends CrudServiceImp<Customer,Long> implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    @Override
    protected JpaRepository<Customer, Long> getRepository() {
        return customerRepository;
    }
}
