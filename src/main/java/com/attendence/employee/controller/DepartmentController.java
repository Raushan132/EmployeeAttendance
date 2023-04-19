package com.attendence.employee.controller;

import com.attendence.employee.entites.Department;
import com.attendence.employee.entites.Employee;
import com.attendence.employee.repositories.DeptRepo;
import com.attendence.employee.services.DeptServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/dept")
public class DepartmentController {


    @Autowired
    private DeptServices deptServices;
     public List<Employee> getAllEmployee(@RequestBody Department dept){
         return deptServices.getAllEmployee(dept);
     }

     public Department saveDept(@RequestBody Department dept){
         return deptServices.saveDepartment(dept);
     }

     public List<Department> getAllDept(){
         return deptServices.getAllDepartment();
     }
}
