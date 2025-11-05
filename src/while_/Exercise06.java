package while_;

import java.util.Scanner;

public class Exercise06 {
	public static void main(String[] args) {
		//Creamos un escaner
		Scanner sc = new Scanner(System.in);
		
		//Declaramos una variable para contener la altura maxima
		double max = 0;
		
		//Declaramos una variable para contener la altura introducida
		double altura;
		
		//Le preguntamos al usuario por la altura del arbol
		System.out.println("Introduzca la altura del árbol en caso de que termine el programa introduzca -1:");
		altura = sc.nextDouble();
		
		//Usamos if para darle un final al programa y while para ir cambiando la altura max
		if (altura != -1) {
			while (altura != -1) {
				if (altura > max) {
					max = altura;
				}//Fin if
				System.out.println("Introduzca la altura del árbol en caso de que termine el programa introduzca -1:");
				altura = sc.nextDouble();
			}//Fin while
		}//Fin if
		
		System.out.println("El árbol más alto mide: " + max + " cm.");
		sc.close();
	}
}
