package com.enumerado.example;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class PrincipalUi {

	public static void main(String[] args) {
		
		
		Genero generoIntroducido=null;
		
		do {
			try {
				
				System.out.println("Introduzca su género: ");
				String generoComoString= new Scanner (System.in).nextLine();
				generoIntroducido=Genero.valueOf(generoComoString);
				
			}catch (Exception e){
				
				System.out.println("El valor intrdoducido no es correcto: HOBRE/MUJER");	
			}	
		}while (generoIntroducido==null);
		
		
		
		
		
		LocalDate fechaNacimiento=LocalDate.of(16, 05, 1990);
		
		
		
		Persona Alejandra =new Persona ("Alejandra", "Mensaque",Genero.MUJER, fechaNacimiento);
		Persona Manuel = new Persona ("Manuel", "Mensaque", Genero.HOMBRE, fechaNacimiento);
		Persona Toño =new Persona ("Toño", "Guerreo",Genero.HOMBRE, fechaNacimiento);
		
		Persona [] hermanos = new Persona[3];
		hermanos[0]=Alejandra;
		hermanos[1]=Manuel;
		hermanos[2]=Toño;
		
		Arrays.sort(hermanos);
		
		

	}
	
	
	

}
