package com.edu;

import java.util.Scanner;

public class Ejercicio3 {
	
	public static final double FRECUENCIA_DO     =523.25;
	public static final double FRECUENCIA_RE     =587.33;
	public static final double FRECUENCIA_MI     =659.26;
	public static final double FRECUENCIA_FA     =698.46;
	public static final double FRECUENCIA_SOL    =783.99;
	public static final double FRECUENCIA_LA     =880;
	public static final double FRECUENCIA_SI     =987.77;
	
	public static final double SOSTENIDO     	 =1.03;	

	public static void main(String[] args) {
		
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Tecla: ");
		String teclaPulsada=sc.nextLine();*/
		
		
		System.out.println(obtenerFrecuencia("mi", true));

	}
	/**
	 * Función que indica la frecuencia de una nota introducida
	 * @param nota
	 * @return frecuencia en Hz
	 */
	
	public static double obtenerFrecuencia(String nota, Boolean sostenido) {
		
		double frecuencia=0;
		
		if(nota.equalsIgnoreCase("do")) {
			frecuencia=FRECUENCIA_DO;
		}else if(nota.equalsIgnoreCase("re")) {
			frecuencia=FRECUENCIA_RE;
		}else if(nota.equalsIgnoreCase("mi")) {
			frecuencia=FRECUENCIA_MI;
			
		}else if(nota.equalsIgnoreCase("fa")) {
			frecuencia=FRECUENCIA_FA;
		}else if (nota.equalsIgnoreCase("sol")) {
			frecuencia=FRECUENCIA_SOL;
		}else if(nota.equalsIgnoreCase("la")) {
			frecuencia=FRECUENCIA_LA;
		}else {
			frecuencia=FRECUENCIA_SI;
		}
		return sostenido ? frecuencia * SOSTENIDO : frecuencia;
	}

}
