package com.edu;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
	
		int dia, mes;
		Scanner sc=new Scanner(System.in);
		
		do {
			System.out.println("Introduzca un día:");
			dia=Integer.valueOf(sc.nextLine());
	
		}while (dia<1 || dia >=32);
		
		do {
			System.out.println("Introduzca un mes:");
			mes=Integer.valueOf(sc.nextLine());
	
		}while (dia<1 || mes >12);
		
		/*Primavera: inicia el 20 de marzo al 21 de junio.

		Verano: inicia el 21 de junio y finaliza el 23 de septiembre.

		Otoño: inicia el 23 de septiembre y finaliza el 21 de diciembre.

		Invierno: inicia el 21 de diciembre y finaliza el 20 de marzo*/
		
		if ((dia>=21 && mes==12) || (dia<=20 && mes <=3) || (mes == 1) || (mes == 2)) {
			System.out.println("Invierno, la temperatura debe estar a 19º");
		}
		else if ((dia>=23 && mes==9) || (dia<=21 && mes ==12)|| (mes==10)|| (mes==11)) {
			System.out.println("Otoño,  la temperatura debe estar a 19º");
			
		}
		else if ((dia>=21 && mes==6) || (dia<=23 && mes ==9) || (mes == 7) || (mes == 8)) {
			System.out.println("Verano, la temperatura debe estar a 24º");

		}
		else if ((dia>=20 && mes==3) || (dia<=21 && mes ==6) || (mes==4) || (mes==5)) {
			System.out.println("Primavera,  la temperatura debe estar a 20º");

		}
	}
}
