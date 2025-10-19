package if_else;

import java.util.Scanner;

public class Exercises06 {
	public static void main(String[] args) {
		// Create a new scanner
		Scanner sc = new Scanner(System.in);

		// Declaration variables for contain three numbers
		int number1;
		int number2;
		int number3;

		// Ask the user for the first number
		System.out.println("Introduzca el primer número:");
		number1 = sc.nextInt();

		// Ask the user for the second number
		System.out.println("Introduzca el segundo número:");
		number2 = sc.nextInt();

		// Ask the user for the third number
		System.out.println("Introduzca el tercer número:");
		number3 = sc.nextInt();

		// Check if the sum of two of those numbers gives the other number.
		if (number1 + number2 == number3) {
			System.out.println("La suma de " + number1 + " + " + number2 + " da como resultado " + number3 + ".");

		} else if (number1 + number3 == number2) {
			System.out.println("La suma de " + number1 + " + " + number3 + " da como resultado " + number2 + ".");

		} else if (number2 + number3 == number1) {
			System.out.println("La suma de " + number2 + " + " + number3 + " da como resultado " + number1 + ".");

		} else {
			System.out.println("La suma de dos de los números introducidos no da como resultado el otro.");
		}

		sc.close();
	}
}