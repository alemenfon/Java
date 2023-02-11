package com.edu;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		System.out.println(numAparecePalabra("La lluvia en sevilla es lluvia y más lluvia", "lluvia"));

	}
	
	public static int numAparecePalabra (String cadena, String palabra) {
		
		int veces=0;
		int pos=cadena.indexOf(palabra);
		
		while(pos!=-1) {
			veces++;
			pos=cadena.indexOf(palabra,pos +1);	
		}
		
		return veces;	
	}
}
