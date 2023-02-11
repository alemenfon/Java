package com.edu;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		System.out.println(esPalindromo("Somos"));

	}
	
	public static boolean esPalindromo(String palabra) {
		boolean palindomo=false;
		palabra=palabra.toLowerCase();
		String invertida="";
		
		char carac;
		for(int i=palabra.length()-1;i>=0;i--) {
			carac=palabra.charAt(i);
			invertida+=carac;
			
		}
		return (invertida.equals(palabra));
		
		
	}

}
