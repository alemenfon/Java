package com.edu.maquina;

public class Maquina {
	
	private final double    PRECIO_CAFE=1.0;
	private final double    PRECIO_LECHE=0.8;
	private final double    PRECIOC_AFECONLECHE=1.5;
	
	private int depositoCafe;
	private int depositoLeche;
	private int depositoVasos;
	private double monedero;
	
	public Maquina() {
		
	}
	
	public Maquina(int depositoCafe, int depositoLeche, int depositoVasos, double monedero) {
		super();
		this.depositoCafe = 50;
		this.depositoLeche = 50;
		this.depositoVasos = 80;
		this.monedero = monedero;
	}

	public int getDepositoCafe() {
		return depositoCafe;
	}

	public void setDepositoCafe(int depositoCafe) {
		this.depositoCafe = depositoCafe;
	}

	public int getDepositoLeche() {
		return depositoLeche;
	}

	public void setDepositoLeche(int depositoLeche) {
		this.depositoLeche = depositoLeche;
	}

	public int getDepositoVasos() {
		return depositoVasos;
	}

	public void setDepositoVasos(int depositoVasos) {
		this.depositoVasos = depositoVasos;
	}
	
	
	
	public double getMonedero() {
		return monedero;
	}

	public void setMonedero(double monedero) {
		this.monedero = monedero;
	}
	
	public void llenarDepositos() {
		this.depositoCafe = 50;
		this.depositoLeche = 50;
		this.depositoVasos = 80;
}

	public String servirCafeSolo(double dinero) {
		String mensaje="";
		
		if(dinero<PRECIO_CAFE) {
			mensaje="No dispone de dinero suficiente: ";
		}else if(depositoCafe<1) {
			mensaje="Lo sentimos no queda café ";
		}else {
			this.depositoCafe--;
			this.depositoVasos--;
			this.monedero+=PRECIO_CAFE;
			
			if(dinero-PRECIO_CAFE==0) {
				mensaje="Café servido";
			}else {
				double cambioCafe=dinero-PRECIO_CAFE;
				mensaje="Su cambio es: " + cambioCafe;
			}
		}
		
		return mensaje;	
	}
	
	public String servirCafeConLeche(double dinero) {
		String mensaje="";
		if(dinero<PRECIOC_AFECONLECHE) {
			mensaje="No dispone de dinero suficiente";
		}else if(depositoLeche<1) {
			mensaje="Error, nos hemos quedado sin leche";
		}else if(depositoCafe<1) {
			mensaje="Error, nos hemos quedado sin café";
		}else if(depositoVasos<1) {
			mensaje="Lo sentimos, nos hemos quedado sin vasos";
		}else {
			this.depositoCafe--;
			this.depositoLeche--;
			this.depositoVasos--;
			this.monedero+=PRECIOC_AFECONLECHE;
			
			if(dinero -PRECIOC_AFECONLECHE==0) {
				mensaje="Producto servido";
			}else {
				double cambioCafeLeche=dinero- PRECIOC_AFECONLECHE;
				mensaje="Su cambio es " + cambioCafeLeche;
				
			}
		}
		
		return mensaje;
	}
	
	public String servirLeche(double dinero) {
		String mensaje="";
		if(dinero<PRECIO_LECHE) {
			mensaje="No dispone de dinero suficiente";
		}else if(depositoLeche<1) {
			mensaje="Lo sentimos, no disponemos de leche";
		}
		else if(depositoVasos<1) {
			mensaje="Lo sentimos, no disponemos de vasos";	
		}else {
			this.depositoLeche--;
			this.depositoVasos--;
			this.monedero+=PRECIO_LECHE;
			
			if(dinero-PRECIO_LECHE==0) {
				mensaje="Producto servido";
			}else {
				double cambioLeche=dinero-PRECIO_LECHE;
				mensaje="Su cambio es " + cambioLeche;
			}
		}
		
		return mensaje;
	}

	@Override
	public String toString() {
		return String.format("El depósito de vasos es %s"
				+"Deposito de leche %s "
				+"deposito de café %s "
				+ "Y el saldo del monedero %s ",this.depositoVasos,this.depositoLeche,this.depositoCafe,this.monedero);
	}
	
	


	
	
	

}
