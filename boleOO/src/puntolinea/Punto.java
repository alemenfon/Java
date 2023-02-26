package puntolinea;

import java.util.Objects;

public class Punto {
	
	private double x;
	private double y;
	
	
	
	
	public Punto() {
		
	}
	
	public Punto(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	public void sumarPuntoX (double desplaza) {
		this.x += desplaza;
	}
	
	public void sumarPuntoY (double desplaza) {
		this.y+=desplaza;

	}



	@Override
	public boolean equals(Object obj) {
		
		boolean sonIguales=this == obj;
		
		if (!sonIguales && obj != null && obj instanceof Punto) {
			Punto cast=(Punto) obj;
			
			sonIguales=cast.x==this.x && cast.y==this.y;	
		}
			
		return sonIguales;
	}
	
	
	
	
}
