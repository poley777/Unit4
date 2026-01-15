package a2;

import java.util.Scanner;

public class PrincipalPersona {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Persona p1 = new Persona();
		
		System.out.println("Introduzca su nombre");
		p1.nombre = sc.nextLine();
		
		System.out.println("Introduzca sus apellidos");
		p1.apellidos = sc.nextLine();
		
		System.out.println("Introduzca su dni");
		p1.dni = sc.nextLine();
		
		System.out.println("Introduzca su edad");
		p1.edad = sc.nextInt();
		
		String mayorEdad1;
		
		if(p1.edad >= 18) {
			mayorEdad1 = " es mayor de edad";
		} else {
			mayorEdad1 = " no es mayor de edad";
		}
		
		Persona p2 = new Persona();
		
		System.out.println("Introduzca su nombre");
		p2.nombre = sc.nextLine();
		
		System.out.println("Introduzca sus apellidos");
		p2.apellidos = sc.nextLine();
		
		System.out.println("Introduzca su dni");
		p2.dni = sc.nextLine();
		
		System.out.println("Introduzca su edad");
		p2.edad = sc.nextInt();
		
		String mayorEdad2;
		
		if(p2.edad >= 18) {
			mayorEdad2 = " es mayor de edad";
		} else {
			mayorEdad2 = " no es mayor de edad";
		}
		
		System.out.println(p1.nombre + p1.apellidos + "con DNI " + p1.dni + mayorEdad1);
		
		System.out.println(p2.nombre + p2.apellidos + "con DNI " + p2.dni + mayorEdad2);
		
		sc.close();
		
	}

}
