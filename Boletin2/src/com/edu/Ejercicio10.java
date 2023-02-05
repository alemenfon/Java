package com.edu;

public class Ejercicio10 {

	public static void main(String[] args) {
		System.out.println(gCd(8, 12));

	}
	
	public static int gCd(int num1,int num2) {
		while (num2>0) {
			if (num2<num1) {
				num1=num1-num2;
			} else {
				num2=num2-num1;
			}
		}
		return num1;
	}

}
