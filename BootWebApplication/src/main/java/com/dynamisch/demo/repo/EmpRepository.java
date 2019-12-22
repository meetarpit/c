package com.dynamisch.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dynamisch.demo.model.Employee;

public interface EmpRepository extends JpaRepository<Employee, Integer>{

}
