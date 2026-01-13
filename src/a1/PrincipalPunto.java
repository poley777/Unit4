package a1;

public class PrincipalPunto {

	public static void main(String[] args) {
		
		//Creamos los 3 puntos
		Punto p1 = new Punto();
		p1.x = 5;
		p1.y = 0;
		
		Punto p2 = new Punto();
		p2.x = 10;
		p2.y = 10;
		
		Punto p3 = new Punto();
		p3.x = -3;
		p3.y = 7;

		//Mostramos por pantalla las coordenadas de los puntosç
		System.out.println("Punto 1: (" + p1.x + ", " + p1.y +")");
		System.out.println("Punto 2: (" + p2.x + ", " + p2.y +")");
		System.out.println("Punto 3: (" + p3.x + ", " + p3.y +")");
		
		//Modificamos las distintas coordenadas
		p1.x = p2.x + p1.x;
		p2.y = p3.x - p2.y;
		p3.x = p1.x * p3.y;
		p2.x = p1.y - p3.y;
		p1.y = p3.x / p2.x;
		p3.y = p2.y + p3.x;
		
		//Volvemos a imprimir los puntos
		System.out.println("Punto 1: (" + p1.x + ", " + p1.y +")");
		System.out.println("Punto 2: (" + p2.x + ", " + p2.y +")");
		System.out.println("Punto 3: (" + p3.x + ", " + p3.y +")");


	}
}