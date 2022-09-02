package xyz.demo.service;

import com.example.springboot.model.Employee;
import com.example.springboot.model.EmployeeResponse;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
@Log4j2
public class EmployeeService {
    public    Employee getEmployee(Long employeeId) {
           Employee emp = new Employee("Sanket", "Mishra");
           return emp;
       }
    public EmployeeResponse createEmployee(Employee employee) {
        int id =new Random().nextInt();
        EmployeeResponse employeeService = new EmployeeResponse();
        employeeService.setId(id);
       log.info("Employee Name is {} {}",employee.getFirstName(),employee.getLastName());
        return employeeService;
    }
}
