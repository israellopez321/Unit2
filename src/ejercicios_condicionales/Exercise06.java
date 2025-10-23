package ejercicios_condicionales;

import java.util.Scanner;

public class Exercise06 {
	public static void main(String[] args) {

		// Entrada mes 4, año 1989 || Resultado esperado: Cuántos dias tiene el mes || Resultado obtenido: Este mes tiene 30 días.
		// Entrada mes 32, año 3208 || Resultado esperado: Cuántos dias tiene el mes  || Resultado obtenido: El año solo tiene 12 meses.
		// Entrada mes 2, año 1204 || Resultado esperado: Cuántos dias tiene el mes || Resultado obtenido: El mes tiene 29 días.
		// Entrada mes 2, año 2007|| Resultado esperado: Cuántos dias tiene el mes  || Resultado obtenido: El mes tiene 28 dias.
		
		// Creamos un escaner
		Scanner sc = new Scanner(System.in);

		// Declaramos una variable para contener el año y mes introducido por el usuario
		int mes;
		int año;

		// Le preguntamos al usuario por el mes
		System.out.println("Introduzca un mes para calcular sus días:");
		mes = sc.nextInt();

		// Le preguntamos al usuario por el año
		System.out.println("Introduzca el año:");
		año = sc.nextInt();

		// Usamos switch para mostrar una solucion segun el mes y usamos if para
		// comprobar si el año es bisiesto
		switch (mes) {
		case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("Este mes tiene 31 días.");
		case 4, 6, 9, 11 -> System.out.println("Este mes tiene 30 días.");
		case 2 -> {
			if (año % 4 == 0) {
				System.out.println("El mes tiene 29 días.");
			} else {
				System.out.println("El mes tiene 28 dias.");
			} // fin if
		} // Fin case
		default -> System.out.println("El año solo tiene 12 meses.");
		}

		sc.close();
	}
}
