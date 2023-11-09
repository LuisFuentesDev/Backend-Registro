package com.luisfuentes.proyectospringboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luisfuentes.proyectospringboot.model.Employee;
import com.luisfuentes.proyectospringboot.service.EmployeeService;

@RestController
@RequestMapping("api/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping
	public List<Employee> getAllEmployee(){
		return employeeService.getAllEmployee();
	}
	@GetMapping("{email}")
	public Employee searchEmployeeById(@PathVariable("email") String email) {
		return employeeService.getEmployeeByEmail(email);
	}
	@PostMapping
	public Employee createEmployee(@RequestBody Employee employee) {
		return employeeService.createEmployee(employee);
	}
}
