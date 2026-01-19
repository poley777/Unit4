package b4;

import java.util.Scanner;

public class PrincipalArticulo {

	public static void main(String[] args) {
		
		//Creamos un scanner
		Scanner sc = new Scanner (System.in);
		
		//Pedimos los datos del articulo por teclado
		System.out.println("Introduce el nombre del articulo: ");
		String nombre = sc.nextLine();
		
		System.out.println("Introduce el precio del articulo: ");
		double precio = sc.nextDouble();
		
		System.out.println("Introduce la cantidad d3e articulos que quedan:");
		int cuantosQuedan = sc.nextInt();
		
		//Instanciamos el articulo
		Articulo articulo1 = new Articulo (nombre, precio, cuantosQuedan);
		
		//Calculamos el precio con IVA
		double precioConIva = articulo1.precio + (articulo1.precio * articulo1.IVA);
		
		//Mostramos los datos del articulo
		System.out.println("El articulo " + articulo1.nombre + " tiene un precio con IVA de " + precioConIva + " euros.");
		System.out.println("Quedan " + articulo1.cuantosQuedan + " unidades de este articulo.");
		
		//Cerramos el Scanner
		sc.close();
	}

}
