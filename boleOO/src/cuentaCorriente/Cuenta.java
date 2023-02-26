package cuentaCorriente;

public class Cuenta {
	
	private double saldo;
	private int numReintegros=0;
	private int numIngresos=0;
	
	
	public Cuenta() {
	}
		
	
	public Cuenta(double saldo) {
		super();
		numIngresos=0;
		numReintegros=0;
		
	}
	
	public Cuenta(double saldo, double ingreso, double reintegro) {
		super();
		this.saldo = saldo;
		
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	
	
	public int getNumReintegros() {
		return numReintegros;
	}


	public void setNumReintegros(int numReintegros) {
		this.numReintegros = numReintegros;
	}


	public int getNumIngresos() {
		return numIngresos;
	}


	public void setNumIngresos(int numIngresos) {
		this.numIngresos = numIngresos;
	}


	public boolean hacerReintegro(int dineroSacar) {
		boolean reintegroRealizado=false;
		if(dineroSacar<saldo) {
			this.saldo-=dineroSacar;
			this.numReintegros++;	
			reintegroRealizado=true;
		}
		return reintegroRealizado;	
	}
	
	
	public boolean hacerIntegro(int dineroIngresar) {
		boolean ingresoRealizado=false;
		if(dineroIngresar>0) {
			this.saldo+=dineroIngresar;
			this.numIngresos++;	
			ingresoRealizado=true;
			
		}
		return ingresoRealizado;
		
	}

	@Override
	public String toString() {
		return String.format("La cuenta coriiente tiene un saldo de %s, se han realizado"
				+"%s ingresos y %s reintegros,"
				+ saldo,numIngresos,numReintegros);
	}
	
	

}
