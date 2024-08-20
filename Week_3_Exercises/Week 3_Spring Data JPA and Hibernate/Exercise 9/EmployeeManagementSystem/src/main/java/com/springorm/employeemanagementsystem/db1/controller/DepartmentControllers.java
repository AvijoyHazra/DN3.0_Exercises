package com.springorm.employeemanagementsystem.db1.controller;

import com.springorm.employeemanagementsystem.db1.entity.Department;
import com.springorm.employeemanagementsystem.db1.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentControllers {
    @Autowired
    private DepartmentRepository departmentRepository;
    @PostMapping("/department/db1")
    public Department createDepartment(@RequestBody Department department){
        return departmentRepository.save(department);
    }
    @GetMapping("/department/db1")
    public List<Department> getDepartments(){
        return departmentRepository.findAll();
    }
    @DeleteMapping("/department/db1/id/{id}")
    public void deleteDepartmentById(@PathVariable int id){
        departmentRepository.deleteById(id);
    }
    @PutMapping("/department/db1/id/{id}")
    public Department updateDepartmentById(@PathVariable int id,@RequestBody Department department) {
        department.setId(id);
        return departmentRepository.save(department);
    }
    @GetMapping("/department/db1/id/{id}")
    public Department getDepartmentById(@PathVariable int id){
        return departmentRepository.findDepartmentById(id);
   }
}
