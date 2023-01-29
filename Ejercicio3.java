package com.edu;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduzca un caracter: ");
		String caracter=sc.nextLine();
		
		if (caracter.equals(caracter.toUpperCase())){
			System.out.println("Es un caracter en mayuscula");
			
		}else if (caracter.equals(caracter.toLowerCase())) {
			System.out.println("Es un caracter en minuscula");
		}else if (caracter.equals(caracter.isBlank())) {
			System.out.println("Es un caracter en blanco");
		}
		
		
	

	}

}
