package com.springorm.employeemanagementsystem.db1.repository;

import com.springorm.employeemanagementsystem.db1.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Integer> {
    public Department findDepartmentById(int id);
}
