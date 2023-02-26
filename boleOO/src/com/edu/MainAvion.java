package com.edu;

import java.util.Scanner;

public class MainAvion {

	public static void main(String[] args) {
		
		Avion av=new Avion(); // Instanciar la clase avion
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Introduzca una opcion: \n"
				+ "a) Asignar vuelo. \n"
				+ "b) Obtener el número de vuelos\n"
				+ "c) Obtener el total de kilómetros volados\n"
				+ "d) Obtener la media de kilómetros por vuelo. "
				+ "e) Cambio de compañia.\n"
				+ "f) Mostrar información del avión.");
		
		String opcion=sc.nextLine();
		
		if(opcion.equalsIgnoreCase("a")){
			System.out.println("Introduzca numero de asientos: ");
			int numAsientos=Integer.valueOf(sc.nextLine());
			System.out.println("Introduxca numero de kilometros volados");
			double kms =Integer.valueOf(sc.nextLine());
			System.out.println("Introduzca numero de viajeros: ");
			int numViajeros=Integer.valueOf(sc.nextLine());
			
			if(av.asignarVuelo(numAsientos, kms, numViajeros)) {
				System.out.println("Posible asignar vuelo.");
			}else {
				System.out.println("No es posible asignar vuelo.");
			}
				
		}else if(opcion.equalsIgnoreCase("b")) {
			
			System.out.println("El numero de vuelos realizados es: " + av.getNumVuelos());
			
		}else if(opcion.equalsIgnoreCase("c")) {
			
			System.out.println("El total de kilometros volados es:" + av.getKmVolados());
			
		}else if(opcion.equalsIgnoreCase("d")) {
			System.out.println("La media de kilómetros volados es: " + av.getMediaKm());
			
		}else if(opcion.equalsIgnoreCase("e")) {
			System.out.println("Quiere cambiar de compañía? ");
			av.setCompania(sc.nextLine());
			System.out.println("Su compañía es : " + av.getCompania());
			
		}else if(opcion.equalsIgnoreCase("f")) {
			System.out.println(av);
			
		}
				
			
		}
	
	public static Avion crearAvionMenu() {
		Avion avionCreado = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Menú creacion avión: \n"
				+ "1-Crear avión con identificador. \n" 
		        + "2-Crear avión con identificador y compañia. ");
		
		String opcion="";
		
		switch(opcion) {
		//Crear avion solo con identificador
		case "1" :{
			System.out.println("Introduzca identificador del avion: ");
			String id=sc.nextLine();
			System.out.println("Introduzca la capacida del avión: ");
			int capacidad=Integer.valueOf(sc.nextLine());
			
			avionCreado=new Avion(id, capacidad);
			
		break;
		//Crear avion con identificador y compania
		}case "2":{
			System.out.println("Introduzca identificador del avion: ");
			String id=sc.nextLine();
			System.out.println("Introduzca la capacida del avión: ");
			int capacidad=Integer.valueOf(sc.nextLine());
			System.out.println("Introduzca el nombre de la compañia: ");
			String compania=sc.nextLine();
			
			
		break;	
		}default:{
			System.out.println();
		}
			
	
		}
		return avionCreado;
	}
}
	
	
	
	
	
	
	





