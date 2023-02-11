package com.edu;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		System.out.println(sonPosicionParImpar("alejandra", true));
		System.out.println(sonPosicionParImpar("alejandra", false));

	}
	
	public static String sonPosicionParImpar(String cadena,boolean par) {
		
		StringBuilder sonParesImpares = new StringBuilder();
		
		for(int i=0;i<cadena.length();i++) {
			
			if(i==0 && par) {
				sonParesImpares.append(cadena.charAt(i));	
			}else if(i%2==0 && par) {
				sonParesImpares.append(cadena.charAt(i));
			}else if(i%2!=0 && !par) {
				sonParesImpares.append(cadena.charAt(i));	
			}
					
			}
		return sonParesImpares.toString();
		
			
		}
		

}
