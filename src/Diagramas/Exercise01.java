package Diagramas;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		// Declaration a variable for age
		int edad;

		// Creation a new scanner
		Scanner sc = new Scanner(System.in);

		// Ask the user for the age
		System.out.println("Introduzca su edad:");
		edad = sc.nextInt();

		// Check the age

		if (edad >= 18) {
			System.out.println("Eres mayor de edad");
		}

		sc.close();
	}

}
