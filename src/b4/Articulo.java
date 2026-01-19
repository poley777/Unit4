package b4;

public class Articulo {
	
	public Articulo (String nombre, double precio, int cuantosQuedan) {
	
		if (nombre != null && !nombre.isEmpty()) {
			this.nombre = nombre;
		}
		
		if (precio >= 0) {
			this.precio = precio;
		}
		
		if (cuantosQuedan >= 0) {
			this.cuantosQuedan = cuantosQuedan;
		}
		
	}
	
	String nombre;
	double precio;
	final double IVA = 0.21;
	int cuantosQuedan;

}
