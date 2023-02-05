package com.edu;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		System.out.println(numeroAlReves("23"));
			
	}
	
	static String numeroAlReves(String numero) {
		String result="";
		for(int i=0;i<numero.length();i++) {
			result+=String.valueOf(numero.charAt(i))+String.valueOf(numero.charAt(i));
			
		}
	
		return result;
	}
	
	
}
