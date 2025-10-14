package Diagramas;

import java.util.Scanner;

public class Exercise03 {
	public static void main(String[] args) {
		// Creamos un nuevo escaner
		Scanner sc = new Scanner(System.in);

		// Declaramos la variable para contener dos numeros
		int num1;
		int num2;

		// Declaramos la variables para las operaciones matemáticas
		int suma;
		int resta;
		int mult;
		double div;

		// Preguntamos al usuario por el primer número
		System.out.println("Introduzca el primer número:");
		num1 = sc.nextInt();

		// Preguntamos al usuario por el segundo número
		System.out.println("Introduzca el segundo número:");
		num2 = sc.nextInt();

		// Calculamos la suma de los dos números
		suma = num1 + num2;

		// Imprimimos el resultado
		System.out.println("La suma de " + num1 + " y " + num2 + " es igual a " + suma);

		// Calculamos la resta de los dos números
		resta = num1 - num2;

		// Imprimimos el resultado
		System.out.println("La resta de " + num1 + " y " + num2 + " es igual a " + resta);

		// Calculamos la multiplicación de los dos números
		mult = num1 * num2;

		// Imprimimos el resultado
		System.out.println("La multiplicación de " + num1 + " y " + num2 + " es igual a " + mult);

		// Comprobamos si el segundo número es 0 para poder realizar la division y la
		// imprimimos
		if (num2 == 0) {
			System.out.println("Error, no se puede dividir por 0.");
		} else {
			div = num1 / num2;
			System.out.println("La división de " + num1 + " y " + num2 + " es igual a " + div);
		}

		sc.close();
	}
}
