package com.edu;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		int num;
		boolean multiplo=false;
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<5;i++) {
			System.out.println("Introduzca un número: ");
			num=Integer.valueOf(sc.nextLine());
		
		if (num%3==0) {
			multiplo=true;
			System.out.println("El numero " + num + " es multiplo de 3");
		}
		else {
			multiplo=false;
			System.out.println("El numero " + num + " no es multiplo de 3");
			
			System.out.println(5>5);
		}
		
		System.out.println(5>5);
		
	}

}
}
