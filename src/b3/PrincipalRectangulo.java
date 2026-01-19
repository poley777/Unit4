package b3;

import java.util.Scanner;

public class PrincipalRectangulo {

	public static void main(String[] args) {
		
		//Creamos un nuevo Scanner
		Scanner sc = new Scanner (System.in);
		
		//Pedimos las coordenadas por teclado
		System.out.println("Introduce la coordenada x1:");
		int x1 = sc.nextInt();
		
		System.out.println("Introduce la coordenada y1: ");
		int y1 = sc.nextInt();
		
		System.out.println("Introduce la coordenada x2: ");
		int x2 = sc.nextInt();
		
		System.out.println("Introduce la coordenada y2: ");
		int y2 = sc.nextInt();
		
		//Instanciamos el rectangulo
		Rectangulo rectangulo1 = new Rectangulo (x1, y1, x2, y2);
		
		//Mostramos las coordenadas del rectangulo
		System.out.println("Las coordenadas del rectangulo son: ");
		System.out.println("Punto 1: (" + rectangulo1.x1 + ", " + rectangulo1.y1 + ")");
		System.out.println("Punto 2: (" + rectangulo1.x2 + ", " + rectangulo1.y2 + ")");
	
	}

}
