package com.edu;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		int hora;
		Scanner sc =new Scanner(System.in);
		System.out.println("Introduzca una hora: ");
		hora=Integer.valueOf(sc.nextLine());
		
		switch (hora) {
		
		case 6,7,8,9,10,11,12: {
			System.out.println("Buenos días");
			break;	
		}case 13,14,15,16,17,18,19,20: {
			System.out.println("Buenas tardes");
			break;	
		}case 21,22,23,24,1,2,3,4,5: {
			System.out.println("Buenas noches");
			break;	
		
		}

	}

}
}
