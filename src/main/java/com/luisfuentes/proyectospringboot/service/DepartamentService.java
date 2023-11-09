package com.luisfuentes.proyectospringboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luisfuentes.proyectospringboot.model.Departament;
import com.luisfuentes.proyectospringboot.repository.DepartamentRepository;

@Service
public class DepartamentService {

	@Autowired
	private DepartamentRepository departamentRepository;
	
	public Departament createDepartament(Departament departament) {
		return departamentRepository.save(departament);
	}
	public Departament getDepartamentById(Long id) {
		Optional<Departament> optionalDepartament = departamentRepository.findById(id);
		return optionalDepartament.get();
	}
	public List<Departament> getAllDepartament(){
		return departamentRepository.findAll();
	}
}
