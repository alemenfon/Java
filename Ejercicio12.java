package com.edu;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
	
		int numero=0;
		int contadorNumeros=0;
		
		Scanner sc=new Scanner(System.in);
		
		do {
			System.out.println("Introduzca un número positivo, negativo si desea terminar: ");
			numero=Integer.valueOf(sc.nextLine());
			contadorNumeros++;
			
		}while(numero>0);
		
		if(numero<0) {
			System.out.println("Se han introducido: " + contadorNumeros);
			
		}
		

	}

}
