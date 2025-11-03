package do_while;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		//Creamos escaner
		Scanner sc = new Scanner(System.in);
		
		//Declaramos variable para contener un numero dado por el usuario
		int numero;
		
		//Declaramos una variable para contener el producto
		int producto = 1;
		
		//Declaramos una variable para contener el resultado
		int resultado = 0;
		
		//Le pedimos al usuario un numero
		System.out.println("Introduzca un número para mostrarle la tabla de multiplicar:");
		numero = sc.nextInt();
		
		//Usamos do para mostrar por pantalla la tabla del numero introducido
		do {
			resultado = numero * producto;
			System.out.println(numero + " x " + producto + " = " + resultado);
			producto++;
		} while(producto <= 10);
		
		sc.close();
	}

}
