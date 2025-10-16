package diagramas;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		// Creamos un nuevo escaner
		Scanner sc = new Scanner(System.in);

		// Declaramos las variables para contener dos numeros
		int num1;
		int num2;

		// Preguntamos al usuario el primer numero
		System.out.println("Introduzca el primer número:");
		num1 = sc.nextInt();

		// Preguntamos al usuario el segundo numero
		System.out.println("Introduzca el segundo número:");
		num2 = sc.nextInt();

		// Comprobamos cual de los numero es mayor menor o igual y lo mostramos en
		// pantalla
		if (num1 > num2) {
			System.out.println("El " + num1 + " es mayor que " + num2);
		} else if (num1 == num2) {
			System.out.println("Los números son iguales");
		} else {
			System.out.println("El " + num2 + " es mayor que " + num1);
		}

		sc.close();
	}

}
