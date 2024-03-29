package com.EmployeeManagementSystem.demo.repository;


import com.EmployeeManagementSystem.demo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
