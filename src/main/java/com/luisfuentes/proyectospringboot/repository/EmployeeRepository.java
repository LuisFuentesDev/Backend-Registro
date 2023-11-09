package com.luisfuentes.proyectospringboot.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luisfuentes.proyectospringboot.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, String>{

	Optional<Employee> findByEmail(String email);

}
