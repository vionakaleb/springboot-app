package com.squad8.demo.service;

import com.squad8.demo.model.entity.Employee;
import com.squad8.demo.model.request.EmployeeRequest;
import com.squad8.demo.model.response.EmployeeResponse;
import com.squad8.demo.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service

public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public EmployeeResponse getEmployee(EmployeeRequest request) {
        Optional<Employee> employeeOptional = employeeRepository.findById(request.getId())

        if (employee.isEmpty()) {
            throw new RuntimeException("Employee not found");
        }

        Employee employee = employeeOptional.get();

        EmployeeResponse response = new EmployeeResponse();
        response.setName(employee.getName());
        response.setName(employee.getPosition());
    }
}
