package com.dynamisch.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.dynamisch.demo.model.Employee;
import com.dynamisch.demo.repo.EmpRepository;

@Controller
public class EmpController {
	
	@Autowired
	EmpRepository empRepo;

	@GetMapping("/")
	public String register(Model model) {
		model.addAttribute("emp",new Employee());
		return "home";		
	}
	@PostMapping("/create")
	public String create(Employee emp) {
		empRepo.save(emp);
		return "redirect:/list";	
	}
	@GetMapping("/list")
	public String list(Model model) {
		List<Employee>emp=empRepo.findAll();
		model.addAttribute("emp",emp);
		return "list";		
	}
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id")int id,Model model) {
		Employee emp=empRepo.findById(id).orElse(new Employee());
		model.addAttribute("emp",emp);
		return "edit";	
	}
	@PostMapping("/update")
	public String update(Employee emp) {
		empRepo.save(emp);
		return "redirect:/list";		
	}
	@ModelAttribute("map")
	public Map<String,String> getAge(){
		Map<String,String>map=new HashMap<>();
		map.put("Between 18-25","Between 18-25");
		map.put("Between 25-50","Between 25-50");
		map.put("Above 50","Above 50");
		return map;	
	}
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable("id") int id,Employee emp) {
		empRepo.delete(emp);
		return "redirect:/list";		
	}
}
