package switch_;

import java.util.Scanner;

public class Exercise02 {
	public static void main(String[] args) {
		// Creation a new Scanner
		Scanner sc = new Scanner(System.in);

		// Declaration a variable for contain a number between 1 and 7
		int dia;

		// Ask the user for the number
		System.out.println("Introduzca un número entero entre el 1 y el 7:");
		dia = sc.nextInt();

		// Use switch for show the result according to number
		switch (dia) {

		case 1 -> System.out.println("Lunes");
		case 2 -> System.out.println("Martes");
		case 3 -> System.out.println("Miércoles");
		case 4 -> System.out.println("Jueves");
		case 5 -> System.out.println("Viernes");
		case 6 -> System.out.println("Sábado");
		case 7 -> System.out.println("Domingo");
		default -> System.out.println("Número incorrecto.");

		}
		sc.close();
	}
}
