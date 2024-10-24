package com.example.prueba.Controller;

import com.example.prueba.Entity.Employee;
import com.example.prueba.Service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class EmployeeController {
    private final EmployeeService employeeService;
    @PostMapping("/employee")
    void saveEmployeeRepository(@RequestBody Employee employee) {
        employeeService.save(employee);
    }

}
