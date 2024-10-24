package com.example.prueba.Service;

import com.example.prueba.Entity.Employee;
import com.example.prueba.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImp extends CrudServiceImp<Employee,Long> implements EmployeeService{
    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    protected JpaRepository<Employee, Long> getRepository() {
        return employeeRepository;
    }
}
