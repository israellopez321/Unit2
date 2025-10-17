package if_else;

import java.util.Scanner;

public class Exercise04 {
	public static void main(String[] args) {
		// Creation a new scanner
		Scanner sc = new Scanner(System.in);

		// Declaration of a variable for contain a number
		int num;

		// Ask the user for a number between 0 and 99999
		System.out.println("Introduce un número entre el 0 y el 99999:");
		num = sc.nextInt();

		// Checking if the number is between 0 and 99999
		if (num >= 0 && num <= 99999) {
			if (num > 9) {
				if (num > 99) {
					if (num > 999) {
						if (num > 9999) {
							if (num > 99999) {
								System.out.println("El número introducido no esta en el rango.");
							} else {
								System.out.println("El número introducido tiene 5 cifras.");
							}
						} else {
							System.out.println("El número introducido tiene 4 cifras.");
						}
					} else {
						System.out.println("El número introducido tiene 3 cifras.");
					}
				} else {
					System.out.println("El número introducido tiene 2 cifras.");
				}
			} else {
				System.out.println("El número introducido tiene 1 cifra.");
			}
		} else {
			System.out.println("El número introducido no esta en el rango.");
		}

		sc.close();
	}
}
