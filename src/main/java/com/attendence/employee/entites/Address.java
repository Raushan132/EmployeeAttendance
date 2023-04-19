package com.attendence.employee.entites;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Data
@Document
public class Address {
    @Id
    private  String AddressId;
    private String state;
    private String pincode;
    private String city;


}
