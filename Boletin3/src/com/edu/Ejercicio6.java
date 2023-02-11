package com.edu;

public class Ejercicio6 {

	public static void main(String[] args) {
		System.out.println(esCapicua("353.353"));
		
	}
	
	
	public static boolean esCapicua(String numero) {
		boolean capicua=false;
		String numcapicua="";
		
		char num;
		for(int i=numero.length()-1;i>=0;i--) {
			num=numero.charAt(i);
			numcapicua+=num;	
		}
		return (numcapicua.equals(numero));
		
		
	}


}
