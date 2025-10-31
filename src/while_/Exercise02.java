package while_;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		//Creamos un nuevo escaner
		Scanner sc = new Scanner(System.in);
		
		//Declaramos una variable para contener el numero de numero introducidos
		int contador = 0;
		
		//Declaramos una variable para contener el numero introducido por el usuario
		int numero;
		
		//Preguntamos al usuario por un numero entero
		System.out.println("Introduzca un número entero en caso de que quieras detener el programa introduzca un número negativo: ");
		numero = sc.nextInt();
		
		//Usamos while para preguntar por consola un numero y contarlo hasta que el usuario quiera detenerlo
		while (numero >= 0) {
			contador += 1;
			System.out.println("Introduzca un número entero en caso de que quieras detener el programa introduzca un número negativo: ");
			numero = sc.nextInt();
		}
		
		System.out.println("Se ha introducido " + contador + " números");
		sc.close();
	}

}
