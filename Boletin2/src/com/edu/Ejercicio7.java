package com.edu;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		System.out.println(segundosEntre(2, 20, 10, 2, 20, 2));


	}
	
	public static int segundosEntre (int hora1, int min1, int seg1, int hora2, int min2, int seg2) {
		int resultado=0;
		int totalHora1=0;
		int totalHora2=0;
		
		totalHora1=(hora1*3600)+(min1*60)+seg1;
		totalHora2=(hora2*3600)+(min2*60)+seg2;
		
		if (hora1<=24 && hora2<=24 && min1<=60 && min2<=60 && seg1<=60 && seg2<=60) {
			resultado=totalHora1-totalHora2;
			
		}
		
		
		return resultado;
	}


}
