package com.edu;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		String introduce="";
		int numero=0;
		int suma=0;
		
		Scanner sc=new Scanner(System.in);
		
		do {
			System.out.println("Introduzca un numero, fin para terminar:");
			introduce=sc.nextLine();
			
			if (!introduce.equals("fin")){
				numero=Integer.valueOf(introduce);
				suma+=numero;	
			}
			
		}while(!introduce.equals("fin"));
		
		System.out.println("La suma es : " + suma);
	}

}
