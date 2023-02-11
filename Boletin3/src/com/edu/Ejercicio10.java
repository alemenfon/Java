package com.edu;

public class Ejercicio10 {

	public static void main(String[] args) {
		System.out.println(cifradoCesar("ABCDEFGHIJKLMNÑOPQRSTUVWXYZ", "CASADO"));
		System.out.println(cifradoCesarCaracter('A', 3));
		System.out.println(sonCifradoEquivalente("CASADO", "FDVDGR"));	
	}
	
	public static String cifradoCesar(String abecedario, String texto) {
		String textoCifrado="";
		int desplaza=3;
		char letra;
		
		for(int i=0;i<texto.length();i++) {
			letra=texto.charAt(i);
			int posicion=abecedario.indexOf(letra);
			
			if(posicion==-1) {
				textoCifrado+=letra;
			}else {
				textoCifrado+=abecedario.charAt(posicion+desplaza);
				
			}
			
		}
		
		return textoCifrado;
	}
	
	
	public static  char cifradoCesarCaracter(char caracter,int desplazamiento) {
		String abecedario="ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
		char caracterCifrado;
		
		return caracterCifrado=abecedario.charAt(abecedario.indexOf(caracter + desplazamiento));

	}
	
	public static boolean sonCifradoEquivalente(String palabra, String cifrada) {
		boolean equivalente=false;
		int desplazamiento;
		
		
		
			

		
		return equivalente;
	} 
}
