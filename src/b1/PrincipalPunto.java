package b1;

public class PrincipalPunto {

	public static void main(String[] args) {
	
		//Objeto 1-Inicializado con constructor
		Punto p1 = new Punto(5,0);
		
		//Objeto 2-Inicializado con constructor
		Punto p2 = new Punto(2,6);
		
		//Objeto 3-Inicializado con constructor
		Punto p3 = new Punto(1,8);
		
		//Imprimimos las coordenadas
		System.out.println("(" + p1.x + "," + p1.y + ")");
		System.out.println("(" + p2.x + "," + p2.y + ")");
		System.out.println("(" + p3.x + "," + p3.y + ")");
	}

}
