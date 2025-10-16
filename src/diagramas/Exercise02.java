package diagramas;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		// Creamos el escaner
		Scanner sc = new Scanner(System.in);

		// Declaramos una variable para la edad
		int edad;

		// Preguntamos al usuario sobre su edad
		System.out.println("Introduzca su edad:");
		edad = sc.nextInt();

		// Comprobamos si es la edad es mayor que 18
		if (edad >= 18) {
			System.out.println("Eres mayor de edad.");
		} else {
			System.out.println("Eres menor de edad.");
		}

		sc.close();
	}

}