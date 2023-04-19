package com.attendence.employee.services;

import com.attendence.employee.entites.Employee;


public interface EmployeeService {
    Employee saveEmployee(Employee empl);
    Employee getEmployee(String email);
}
