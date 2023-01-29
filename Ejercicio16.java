package com.edu;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		double salario=0;
		double suma=0;
		int mayoresDeMil=0;
		Scanner sc=new Scanner(System.in);
		
		
		
		for(int i=0;i<10;i++) {
			System.out.println("Introduzca salario: ");
			salario=Integer.valueOf(sc.nextLine());
			suma+=salario;
			if (salario>1000) {
				mayoresDeMil++;
			}
			
		}
		System.out.println("La suma de los salarios es: " + suma);
		System.out.println("La cantidad de los mayores de mil es  " + mayoresDeMil);
	}

}
