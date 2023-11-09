package com.luisfuentes.proyectospringboot.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "employees")

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Employee {

	@Id
	private String email;
	
	private String nameEmployee;
	
	@ManyToOne
	@JoinColumn(name = "departament_id")
	@JsonBackReference
	private Departament departament;
}
