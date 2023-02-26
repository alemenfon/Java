package com.edu.rectan;

import java.util.Scanner;

public class MainRectangulo {

	public static void main(String[] args) {
		
		Rectangulo rec= new Rectangulo();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduzca el ancho del triángulo: ");
		int anchoTriangulo=Integer.valueOf(sc.nextLine());
			  
		System.out.println("Introduzca la longitud del triángulo: ");
		int longitudTriangulo=Integer.valueOf(sc.nextLine());
			  
		
		System.out.println("El perimetro del triángulo es: " + rec.calcularPerimetroRectangulo(longitudTriangulo, anchoTriangulo) 
		+ " y su área es :" + rec.calcularAreaRectangulo(longitudTriangulo, anchoTriangulo));
		

	

}
}

