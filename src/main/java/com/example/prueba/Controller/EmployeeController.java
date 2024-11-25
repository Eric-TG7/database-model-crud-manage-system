package com.example.prueba.Controller;

import com.example.prueba.Entity.Category;
import com.example.prueba.Entity.Employee;
import com.example.prueba.Service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class EmployeeController {
    private final EmployeeService employeeService;
    @PostMapping("/employee")
    void saveEmployeeRepository(@RequestBody Employee employee) {
        employeeService.save(employee);
    }
    @GetMapping("/employee2")
    public ResponseEntity<List<Employee>> returnCategoryRepository(){
        return new ResponseEntity<List<Employee>>(employeeService.findAll(),null, HttpStatus.CREATED);
    }

}
