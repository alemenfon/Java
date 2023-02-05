package com.edu;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		System.out.println(esContraseniaFuerte("Alemenfon11;?"));
	

		if(esContraseniaFuerte("Alemenfon11;?")) {
			System.out.println("Es una contraseña fuerte");
		}else {
			System.out.println("No es una contraseña fuerte");
		}
	

	}
	
	public static boolean esContraseniaFuerte(String contrasena) {
		final String SIMBOLOS="¡¿?!.;,()%&$";
		final int longitud=8;
		boolean esPuntuacion=false;
		boolean esMayuscula=false;
		boolean esMinuscula=false;
		boolean esSignoPuntuacion=false;
		boolean esDigito=false;
		
		if (contrasena.length()>=longitud) {
			for(int i=0;i<contrasena.length();i++) {
				
				if(Character.isDigit(contrasena.charAt(i))){
					esDigito=true;	
				}else if(Character.isUpperCase(contrasena.charAt(i))) {
					esMayuscula=true;
				}else if(Character.isLowerCase(contrasena.charAt(i))) {
					esMinuscula=true;
				}{
					
					
				}
			}
			
		}
		return esDigito && esMayuscula && esMinuscula && esSignoPuntuacion;
		
		
	}
	
	private boolean esPuntuacion(char c) {
		boolean esPuntuacion=false;
		
		
		
		
		return esPuntuacion;
		
		
	}
	
	
	
	

}
