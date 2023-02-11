package com.edu;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		System.out.println(palabraEnCadena("shybaoxlna", "hola"));
	
	}
	
	
	public static boolean palabraEnCadena(String cadena, String palabra) {
		boolean encontrada=false;
		int coincide=0;
		
		for(int i=0;i<cadena.length();i++) {
			if(coincide<palabra.length()) {
				if((palabra.charAt(coincide))==cadena.charAt(i)){
					coincide++;
				}
				if (coincide == palabra.length()) {
					encontrada=true;
				}	
	}

	}
		return encontrada;
}
}

