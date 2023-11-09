package com.luisfuentes.proyectospringboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luisfuentes.proyectospringboot.model.Employee;
import com.luisfuentes.proyectospringboot.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public Employee createEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}
	public Employee getEmployeeByEmail(String email) {
		Optional<Employee> optionalEmployee = employeeRepository.findByEmail(email);
		return optionalEmployee.get();
	}
	public List<Employee> getAllEmployee(){
		return employeeRepository.findAll();
	}
}
