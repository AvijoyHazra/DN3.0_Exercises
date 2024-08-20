package com.springorm.employeemanagementsystem.db2.controller;

import com.springorm.employeemanagementsystem.db2.entity.Employee;
import com.springorm.employeemanagementsystem.db2.repository.EmployeeRepositorydb2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class EmployeeController {
    @Autowired
    private EmployeeRepositorydb2 employeeRepository;
    @GetMapping("/employee/db2/id/{id}")
    public Employee getEmployeeById(@PathVariable int id){
        return employeeRepository.findEmployeeById(id);
    }
    @PostMapping("/employee/db2")
    public Employee createEmployee(@RequestBody Employee employee){
        return employeeRepository.save(employee);
    }
    @GetMapping("/employee/db2")
    public List<Employee> getAllEmployee(){
        return employeeRepository.findAll();
    }
    @DeleteMapping("/employee/db2/id/{id}")
    public void deleteEmployee(@PathVariable int id){
        employeeRepository.deleteById(id);
    }
    @PutMapping("/employee/db2/id/{id}")
    public Employee updateEmployee(@PathVariable int id,@RequestBody Employee employee){
        employee.setId(id);
        return employeeRepository.save(employee);
    }
}
