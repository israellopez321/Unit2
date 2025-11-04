package while_;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		//Creamos un escaner
		Scanner sc = new Scanner(System.in);
		
		//Declaramos una variable para contener los numeros introducidos por el usuario
		int numero;
		
		//Declaramos una variables para contener un contador, la suma de los numeros y la media
		int suma = 0;
		int contador = 0;
		double media;
		
		//Le pedimos al usuario un numero entero positivo
		System.out.println("Introduzca un numero entero positivo, en caso de que quiera finalizar este programa introduzca uno negativo:");
		numero = sc.nextInt();
		
		//Usamos while para contar y sumar los numeros introducidos
		while (numero >= 0) {
			suma += numero;
			contador++;
			System.out.println("Introduzca un número entero positivo, en caso de que quiera finalizar este programa introduzca uno negativo:");
			numero = sc.nextInt();
		}
		
		//Calculamos la media de los numeros
		media = suma / contador;
		
		//Le mostramos al usuario la media calculada
		System.out.println("La media de los números introducidos es igual a " + media);
		
		//Cerramos escaner
		sc.close();
	}

}
