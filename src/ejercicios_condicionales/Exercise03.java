package ejercicios_condicionales;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		
		// Entrada -9923 || Resultado esperado: Letra de DNI  || Resultado obtenido: El DNI introducido no puede contener ni más ni menos de 8 cifras.
		// Entrada 46345839 || Resultado esperado: Letra de DNI  || Resultado obtenido: La letra correspondiente a tu DNI es B.
		// Entrada 323456734 || Resultado esperado: Letra de DNI  || Resultado obtenido: El DNI introducido no puede contener ni más ni menos de 8 cifras.
		// Entrada -35654937 || Resultado esperado: Letra de DNI  || Resultado obtenido: El DNI introducido no puede contener ni más ni menos de 8 cifras.
		
		//Creamos el escaner
		Scanner sc = new Scanner(System.in);
		
		//Declaramos una variable para 
		int DNI;
		
		//Declaramos una variable para contener la operación para calcular la letra del DNI
		int letra;
		
		//Le pedimos al usuario el numero del DNI
		System.out.println("Introduzca los números de tu DNI:");
		DNI = sc.nextInt();
		
		//Calculamos el número para mostrar su letra correspondiente
		letra = DNI % 23;
		
		//Con un if restringimos el valor del DNI al rango, con switch le damos al resultado de letra un valor alfabetico y lo mostramos
		if (DNI > 9999999 && DNI < 100000000) {
			switch (letra) {
			case 0 -> System.out.println("La letra correspondiente a tu DNI es T.");
			case 1 -> System.out.println("La letra correspondiente a tu DNI es R.");
			case 2 -> System.out.println("La letra correspondiente a tu DNI es W.");
			case 3 -> System.out.println("La letra correspondiente a tu DNI es A.");
			case 4 -> System.out.println("La letra correspondiente a tu DNI es G.");
			case 5 -> System.out.println("La letra correspondiente a tu DNI es M.");
			case 6 -> System.out.println("La letra correspondiente a tu DNI es Y.");
			case 7 -> System.out.println("La letra correspondiente a tu DNI es F.");
			case 8 -> System.out.println("La letra correspondiente a tu DNI es P.");
			case 9 -> System.out.println("La letra correspondiente a tu DNI es D.");
			case 10 -> System.out.println("La letra correspondiente a tu DNI es X.");
			case 11 -> System.out.println("La letra correspondiente a tu DNI es B.");
			case 12 -> System.out.println("La letra correspondiente a tu DNI es N.");
			case 13 -> System.out.println("La letra correspondiente a tu DNI es J.");
			case 14 -> System.out.println("La letra correspondiente a tu DNI es Z.");
			case 15 -> System.out.println("La letra correspondiente a tu DNI es S.");
			case 16 -> System.out.println("La letra correspondiente a tu DNI es Q.");
			case 17 -> System.out.println("La letra correspondiente a tu DNI es V.");
			case 18 -> System.out.println("La letra correspondiente a tu DNI es H.");
			case 19 -> System.out.println("La letra correspondiente a tu DNI es L.");
			case 20 -> System.out.println("La letra correspondiente a tu DNI es C.");
			case 21 -> System.out.println("La letra correspondiente a tu DNI es K.");
			case 22 -> System.out.println("La letra correspondiente a tu DNI es E.");
			default -> System.out.println("ERROR");
			}
		} else {
			System.out.println("El DNI introducido no puede contener ni más ni menos de 8 cifras.");
		}
		
		sc.next();
	}

}
