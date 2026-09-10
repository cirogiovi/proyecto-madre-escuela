package com.escuela.ms_aulas.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "aulas")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Aula {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Long id;
	
	private String nombre;//ejemplo aula 20 o 21,etc
	private String ubicacion; //ejemplo planta baja, piso 1, etc
	
	private int capacidad;//cantidad de personas que hay en el aula
	private Boolean activa;//si esta ocupado o no true/false	
	
	
}
