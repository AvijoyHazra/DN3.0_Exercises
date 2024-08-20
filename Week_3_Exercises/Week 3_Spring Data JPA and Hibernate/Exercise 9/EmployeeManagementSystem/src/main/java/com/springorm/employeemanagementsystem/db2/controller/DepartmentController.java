package com.springorm.employeemanagementsystem.db2.controller;

import com.springorm.employeemanagementsystem.db2.entity.Department;
import com.springorm.employeemanagementsystem.db2.repository.DepartmentRepositorydb2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentRepositorydb2 departmentRepository;
    @PostMapping("/department/db2")
    public Department createDepartment(@RequestBody Department department){
        return departmentRepository.save(department);
    }
    @GetMapping("/department/db2")
    public List<Department> getDepartments(){
        return departmentRepository.findAll();
    }
    @DeleteMapping("/department/db2/id/{id}")
    public void deleteDepartmentById(@PathVariable int id){
        departmentRepository.deleteById(id);
    }
    @PutMapping("/department/db2/id/{id}")
    public Department updateDepartmentById(@PathVariable int id,@RequestBody Department department) {
        department.setId(id);
        return departmentRepository.save(department);
    }
    @GetMapping("/department/db2/id/{id}")
    public Department getDepartmentById(@PathVariable int id){
        return departmentRepository.findDepartmentById(id);
    }
}
