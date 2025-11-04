package while_;

import java.util.Scanner;

public class Exercise05 {
	public static void main(String[] args) {
		// Creamos un escaner
		Scanner sc = new Scanner(System.in);
		
		// Declaramos una variable para contener las edades introducidas por el usuario
		int edad;
		
		// Declaramos unas variables para contener un contador, la suma de las edades y el contador de mayores de edad
		int contador = 0;
		int suma = 0;
		int contadorMayores = 0;
		
		//Declaramos una variable para contener la media de edad
		double media;
		
		//Le pedimos al usuario que introduzca una edad
		System.out.println("Introduzca una edad, en caso de que quiera terminar el programa añada una edad negativa: ");
		edad = sc.nextInt();
		
		//Usamos while para calcular la suma de todas las edades introducidas, la media, el número de alumnos y cuántos son mayores de edad.
		while (edad >= 0) {
			contador++;
			suma += edad;
			if (edad >= 18) {
				contadorMayores++;
			}
			System.out.println("Introduzca una edadm en caso de que quiera terminar el programa añada una edad negativa: ");
			edad = sc.nextInt();
		}
		
		//Calculamos la media de edad
		media = suma / contador;
		
		//Le mostramos al usuario la suma de todas las edades introducidas, la media, el número de alumnos y cuántos son mayores de edad.
		System.out.println("Suma de edades: " + suma);
		System.out.println("Media de edades: " + media);
		System.out.println("Número de alumnos: " + contador);
		System.out.println("Mayores de edad: " + contadorMayores);
		
		//Cerramos escaner
		sc.close();
	}
}
