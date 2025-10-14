package Diagramas;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {
		// Creamos un nuevo escaner
		Scanner sc = new Scanner(System.in);

		// Declaramos una variable para contener un número
		int num;

		// Le preguntamos al usuario cual es el número
		System.out.println("Introduzca el número:");
		num = sc.nextInt();

		// Comprobamos si el numero es mayor o igual que 0 y imprimimos el resultado
		if (num >= 0) {
			System.out.println("El número es positivo.");
		} else {
			System.out.println("El número es negativo.");
		}

		sc.close();
	}
}
