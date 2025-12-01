package bucles;

import java.util.Scanner;

public class Exercise06 {
	public static void main(String[] args) {
		// Creamos un escaner
		Scanner sc = new Scanner(System.in);

		// Declaramos una variable para contener la altura
		int tam;

		// Le pedimos al usuario el tamaño
		System.out.println("Introduzca el tamaño del triángulo:");
		tam = sc.nextInt();

		// For para las filas
		for (int fila = 1; fila <= tam; fila++) {
			// Bucle para los espacios
			for (int espacio = 1; espacio <= tam - fila; espacio++) {
				System.out.print(" ");
			}

			// Bucle para lo asteriscos
			for (int asterisco = 1; asterisco <= fila; asterisco++) {
				System.out.print("* ");
			}

			System.out.println();
		}

		// Cerramos escaner
		sc.close();
	}
}
