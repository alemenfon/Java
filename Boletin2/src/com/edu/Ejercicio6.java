package com.edu;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		
		System.out.println(horaMayor(4, 20, 10, 6, 20, 10));
		

	}
	
	
	public static String horaMayor(int hora1,int minutos1,int seg1,int hora2, int minutos2, int seg2) {
		String resultado="";
		
		if(hora1<=12 && hora2<=12 && minutos1<=60 && minutos2 <=60 && seg1<=60 && seg2<=60) {
			if(hora1>hora2) {
				resultado="1";
				
			}else if(hora2 >hora1) {
				resultado="2";
			}else {
				if(minutos1>minutos2) {
					resultado="1";
				}else if (minutos2>minutos1) {
					resultado="2";
				}else {
					if(seg1>seg2) {
						resultado="1";
					}else if (seg2>seg1) {
						resultado="2";
					}
				}
			}
			
		}else {
			resultado="-1000";
		}
		
		return resultado;	
	}
	

}
