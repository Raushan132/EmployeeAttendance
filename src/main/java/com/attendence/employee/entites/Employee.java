package com.attendence.employee.entites;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.List;

@Data
@Document
public class Employee {
    @Id
    private String id;
    private String name;
    private String email;

    @DBRef
    List<Address> address;

    @DBRef
    Department department;



}
