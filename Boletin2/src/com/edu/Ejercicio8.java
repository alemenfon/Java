package com.edu;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		System.out.println(toBinary(2));	
	}
	
	public static String toBinary(int numberB) {
		String result="";
		
		while(numberB>0) {
			if (numberB%2==0) {
				result="0" + result;
			}else {
				result="1"+ result;
			}
			numberB=(int)numberB/2;	
		}
		
		return result;	
	}
	
}
