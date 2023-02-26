package com.edu.maquina;

import java.util.Scanner;

public class MainMaquina {

	public static void main(String[] args) {
		
		Maquina maquina=new Maquina();
		
		Scanner sc=new Scanner(System.in);
		
		int opcion=-1;
		double dinero=0;
		double saldoMaquina=0;
		
		
		String menu= "Menu\n"
				+ "1. Servir café solo (1 euro)\n"
				+ "2. Servir leche (0,8 euros)\n"
				+ "3. Servir café con leche (1,5 euros)\r\n"
				+ "4. Consultar estado máquina.\n" //Aparecen los datos de los depósitos y del monedero
				+ "5. Apagar máquina y salir";
		
		System.out.println("Introduce saldo de la máquina");
		saldoMaquina=Double.valueOf(sc.nextLine());
		maquina.setMonedero(saldoMaquina);
		maquina.llenarDepositos();
		
		while (opcion!=5) {
			System.out.println(menu);
			System.out.println("Introduzca una opción: ");
			opcion=Integer.valueOf(sc.nextLine());
			
			if(opcion==1) {
				System.out.println("Introduzca dinero: ");
				dinero=Double.valueOf(sc.nextLine());
				System.out.println(maquina.servirCafeSolo(dinero));
			}else if(opcion==2) {
				System.out.println("Introduzca dinero: ");
				dinero=Double.valueOf(sc.nextLine());
				System.out.println(maquina.servirLeche(dinero));
			}else if (opcion==3) {
				System.out.println("Introduzca dinero: ");
				dinero=Double.valueOf(sc.nextLine());
				System.out.println(maquina.servirCafeConLeche(dinero));
				
			}else if(opcion==4) {
				System.out.println(maquina);
				
			}
		}
		
		
		
		

	}

}
