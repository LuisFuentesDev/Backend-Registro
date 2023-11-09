package com.luisfuentes.proyectospringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luisfuentes.proyectospringboot.model.Departament;

public interface DepartamentRepository extends JpaRepository<Departament, Long> {

}
