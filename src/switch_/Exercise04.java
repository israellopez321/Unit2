package switch_;

import java.util.Scanner;

public class Exercise04 {
	public static void main(String[] args) {
		// Create a new Scanner
		Scanner sc = new Scanner(System.in);

		// Declaration a variables for contain the result of dice rolls
		String tirada1;
		String tirada2;
		int dado1 = 0;
		int dado2 = 0;
		
		// Declaration a variable for contain the addition of the rolls
		int sumaDados;

		// Ask the user for the number of first roll
		System.out.println("Introduzca el valor del primer dado lanzado:");
		tirada1 = sc.next();

		// Use switch for show result according the result of first dice rolls
		switch (tirada1) {
		case "UNO" -> dado1 = 1;
		case "DOS" -> dado1 = 2;
		case "TRES" -> dado1 = 3;
		case "CUATRO" -> dado1 = 4;
		case "CINCO" -> dado1 = 5;
		case "SEIS" -> dado1 = 6;
		default -> System.out.println("El valor del dado es imposible.");
		}

		// Ask the user for the number of second roll
		System.out.println();
		System.out.println("Introduzca el valor del segundo dado lanzado:");
		tirada2 = sc.next();
		System.out.println();

		// Use switch for show result according the result of second dice rolls
		switch (tirada2) {
		case "UNO" -> dado2 = 1;
		case "DOS" -> dado2 = 2;
		case "TRES" -> dado2 = 3;
		case "CUATRO" -> dado2 = 4;
		case "CINCO" -> dado2 = 5;
		case "SEIS" -> dado2 = 6;
		default -> System.out.println("El valor del dado es imposible.");
		}

		// Calculate the addition of rolls
		sumaDados = dado1 + dado2;

		// Check if the valor of rolls are corrects and show the final result of rolls
		if (dado1 <=6 && dado2 <= 6) {
			System.out.println("Has sacado un " + sumaDados);	
		}
		
		sc.close();
	}
}
