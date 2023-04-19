package com.attendence.employee.services;

import com.attendence.employee.entites.Department;
import com.attendence.employee.entites.Employee;
import com.attendence.employee.repositories.DeptRepo;
import com.attendence.employee.repositories.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptImp implements  DeptServices{

    @Autowired
    private DeptRepo deptRepo;

    @Autowired
    private EmployeeRepo employeeRepo;

    @Override
    public Department getDepartmentByName(String name) {
        return deptRepo.findByDeptName(name);
    }

    @Override
    public List<Employee> getAllEmployee(Department dept) {
          List<Employee> employees= employeeRepo.findAllByDepartment(dept);
        return employees;
    }

    @Override
    public Department saveDepartment(Department dept) {
       return deptRepo.save(dept);

    }

    @Override
    public List<Department> getAllDepartment() {
        return deptRepo.findAll();
    }
}
