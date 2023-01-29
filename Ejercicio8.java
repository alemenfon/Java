package com.edu;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		int num;
		int suma=0;
		Scanner sc=new Scanner(System.in);
		
		
		for (int i=0;i<15;i++) {
			System.out.println("Introduzca un numero: ");
			num=Integer.valueOf(sc.nextLine());
			suma+=num;				
		}

		System.out.println("La suma es: " + suma);
}
}
