package com.coderhouseEntidades;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="alumnos")

public class Alumno {
     @Id
     @Column(name="dni")
     private Integer dni;
     @Column(name="nombre")
     private String nombre;
     @Column(name="apellido")
   	 private String apellido;
     @Column(name="legajo")
   	 private Integer legajo;
   	 
   	 
   	 
	public Alumno() {
	
	}
	
	
	public Integer getDni() {
		return dni;
	}
	public void setDni(Integer dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Integer getLegajo() {
		return legajo;
	}
	public void setLegajo(Integer legajo) {
		this.legajo = legajo;
	}


	@Override
	public int hashCode() {
		return Objects.hash(legajo);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		return Objects.equals(legajo, other.legajo);
	}
   	 
	
   	 
}
