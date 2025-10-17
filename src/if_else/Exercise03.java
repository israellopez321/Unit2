package if_else;

import java.util.Scanner;

public class Exercise03 {
	public static void main(String[] args) {
		// Creation a new scanner
		Scanner sc = new Scanner(System.in);

		// Declaration the variables for contain the coefficients
		int a;
		int b;
		int c;

		// Declaration the variables for the results
		double resultado1;
		double resultado2;

		// Ask the user for the coefficient a
		System.out.println("Introduca el coeficiente a:");
		a = sc.nextInt();

		// Ask the user for the coefficient b
		System.out.println("Introduca el coeficiente b:");
		b = sc.nextInt();

		// Ask the user for the coefficient c
		System.out.println("Introduca el coeficiente c:");
		c = sc.nextInt();

		// Checking if the equation can be resolved
		if (Math.pow(b, 2) - 4 * c * a >= 0) {
			if (a != 0) {
				resultado1 = (-b + Math.pow(Math.pow(b, 2) - 4 * c * a, 0.5)) / (2 * a);
				resultado2 = (-b - Math.pow(Math.pow(b, 2) - 4 * c * a, 0.5)) / (2 * a);
				System.out.println("Las soluciones de la ecuacion son: " + resultado1 + " y " + resultado2);
			} else {
				resultado1 = -c / b;
				System.out.println("La solución de la ecuacion es: " + resultado1);
			} // Cierre else si la solución es a = 0
		} else {
			System.out.println("No se puede realizar la ecuación");
		} // Cierre else si no hay solución

		sc.close();
	}
}
