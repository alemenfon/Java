package com.edu;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int num1, num2;
		System.out.println("Introduzca un número: ");
		num1=Integer.valueOf(sc.nextLine());
		System.out.println("Introduzca otro número: ");
		num2=Integer.valueOf(sc.nextLine());
		
		if (num1%num2==0) {
			System.out.println("Es múltiplo");
			
		}else {
			System.out.println("No son múltiplo");
		}
		

	}

}
