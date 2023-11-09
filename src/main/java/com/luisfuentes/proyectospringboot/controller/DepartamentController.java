package com.luisfuentes.proyectospringboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luisfuentes.proyectospringboot.model.Departament;
import com.luisfuentes.proyectospringboot.service.DepartamentService;

@RestController
@RequestMapping("api/departament")
public class DepartamentController {

	@Autowired
	private DepartamentService departamentService;
	
	@PostMapping
	public Departament createDepartament(@RequestBody Departament departament) {
		return departamentService.createDepartament(departament);
	}
	@GetMapping("{id}")
	public Departament searchDepartamentById(@PathVariable("id") Long id) {
		return departamentService.getDepartamentById(id);
	}
	@GetMapping
	public List<Departament> getAllDepartament(){
		return departamentService.getAllDepartament();
	}
	
	
}
