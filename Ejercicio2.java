package com.edu;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduzca un día de la semana [1-5]");
		int dia=Integer.valueOf(sc.nextLine());
		
		switch (dia) {
		case 1:{
			System.out.println("Es lunes, a primera hora hay Base de Datos.");
			break;
		}case 2:{
			System.out.println("Es Martes, a primera hora hay Programación.");
			break;
		}case 3:{
			System.out.println("Es Miércoles, a primera hora hay Programación.");
			break;
		}case 4:{
			System.out.println("Es Jueves, a primera hora hay FOL.");
			break;
		}case 5:{
			System.out.println("Es Viernes, a primera hora hay Programación.");
			break;
		}default:{
			System.out.println("El día introducido no es correcto");
		}
		}
	}

}
	
