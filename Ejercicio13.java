package com.edu;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		
		int contador=0;
		int numeroMax=0;
		int numeroMin=1;
		int numero=0;
		Scanner sc=new Scanner(System.in);
		
		do {
			System.out.println("Introduzca un numero: ");
			numero=Integer.valueOf(sc.nextLine());
			contador++;
			if (numero>numeroMax) {
				numeroMax=numero;
			
			}else if (numero<numeroMin) {
				numeroMin=numero;
				
			}
			
				
		}while(contador<10);
		System.out.println("El numero maximo es: " + numeroMax );
		System.out.println("El numero minimo es: " + numeroMin );
		
		
		
		
		
		
		
		
	}

}
