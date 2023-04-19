package com.attendence.employee.repositories;

import com.attendence.employee.entites.Department;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DeptRepo extends MongoRepository<Department,String> {
    Department findByDeptName(String name);
}
