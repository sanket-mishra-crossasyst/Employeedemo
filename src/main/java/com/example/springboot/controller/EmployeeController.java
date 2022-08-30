package com.example.springboot.controller;

import com.example.springboot.model.Employee;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @GetMapping(path = "/Employees/{employeeId}",produces = MediaType.APPLICATION_JSON_VALUE)
         public ResponseEntity<Employee> getEmployee(@PathVariable long employeeId)
         {
             Employee emp = new Employee("Sanket","Mishra");
             return new ResponseEntity<>(emp, HttpStatus.OK);
         }
}
