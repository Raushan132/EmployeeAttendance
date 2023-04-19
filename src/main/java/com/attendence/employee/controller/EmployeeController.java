package com.attendence.employee.controller;

import com.attendence.employee.entites.Employee;
import com.attendence.employee.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public Employee getEmployee(@RequestBody Employee empl){
        System.out.println(empl);
         return employeeService.getEmployee(empl.getEmail()) ;
    }

    @PostMapping
    public Employee saveEmployee(@RequestBody Employee employee){
        return employeeService.saveEmployee(employee);
    }
}
