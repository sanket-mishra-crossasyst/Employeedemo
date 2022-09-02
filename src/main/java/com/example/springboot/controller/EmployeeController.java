package com.example.springboot.controller;

import com.example.springboot.model.Employee;
import com.example.springboot.model.EmployeeResponse;
import org.springframework.web.bind.annotation.*;
import xyz.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @GetMapping(path = "/employees/{employeeId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Employee> getEmployee(@PathVariable long employeeId) {
        Employee emp = employeeService.getEmployee(1L);
        return new ResponseEntity<>(emp, HttpStatus.OK);
    }
    @PostMapping(path = "/employees",consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<EmployeeResponse> createEmployee(@RequestBody Employee employee) {
        EmployeeResponse employeeResponse= employeeService.createEmployee(employee);
        return new ResponseEntity<>(employeeResponse, HttpStatus.OK);
    }
}
