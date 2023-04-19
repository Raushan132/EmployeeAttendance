package com.attendence.employee.repositories;

import com.attendence.employee.entites.Department;
import com.attendence.employee.entites.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepo extends MongoRepository<Employee,String> {


    Optional<Employee> findByEmail(String email);
    List<Employee> findAllByDepartment(Department department);
}
