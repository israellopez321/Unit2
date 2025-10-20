package switch_;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		// Creation a new Scanner
		Scanner sc = new Scanner(System.in);

		// Declaration a variable for contain the note
		int nota;

		// Ask the user by his note
		System.out.println("Introduzca la nota entera obtenida:");
		nota = sc.nextInt();

		// Use switch for show the result according to note
		switch (nota) {

		case 0, 1, 2, 3, 4 -> System.out.println("Insuficiente");
		case 5 -> System.out.println("Suficiente");
		case 6 -> System.out.println("Bien");
		case 7, 8 -> System.out.println("Notable");
		case 9, 10 -> System.out.println("Sobresaliente");
		default -> System.out.println("Nota incorrecta");
		}
		sc.close();
	}

}
