package a3;

public class PrincipalRectangulo {

	public static void main(String[] args) {

		// Creamos el rectangulo 1
		Rectangulo r1 = new Rectangulo();
		r1.x1 = 0;
		r1.y1 = 0;
		r1.x2 = 5;
		r1.y2 = 5;

		// Creamos el rectangulo 2
		Rectangulo r2 = new Rectangulo();
		r2.x1 = 7;
		r2.y1 = 9;
		r2.x2 = 2;
		r2.y2 = 3;

		// Hacemos el perimetro y las áreas de los dos rectangulos
		int perimetro1 = 2 * ((r1.x2 - r1.x1) + (r1.y2 - r1.y1));
		int perimetro2 = 2 * ((r2.x2 - r2.x1) + (r2.y2 - r2.y1));
		double area1 = (r1.x2 - r1.x1) * (r1.y2 - r1.y1);
		double area2 = (r2.x2 - r2.x2) * (r2.y2 - r2.y2);

		// Hacemos que salga siempre positivo las medidas
		perimetro1 = Math.abs(perimetro1);
		perimetro2 = Math.abs(perimetro2);
		area1 = Math.abs(area1);
		area2 = Math.abs(area2);

		// Mostramos las coordenadas, perimetros y areas
		System.out.println(
				"Coordenadas rectangulo 1: " + "(" + r1.x1 + "," + r1.y1 + ")" + "(" + r1.x2 + "," + r1.y2 + ")");
		System.out.println(
				"Coordenadas rectangulo 2: " + "(" + r2.x1 + "," + r2.y1 + ")" + "(" + r2.x2 + "," + r2.y2 + ")");
		System.out.println("Perimetro rectangulo 1: " + perimetro1);
		System.out.println("Perimetro rectangulo 2: " + perimetro2);
		System.out.println("Área rectangulo 1: " + area1);
		System.out.println("Área rectangulo 2: " + area2);

		// Cambiamos las coordenadas de los rectangulos
		r1.x1 = 1;
		r1.y1 = 1;
		r1.x2 = 3;
		r1.y2 = 3;
		r2.x1 = 8;
		r2.y1 = 8;
		r2.x2 = 4;
		r2.y2 = 5;

		// Hacemos el perimetro y las áreas de los dos rectangulos
		perimetro1 = 2 * ((r1.x2 - r1.x1) + (r1.y2 - r1.y1));
		perimetro2 = 2 * ((r2.x2 - r2.x1) + (r2.y2 - r2.y1));
		area1 = (r1.x2 - r1.x1) * (r1.y2 - r1.y1);
		area2 = (r2.x2 - r2.x2) * (r2.y2 - r2.y2);

		// Hacemos que salga siempre positivo las medidas
		perimetro1 = Math.abs(perimetro1);
		perimetro2 = Math.abs(perimetro2);
		area1 = Math.abs(area1);
		area2 = Math.abs(area2);

		// Mostramos las coordenadas, perimetros y areas
		System.out.println("Coordenadas rectangulo 1(modificadas): " + "(" + r1.x1 + "," + r1.y1 + ")" + "(" + r1.x2 + "," + r1.y2 + ")");
		System.out.println("Coordenadas rectangulo 2(modificadas): " + "(" + r2.x1 + "," + r2.y1 + ")" + "(" + r2.x2 + "," + r2.y2 + ")");
		System.out.println("Perimetro rectangulo 1(modificadas): " + perimetro1);
		System.out.println("Perimetro rectangulo 2(modificadas): " + perimetro2);
		System.out.println("Área rectangulo 1(modificadas): " + area1);
		System.out.println("Área rectangulo 2(modificadas).: " + area2);
		
		

	}

}
