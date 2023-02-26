package com.edu;

public class Avion {
	
	private String idAvion;
	private int capacidad;
	private Integer numVuelos=0;
	private double kmVolados;
	private String compania;
	
	
	//constructor
	public Avion() {
		
	}
	
	
	public Avion(String idAvion, int capacidad) {
		super();
		this.idAvion = idAvion;
		this.capacidad = capacidad;
		
	}

	
	public Avion(String idAvion, String compania, int capacidad) {
		this(idAvion,capacidad);
		this.compania = compania;
	}
	
	public boolean asignarVuelo(int capacidad,double kilometros,int numViajeros) {
		boolean esAsignado=false;
		this.kmVolados+=kilometros;
		this.numVuelos++;
		
		if(numViajeros<=this.capacidad) {
	
			esAsignado=true;
		}
	
		return esAsignado;
	
	}
		
	public double getMediaKm() {
		double mediaKms=0.0;
		mediaKms=kmVolados/numVuelos;
		
		return mediaKms;
	}


	public String getIdAvion() {
		return idAvion;
	}
	
	
	//Getter y Setter
	public void setIdAvion(String idAvion) {
		this.idAvion = idAvion;
	}



	public int getCapacidad() {
		return capacidad;
	}



	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}



	public int getNumVuelos() {
		return numVuelos;
	}
	


	public void setNumVuelos(int numVuelos) {
		this.numVuelos = numVuelos;
	}



	public double getKmVolados() {
		return kmVolados;
	}



	public void setKmVolados(double kmVolados) {
		this.kmVolados = kmVolados;
	}



	public String getCompania() {
		return compania;
	}



	public void setCompania(String compania) {
		this.compania = compania;
	}



	public static void main(String[] args) {
		

	}


	@Override
	public String toString() {
		return String.format("Avión con id: %s de la compañía %s" 
		+ " ha realizado\n"
		+ " %s vuelos, con un total %s km y "
		+ " una media de %s km por vuelo",
		this.idAvion,this.compania,this.numVuelos,this.kmVolados,this.getMediaKm());
	
	}
	
	
	
	

}
