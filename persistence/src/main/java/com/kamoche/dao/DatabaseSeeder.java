package com.kamoche.dao;

import com.kamoche.domain.Employee;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DatabaseSeeder implements CommandLineRunner {
    private EmployeeRepository employeeRepository;

    public DatabaseSeeder(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Employee linda = new Employee("Linda", "Karan");
        Employee kamoche = new Employee("Kamoche", "Jackson");

        List<Employee> employees = new ArrayList<>();
        employees.add(linda);
        employees.add(kamoche);

        this.employeeRepository.saveAll(employees);

    }
}
