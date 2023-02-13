package com.edu;

import java.util.Scanner;

public class Ejercicio1 {
	public static  final int PRECIO_ENTRADA_GENERAL       =8;
	public static  final int PRECIO_ESPECTADOR            =5;
	public static  final int PRECIO_PAREJA                =11;
	public static  final double DESCUENTO_TARJETA         =0.10;
	public static  final String  DIA_SEMANA               ="LMXJVSD";
	public static final String TIENE_TARJETA              ="S/N";

	public static void main(String[] args) {
		int numEntradas=-1;
		String dia="";
		String poseeTarjeta="";
		
		Scanner sc=new Scanner(System.in);
		while(numEntradas!=0) {
			do {
				System.out.println("Introduzca el numero de entradas: ");
				numEntradas=Integer.valueOf(sc.nextLine());
				
			}while(numEntradas<0);
			
			do {
				System.out.println("Introduzca el día de la semana: ");
				dia=sc.nextLine();
				
			}while(DIA_SEMANA.indexOf(dia)==-1);
			
			do {
				System.out.println("¿Tiene tarjeta descuento Jacarandá?: ");
				poseeTarjeta=sc.nextLine();
				
			}while(TIENE_TARJETA.indexOf(poseeTarjeta)==-1);
			
			System.out.println(calcularPrecioEntrada(numEntradas, dia, poseeTarjeta));	
			
		}	
	}
	
	/**
	 * Función para calcular el precio total de las entradas.
	 * @param numeroEntradas
	 * @param diaSemana
	 * @return precio total a pagar por un conmjunto de entradas.
	 */
	
	public static double calcularPrecioEntrada(int numeroEntradas, String diaSemana, String tarjeta) {
		double precioTotal=0;
		
		if(diaSemana.equalsIgnoreCase("J")) {
			if(numeroEntradas%2==0) {
				precioTotal=(numeroEntradas/2) * PRECIO_PAREJA;
				
			}else {
				precioTotal=(numeroEntradas/2)*PRECIO_PAREJA+PRECIO_ENTRADA_GENERAL;
			}		
		}else if(diaSemana.equalsIgnoreCase("X")) {
			precioTotal=numeroEntradas*PRECIO_ESPECTADOR;
		
		
		}else {
			precioTotal=numeroEntradas*PRECIO_ENTRADA_GENERAL;
		}
		
		if(TIENE_TARJETA.equalsIgnoreCase("S")) {
			precioTotal=precioTotal-(precioTotal*DESCUENTO_TARJETA);
		}
		
		return precioTotal;
	}
	

}
