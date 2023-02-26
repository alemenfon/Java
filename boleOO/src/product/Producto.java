package product;

public class Producto {
	
	public String descripcion;
	private double precioSinIva;
	
	public final double IVA=0.2;
	
	
	public Producto() {
		
	}

	public Producto(String descripcion, int precioSinIva) {
		super();
		this.descripcion = descripcion;
		this.precioSinIva = precioSinIva;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecioSinIva() {
		return precioSinIva;
	}

	public void setPrecioSinIva(int precioSinIva) {
		this.precioSinIva = precioSinIva;
	}

	
	public double calcularPrecioVenta(double precio, double IVA) {
		return this.precioSinIva=precio+(precio*IVA);
		
	}
	

}
