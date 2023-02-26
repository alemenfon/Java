package cuentaCorriente;

import java.util.Scanner;

public class MainCuenta {

	public static void main(String[] args) {
		
		Cuenta c=new Cuenta();
		Scanner sc=new Scanner(System.in);
		
		int opcion=-1;
		double saldoInicial;
		int saldoRetira;
		int saldoIngresa;
		String respuesta="";
		
		String menu="-------MENÚ----------\n"
				+ "1. Hacer un reintegro.\n"
				+ "2. Hacer un ingreso\n"
				+ "3. Consultar el saldo y el número de reintegros e ingresos realizados.\n"
				+ "4. Finalizar las operaciones.\n";

		
		System.out.println("Introduce saldo de la cuenta: ");
		saldoInicial=Double.valueOf(sc.nextLine());
		c.setSaldo(saldoInicial);
		
		System.out.println(menu);
		
		
		while(opcion!=4 || !respuesta.equalsIgnoreCase("si")) {
			System.out.println("Introduzca una opción: ");
			opcion=Integer.valueOf(sc.nextLine());
			  
			if(opcion==1) {
				System.out.println("Indique la cantidad a retirar: ");
				saldoRetira=Integer.valueOf(sc.nextLine());
				c.hacerReintegro(saldoRetira);
				
			}else if(opcion==2) {
				System.out.println("Indique la cantidad a ingresar: ");
				saldoIngresa=Integer.valueOf(sc.nextLine());
				c.hacerIntegro(saldoIngresa);
				
			}else if(opcion==3) {
				System.out.println("Su saldo es: " + c.getSaldo());
				System.out.println("El número de reintegros es: " + c.getNumReintegros());
				System.out.println("El número de ingresos es : " + c.getNumIngresos());
				
			
			}else if(opcion==4) {
				System.out.println("¿Desea salir? (SI/NO)");
				respuesta=sc.nextLine();
				if(respuesta.equalsIgnoreCase("si")) {
					System.out.println(c.getSaldo());
						
				}
				
				
			}

	}

}
}
