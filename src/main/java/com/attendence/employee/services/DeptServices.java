package com.attendence.employee.services;

import com.attendence.employee.entites.Department;
import com.attendence.employee.entites.Employee;

import java.util.List;

public interface DeptServices {

     Department getDepartmentByName(String name);
     List<Employee> getAllEmployee(Department dept);
     Department saveDepartment(Department dept);
     List<Department> getAllDepartment();
}
