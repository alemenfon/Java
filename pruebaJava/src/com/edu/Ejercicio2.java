package com.edu;

import java.util.Scanner;

public class Ejercicio2 {
	
	public static final int FCMAX                 =220;
	public static final double PORCENTAJE_FCMAX   =0.85;   

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduzca el año actual: ");
		int anioActual=Integer.valueOf(sc.nextLine());
		
		System.out.println("Introduzca su fecha de nacimiento (dd/mm/yyyy): ");
		String fechaNac=sc.nextLine();		
		
		System.out.println(calcularFrecuenciaCardiacaMaxima(anioActual, fechaNac));

	}
	/**
	 * Método para calcular la edad del usuario y la Frecuencia cardiaca máxima recomendada
	 * @param year
	 * @param fNacimiento
	 * @return frecuencia cardiaca maxima recomendada
	 */
	
	public static double calcularFrecuenciaCardiacaMaxima(int year, String fNacimiento) {
		double fcm=0.0;
		int edadActual=0;
		
		int anyoNacimiento=Integer.valueOf(fNacimiento.substring(6));
		edadActual=anyoNacimiento-year;
		
		fcm=(FCMAX-edadActual)* PORCENTAJE_FCMAX;
		
		return fcm;
	}

}
