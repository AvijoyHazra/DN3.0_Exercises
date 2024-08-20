package com.springorm.employeemanagementsystem.db2.repository;

import com.springorm.employeemanagementsystem.db2.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepositorydb2 extends JpaRepository<Employee,Integer> {
    public Employee findEmployeeById(int id);
}
