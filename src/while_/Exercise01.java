package while_;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		//Creation a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declaro una variable para contener la suma de los numeros
		int suma = 0;
		
		//Declaro una variable para contener un numero entero
		int numero;
		
		//Preguntar al usuario por un numero entero
		System.out.println("Introduzca un número entero en caso de que quieras detener el programa introduzca un número negativo: ");
		numero = sc.nextInt();
		
		//Usamos while para preguntar por consola un numero y sumarlo hasta que el usuario quiera detenerlo
		while (numero >= 0) {
			suma += numero;
			System.out.println("Introduzca un número entero en caso de que quieras detener el programa introduzca un número negativo: ");
			numero = sc.nextInt();
	}
		//Le mostramos al usuario la suma de los números introducidos
		System.out.println("La suma de los números introducidos es igual a " + suma);
		sc.close();
	}
	}
