package com.kamoche.web;

import com.kamoche.dao.EmployeeRepository;
import com.kamoche.domain.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    private EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }


    @GetMapping(value = {"","/"})
    public String index(){
        return "Welcome to spring boot multiple modules";
    }
    @GetMapping("/employees")
    public List<Employee> getEmployees(){
        List<Employee> employees = this.employeeRepository.findAll();
        return employees;
    }


}
