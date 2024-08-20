package com.springorm.employeemanagementsystem.db1.repository;

import com.springorm.employeemanagementsystem.db1.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
