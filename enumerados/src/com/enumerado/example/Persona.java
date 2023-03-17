package com.enumerado.example;

import java.time.LocalDate;

public class Persona implements Desplazable{
	
	private Genero genero;
	private String nombre;
	private String apellidos;
	private LocalDate fechaNacimiento;
	
	
	public Persona(String nombre, String apellidos, Genero genero, LocalDate fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.genero = genero;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	
	

	
	
	
			
	


	@Override
	public void moverse() {
		
		
	}


	@Override
	public void saltar() {
		
		
	}


	@Override
	public void agacharse() {
		
		
	}


	@Override
	public void corre() {
		
		
	}
	
	
	public Genero getGenero() {
		return genero;
	}




	public void setGenero(Genero genero) {
		this.genero = genero;
	}



	public int compareTo (Persona o) {
		int resultado=0;
		if(this.genero.equals(genero.HOMBRE) && o.genero.equals(genero.MUJER)) {
			resultado=1;
		}else if (this.genero.equals(genero.MUJER) && o.genero.equals(genero.HOMBRE)) {
			resultado=-1;
		}
		
		return o.genero.compareTo(this.genero);
		
	}
	
	

}

