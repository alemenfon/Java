package com.edu.rectan;

public class Rectangulo {
	
	private int longitud;
	private int ancho;
	
	
	
	public Rectangulo() {
		super();
		this.longitud =1;
		this.ancho = 1;
	}



	public int getLongitud() {
		return longitud;
	}



	public void setLongitud(int longitud) {
		if(longitud>0 && longitud<20) {
			this.longitud = longitud;	
		}
		
	}



	public int getAncho() {
		return ancho;
	}



	public void setAncho(int ancho) {
		if(ancho>0 && ancho<0) {
			this.ancho = ancho;	
		}
		
	}
	
	public int calcularPerimetroRectangulo(int longitud, int ancho) {
		this.longitud=longitud;
		this.ancho=ancho;
		int perimetro = (longitud+ancho)*2;
		return perimetro;
	}
	
	public int calcularAreaRectangulo(int longitud, int ancho) {
		this.longitud=longitud;
		this.ancho=ancho;
		int area = (longitud*ancho);
		return area;
	}



	
		

}

