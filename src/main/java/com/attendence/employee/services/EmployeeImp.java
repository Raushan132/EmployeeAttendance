package com.attendence.employee.services;

import com.attendence.employee.entites.Address;
import com.attendence.employee.entites.Department;
import com.attendence.employee.entites.Employee;
import com.attendence.employee.repositories.AddressRepo;
import com.attendence.employee.repositories.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeImp implements EmployeeService{

    @Autowired
    private EmployeeRepo emplRepo;

    @Autowired
    private AddressRepo addressRepo;

    @Autowired
    private DeptServices deptServices;

    @Override
    public Employee saveEmployee(Employee empl) {

        List<Address> addresses= empl.getAddress();
        addresses.stream().forEach(address->saveAddress(address));

        Department dept= empl.getDepartment();
        deptServices.saveDepartment(dept);

        empl= emplRepo.save(empl);
        return empl;
    }

    @Override
    public Employee getEmployee(String email) {
        System.out.println(email);
        Employee empl= emplRepo.findByEmail(email).orElseThrow();
        return empl;
    }

    private void saveAddress(Address address){
            addressRepo.save(address);
    }
}
