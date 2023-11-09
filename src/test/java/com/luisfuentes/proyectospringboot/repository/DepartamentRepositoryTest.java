package com.luisfuentes.proyectospringboot.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.List;
import java.util.Optional;

import com.luisfuentes.proyectospringboot.model.Departament;

@DataJpaTest
public class DepartamentRepositoryTest {

	@Autowired
	private DepartamentRepository departamentRepository;

	@Test
	public void createDepartament() {

		// Given
		Departament departament = new Departament();

		// When
		Departament createDepartament = departamentRepository.save(departament);

		// Then
		assertNotNull(createDepartament);

	}

	@Test
	public void getAllDepartament() {

		// Given
		Departament departament = new Departament();
		departamentRepository.save(departament);

		// When
		List<Departament> gellAllDepartament = departamentRepository.findAll();

		// Then
		assertNotNull(gellAllDepartament);
		assertFalse(gellAllDepartament.isEmpty());

	}

	@Test
	public void getDepartamentById() {

		// Given
		Long id = (long) 1;

		// When
		Optional<Departament> getDepartamentById = departamentRepository.findById(id);

		// Then
		assertNotNull(getDepartamentById);

	}

}
