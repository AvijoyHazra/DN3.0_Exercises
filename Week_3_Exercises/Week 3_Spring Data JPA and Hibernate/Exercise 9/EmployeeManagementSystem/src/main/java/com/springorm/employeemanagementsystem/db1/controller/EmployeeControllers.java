package com.springorm.employeemanagementsystem.db1.controller;

import com.springorm.employeemanagementsystem.db1.entity.Employee;
import com.springorm.employeemanagementsystem.db1.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeControllers {
    @Autowired
    private EmployeeRepository employeeRepository;
    @GetMapping("/employee/db1")
    public List<Employee> getAllemployees()
    {
        return employeeRepository.findAll();
    }
    @PostMapping("/employee/db1")
    public Employee createEmployee(@RequestBody Employee employee){
        return employeeRepository.save(employee);
    }
    @PutMapping("/employee/db1/id/{id}")
    public Employee updateEmployee(@PathVariable int id, @RequestBody Employee employee){
        employee.setId(id);
        return employeeRepository.save(employee);
    }

    @DeleteMapping("/employee/db1/id/{id}")
    public void deleteEmployee(@PathVariable int id){
        employeeRepository.deleteById(id);
    }
}
