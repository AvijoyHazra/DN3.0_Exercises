package com.springorm.employeemanagementsystem.db2.repository;

import com.springorm.employeemanagementsystem.db2.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepositorydb2 extends JpaRepository<Department,Integer> {
    public Department findDepartmentById(int id);
}