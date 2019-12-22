package com.dynamisch.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dynamisch.demo.model.Employee;
import com.dynamisch.demo.repo.EmpRepo;

@RestController
public class EmpController {
	
	@Autowired
	EmpRepo empRepo;
	
	@GetMapping("/emp")
	public List<Employee> list() {
		return empRepo.findAll();	
	}
	@GetMapping("/emp/{id}")
	public Optional<Employee> listById(@PathVariable("id") int id) {
		return empRepo.findById(id);		
	}
	@PostMapping("/emp")
	public Employee create(Employee emp) {
		Employee emp1=empRepo.save(emp);
		return emp1;		
	}
	@PutMapping("/emp")
	public Employee update(Employee emp) {
		Employee emp1=empRepo.save(emp);
		return emp1;		
	}
	@DeleteMapping("/emp/{id}")
	public String delete(@PathVariable("id") int id,Employee emp) {
		empRepo.delete(emp);
		return "deleted";
		
	}

}
