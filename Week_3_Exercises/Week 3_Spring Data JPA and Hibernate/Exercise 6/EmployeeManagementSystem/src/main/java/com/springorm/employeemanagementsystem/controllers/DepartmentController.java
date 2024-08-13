package com.springorm.employeemanagementsystem.controllers;

import com.springorm.employeemanagementsystem.dao.DepartmentRepository;
import com.springorm.employeemanagementsystem.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentRepository departmentRepository;
    @PostMapping("/department")
    public Department createDepartment(@RequestBody Department department){
        return departmentRepository.save(department);
    }
    @GetMapping("/department")
    public List<Department> getDepartments(){
        return departmentRepository.findAll();
    }
    @GetMapping("/department/id/{id}")
    public Department getDepartmentById(@PathVariable int id){
        return departmentRepository.findDepartmentById(id);
    }
    @DeleteMapping("/department/id/{id}")
    public void deleteDepartmentById(@PathVariable int id){
        departmentRepository.deleteById(id);
    }
    @GetMapping("/department/name/{name}")
    public List<Department> getDepartmentByName(@PathVariable String name){
        return departmentRepository.findDepartmentByName(name);
    }
    @PutMapping("/department/id/{id}")
    public Department updateDepartmentById(@PathVariable int id,@RequestBody Department department){
        department.setId(id);
        return departmentRepository.save(department);
    }

    @GetMapping("/department/custom/name/{name}")
    public List<Department> getByName(@PathVariable String name){
        return departmentRepository.findByName(name);
    }
    @GetMapping("/department/custom/developer")
    public List<Department> getDepartmentDeveloper(){
        return departmentRepository.findDepartmentNameContainingDeveloper();
    }

}
