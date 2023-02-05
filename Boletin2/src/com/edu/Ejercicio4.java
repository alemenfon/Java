package com.edu;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		System.out.println(caracteresInvertidos("Hola mundo"));
		
	}
	
	public static String caracteresInvertidos(String cadena) {
		String invertida="";
		
		for(int i=cadena.length()-1; i>=0;i--) {
			invertida+=cadena.charAt(i);
		}
		
		return invertida;
	}
	

}
