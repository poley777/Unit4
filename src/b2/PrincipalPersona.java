package b2;

import java.util.Scanner;

public class PrincipalPersona {

	public static void main(String[] args) {
		
		//Creamos un Scanner	
		Scanner sc = new Scanner (System.in);
		
		//Pedimos los datos por teclado de la persona 1
		System.out.println("Introduce el DNI de la persona 1: ");
		String dni1 = sc.nextLine();
		
		System.out.println("Introduce el nombre de la persona 1: ");
		String nombre1 = sc.nextLine();
		
		System.out.println("Introduce los apellidos de la persona 1: ");
		String apellidos1 = sc.nextLine();
		
		System.out.println("Introduce la edad de la persona 1: ");
		int edad1 = sc.nextInt();
		
		//Instanciamos la persona 1 
		Persona persona1 = new Persona (dni1, nombre1, apellidos1, edad1);
		
		//Calculamos si es mayor de edad
		if (persona1.edad >= 18) {
			System.out.println(persona1.nombre + " " + persona1.apellidos + " es mayor de edad.");
		} else {
			System.out.println(persona1.nombre + " " + persona1.apellidos + " es menor de edad.");
		}
		
		
	}
		

}