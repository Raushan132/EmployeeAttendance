package com.attendence.employee.repositories;

import com.attendence.employee.entites.Address;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AddressRepo extends MongoRepository<Address,String> {
}
