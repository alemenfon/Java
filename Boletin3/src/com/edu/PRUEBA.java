package com.edu;

public class PRUEBA {

	public static void main(String[] args) {
		System.out.println(startWirth("A", "ALEJANDRA"));
		String fras="Cunatas letras";
		System.out.println(fras.length());
		System.out.println(endWith("Hola ale", "ale"));

	}
	
	public static boolean startWirth(String palabraContar,String frase) {
		String fras="Cunatas letras";
		return (frase.substring(0, palabraContar.length()).equals(palabraContar));
		
	}
	
	
	public static boolean endWith(String cadena, String texto) {
		return cadena.substring(cadena.length()-texto.length()).equalsIgnoreCase(texto);
	}

}
