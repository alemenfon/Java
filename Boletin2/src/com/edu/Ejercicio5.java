package com.edu;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		System.out.println(esMultiplo(25, 5));
		
	}
	
	public static boolean esMultiplo(int num1, int num2) {
		boolean multiplo=false;
		
		if(num1%num2==0) {
			multiplo=true;
		}
		
		
	return multiplo;	
	}

}
