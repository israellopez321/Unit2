package for_;

import java.util.Scanner;

public class Exercise07 {
	public static void main(String[] args) {
		// Creamos un escaner
		Scanner sc = new Scanner(System.in);

		// Declaramos una variable para contener un numero entero positivo
		int num;

		// Declaramos una variable para contener un booleano en caso de que sea primo el numero sera true
		boolean esPrimo = true;

		// Le pedimos al usuario introducir un numero
		System.out.println("Introduzca un número entero y positivo para saber si es primo:");
		num = sc.nextInt();

		// Usamos if para comprobar de que el numero no sea 1
		if (num == 1) {
			esPrimo = false;
		}

		// Utilizamos for para comprobar si el numero es primo
		for (int cont = 2; cont <= Math.sqrt(num); cont++) {

			if (num % cont == 0 && num != cont) {
				esPrimo = false;
			} // Fin if
		}

		// Mostramos al usuario un menaje segun si el numero es primo o no
		if (esPrimo) {
			System.out.println("El número " + num + " es primo.");
		} else {
			System.out.println("El número " + num + " no es primo.");
		}//Fin else

		// Cerramos el escaner
		sc.close();
	}
}
