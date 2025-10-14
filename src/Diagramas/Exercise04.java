package Diagramas;

import java.util.Scanner;

public class Exercise04 {
	public static void main(String[] args) {
		// Creamos un nuevo escaner
		Scanner sc = new Scanner(System.in);

		// Declaramos variables para contener dos números
		int num1;
		int num2;

		// Preguntamos al usuario por el primer número
		System.out.println("Introduzca el primer número: ");
		num1 = sc.nextInt();

		// Preguntamos al usuario por el segundo número
		System.out.println("Introduzca el segundo número: ");
		num2 = sc.nextInt();

		// Comprobamos cual de los dos números es mayor y imprimimos el mayor
		if (num1 > num2) {
			System.out.println("El " + num1 + " es mayor que el " + num2);
		} else {
			System.out.println("El " + num2 + " es mayor que el " + num1);

		}

		sc.close();
	}
}
