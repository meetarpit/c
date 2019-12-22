package com.dynamisch.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.dynamisch.demo.model.Employee;
import com.dynamisch.demo.service.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
@GetMapping("/login")
public String login(Model model,Employee emp,HttpServletRequest req) {
	HttpSession session1=req.getSession();
	model.addAttribute("emp",new Employee());
	return "login";	
}
@PostMapping("/dologin")
public String doLogin(Employee emp,Model model) {
	boolean result=loginService.validate(emp);
	if(result==true) {
		return "redirect:/list";
	}
	model.addAttribute("emp",new Employee());
	return "login";	
}
@GetMapping("/logout")
public String logout(Model model,HttpServletRequest req,Model model1) {
	HttpSession session1=req.getSession();
	session1.invalidate();
	model1.addAttribute("emp",new Employee());
	return "login";
	
}

}
