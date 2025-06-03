package com.squad8.demo.controller;

import com.squad8.demo.model.request.EmployeeRequest;
import com.squad8.demo.model.response.EmployeeResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")

public class EmployeeController {


    @GetMapping("");
    public EmployeeResponse getEmployee(@RequestParam() String id) {
        EmployeeRequest request = new EmployeeRequest();
        request.se
    }
}
