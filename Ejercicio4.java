package com.edu;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		double notaPractica,notaTeorica,notaProblemas,notaFinal;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduzca la nota práctica:");
		notaPractica=Integer.valueOf(sc.nextLine());
		
		if (notaPractica <0 && notaPractica >10) {
			System.out.println("Introduzca una nota valida: ");
			
		}else {
			notaPractica=notaPractica*0.10;
		}
		
		System.out.println("Introduzca la nota teorica:");
		notaTeorica=Integer.valueOf(sc.nextLine());
		
		if (notaTeorica <0 && notaTeorica >10) {
			System.out.println("Introduzca una nota valida: ");
			
		}else {
			notaTeorica=notaTeorica*0.4;
		}
		
		System.out.println("Introduzca la nota problemas:");
		notaProblemas=Integer.valueOf(sc.nextLine());
		
		if (notaProblemas <0 && notaProblemas >10) {
			System.out.println("Introduzca una nota valida: ");
			
		}else {
			notaPractica=notaProblemas*0.5;
		}
		
		notaFinal=(notaPractica+notaProblemas+ notaProblemas)/3;
		
		System.out.println("La nota final del alumno es " + notaFinal);
		
		
		if (notaFinal<5) {
			System.out.println("Insuficiente");
			
		}
		else if (notaFinal>=5 && notaFinal <6) {
			System.out.println("suficiente");
			
		}
		else if (notaFinal>=6 && notaFinal <7) {
			System.out.println("Bien");
			
		}
		else if (notaFinal>=7 && notaFinal <9) {
			System.out.println("Notable");
			
		}
		else if (notaFinal>=9 && notaFinal <=10) {
			System.out.println("La nota es Sobresaliente");
		}
			
		
	}

}
