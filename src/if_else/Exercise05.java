package if_else;

import java.util.Scanner;

public class Exercise05 {
	public static void main(String[] args) {
		// Creation a new scanner
		Scanner sc = new Scanner(System.in);

		// Declaration a new variable for contain answer of users
		String usuario1;
		String usuario2;

		// Ask to the first user for for his choice
		System.out.println("Usuario uno elige si usar piedra, papel o tijeras:");
		usuario1 = sc.next();

		// Ask to the second user for for his choice
		System.out.println("Usuario dos elige si usar piedra, papel o tijeras:");
		usuario2 = sc.next();

		// Check which user wins rock, paper and scissors
		if (usuario1.equals("piedra") || usuario1.equals("papel")
				|| usuario1.equals("tijeras") && usuario2.equals("piedra") || usuario2.equals("papel")
				|| usuario2.equals("tijeras")) {

			if (usuario1.equals("piedra") && usuario2.equals("tijeras")
					|| usuario1.equals("papel") && usuario2.equals("piedra")
					|| usuario1.equals("tijeras") && usuario2.equals("papel")) {
				System.out.println("El usuario uno gana.");
			} else if (usuario1.equals(usuario2)) {
				System.out.println("Empate volved a repetir.");
			} else {
				System.out.println("El usuario dos gana.");
			}

		} else {
			System.out.println("No has escrito bien las opciones.");
		}

		sc.close();
	}
}