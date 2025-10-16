package Diagramas;

import java.util.Scanner;

public class Exercise09 {
	public static void main(String[] args) {

		// Creamos un escaner
		Scanner sc = new Scanner(System.in);

		// Declaramos una variable para almacenar un número
		int num;

		// Le preguntamos al usuario por el número
		System.out.println("Introduzca su calificación para comprobar su nota:");
		num = sc.nextInt();

		//Comprobamos cual cual es la nota alfabetica correspondiente y se las mostramos
		if (num >= 0) {
			if (num >= 3) { 
				if (num >= 5) {
					if (num >= 7) {
						if (num >= 9) {
							if (num > 10) {
								System.out.println("La nota no puede ser mayor que 10.");
							} else {
								System.out.println("Sobresaliente");
							}
						} else {
							System.out.println("Notable");
						}
					} else {
						System.out.println("Bien");
					}
				} else {
					System.out.println("Insuficiente");
				}
			} else {
				System.out.println("Muy Deficiente");
			}
			
		} else {
			System.out.println("La nota no puede ser menor de 0.");
		}
		
		sc.close();
	}
}
