package for_;

import java.util.Scanner;

public class Exercise06 {
	public static void main(String[] args) {
		// Creamos un escaner
		Scanner sc = new Scanner(System.in);

		// Declaramos una variable para contener las calificaciones
		double notas;

		// Declaramos una variable para contener los suspensos
		int contSuspensos = 0;

		// Usamos for para preguntar repetidamente las calificaciones y contar los suspensos
		
		for (int cont = 1; cont <= 5; cont++) {
			System.out.println("Introduzca una calificación:");
			notas = sc.nextDouble();

			if (notas < 5) {
				contSuspensos++;
			}
		}

		// Le mostramos al usuario cuantos suspensos tiene
		System.out.println("Tienes " + contSuspensos + " suspensos");

		// Cerramos escaner
		sc.close();
	}
}