package com.attendence.employee.entites;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Document
public class Department {
    @Id
    private String deptId;
    private String deptName;
}
