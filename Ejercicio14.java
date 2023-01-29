package com.edu;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		
		int numero=0;
		int contadorNumeros=0;
		int sumaImpares=0;
		int cantidadImpares=0;
		int mayorPares=0;
		
		
		Scanner sc=new Scanner(System.in);
		
		do {
			System.out.println("Introduzca un numero:");
			numero=Integer.valueOf(sc.nextLine());
			
			if(numero>0) {
				contadorNumeros++;
			}
			
			if(numero%2==1) {
				sumaImpares+=numero;
				cantidadImpares++;
			}else if (numero>mayorPares) {
				mayorPares=numero;
			}
			
		}while(numero>0);
		
		System.out.println("Cantidad de numeros introducidos: " + contadorNumeros);
		System.out.println("La media de los impares es " + sumaImpares/cantidadImpares );
		System.out.println("El maximo de los pares es " +mayorPares);
		System.out.println(cantidadImpares);
		

	}

}
