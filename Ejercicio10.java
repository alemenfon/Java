package com.edu;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
	
		int numero=0;
		int suma=0;
		
		Scanner sc=new Scanner(System.in);
		
		
		do {
			System.out.println("Introduzca un numero entero positivo:");
			numero=Integer.valueOf(sc.nextLine());
			
			if (numero<0) {
				System.out.println("Numero introducido no es correcto, introduzac un numero entero positivo: ");
				
			}
			
			
		}while (numero<0);
		
		for (int i=0;i<numero+100;i++) {
			suma+=i;
		}
		System.out.println("La suma es: " + suma);
		
		
		
		

	}

}
