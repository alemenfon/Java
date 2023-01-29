package com.edu;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		int numero=0;
		Scanner sc=new Scanner(System.in);
		
		
		do {
			System.out.println("Introduzca un numero, negativo para terminar: ");
			numero=Integer.valueOf(sc.nextLine());
			System.out.println("cuadrado es: " + numero*numero);
			
		}while(numero>0);
		System.out.println("numero negativo");
		

	}
	
	
	

}
