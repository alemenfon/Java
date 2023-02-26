package calculocomplejo;

import java.util.Scanner;

public class MainComplejo {

	public static void main(String[] args) {
		
		Complejo complex = new Complejo(5,3);
		Complejo complex2 = new Complejo(5,3);
		Complejo complex3=new Complejo();
		Complejo complex4=new Complejo();
		
		
		Scanner sc=new Scanner(System.in);
		String menu="Menu: \n"
				+ " 1.Sumar complejos.\n"
				+ " 2.Restar Complejos.\n"
				+ " 3.Salir.\n";
		int opcion=-1;
		double real1=0;
		double imaginario1=0;
		double real2=0;
		double imaginario2=0;
		System.out.println(menu);
		
		while(opcion!=3) {
			System.out.println("Seleccione una opción: ");
			opcion=Integer.valueOf(sc.nextLine());
			if(opcion==1) {
				System.out.println("Introduzaca la parte real del numero 1: ");
				real1=Double.valueOf(sc.nextLine());
				System.out.println("Introduzca la parte imaginaria del numero1: ");
				imaginario1=Double.valueOf(sc.nextLine());
				complex3= new Complejo(real1, imaginario1);
				
				System.out.println("Introduzaca la parte real del numero 2: ");
				real2=Double.valueOf(sc.nextLine());
				System.out.println("Introduzca la parte imaginaria del numero 2: ");
				imaginario2=Double.valueOf(sc.nextLine());
				complex4= new Complejo(real2, imaginario2);
				System.out.println(complex3.sumarComplejo(complex4));
					
			}else if(opcion==2) {
				System.out.println("Introduzaca la parte real del numero 1: ");
				real1=Double.valueOf(sc.nextLine());
				System.out.println("Introduzca la parte imaginaria del numero1: ");
				imaginario1=Double.valueOf(sc.nextLine());
				complex3= new Complejo(real1, imaginario1);
				
				System.out.println("Introduzaca la parte real del numero 2: ");
				real2=Double.valueOf(sc.nextLine());
				System.out.println("Introduzca la parte imaginaria del numero 2: ");
				imaginario2=Double.valueOf(sc.nextLine());
				complex4= new Complejo(real2, imaginario2);
				System.out.println(complex3.sumarComplejo(complex4));
				
				System.out.println(complex3.restar(complex4));
				
			}else {
				System.out.println("Saliendo del menú");
			}
			
			
		}
		
		

	}

}
