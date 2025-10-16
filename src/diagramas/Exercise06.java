package diagramas;

import java.util.Scanner;

public class Exercise06 {
	public static void main(String[] args) {
		// Creamos un nuevo escaner
		Scanner sc = new Scanner(System.in);

		// Declaramos dos variables para contener dos numeros
		int num1;
		int num2;

		// Preguntamos al usuario por el primer número
		System.out.println("Introduzca el primer número:");
		num1 = sc.nextInt();

		// Preguntamos al usuario por el segundo número
		System.out.println("Introduzca el segundo número:");
		num2 = sc.nextInt();

		// Comprobamos cual de los dos numeros es mayor y los imprimimos en orden
		// ascendente
		if (num1 > num2) {
			System.out.println("En orden ascente los números serían: " + num2 + " y " + num1);
		} else if (num1 == num2) {
			System.out.println("Da igual el orden los números son iguales");
		} else {
			System.out.println("En orden ascente los números serían: " + num1 + " y " + num2);
		}

		sc.close();
	}
}
