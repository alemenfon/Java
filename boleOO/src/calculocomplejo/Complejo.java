package calculocomplejo;

public class Complejo {
	
	private double parteReal;
	private double parteImaginaria;
	
	
	public Complejo() {
		
	}
	
	

	public Complejo(double real, double imaginario) {
		this.parteReal=real;
		this.parteImaginaria=imaginario;
		
	}


	public double getParteReal() {
		return parteReal;
	}


	public void setParteReal(double parteReal) {
		this.parteReal = parteReal;
	}

	
	public Complejo sumarComplejo(Complejo complex2) {
		
		double sumaReal=this.parteReal+complex2.parteReal;	
		double sumaImaginaria=this.parteImaginaria+complex2.parteImaginaria;
		return new Complejo(sumaReal,sumaImaginaria);

		
	}
	
	public Complejo restar(Complejo complex2) {
		double restaReal=this.parteReal-complex2.parteReal;
		double restaImaginaria=this.parteImaginaria-complex2.parteImaginaria;
		return new Complejo (restaReal,restaImaginaria);
	}



	@Override
	public String toString() {
		String resultado="";
		if(parteImaginaria>=0) {
			resultado=parteReal + " + " + parteImaginaria +"i";
		}else {
			resultado=parteReal +"-" + parteImaginaria + "i";
		}
		
		
		return resultado;
	}
	
	
	
	
	

		
		
	}



