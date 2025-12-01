package bucles;

import java.util.Scanner;

public class Exercise08 {
	public static void main(String[] args) {
		//Creamos un escaner
		Scanner sc = new Scanner(System.in);
		
		//Variable para guardar los dos números introducidos por el usuario
		int num1;
		int num2;
		
		//Variable para contador número introducidos
		int numIntroducidos = 0;
		
		//Variable para contador números fallados
		int numFallo = 0;
		
		//Variable para contener el ultimo número introducido
		int numUltimo;
		
		//Le preguntamos al usuario por un numero inicial
		System.out.print("Introduzca el número inicial: ");
		numUltimo = sc.nextInt();
		
		//Bucle para preguntar por los números
		do {
			//Pedimos al usuario un números
			System.out.print("Dime un número: ");
			num1 = sc.nextInt();
			numIntroducidos++;
			
			//Pedimos al usuario otro número
			System.out.print("Dime un número: ");
			num2 = sc.nextInt();
			numIntroducidos++;
			
			if (num2 < numUltimo ) {
				numFallo++;
				System.out.println("Fallo es menor");
			}
			numUltimo = num2;
		} while(num1 != 0 || num2 != 0);
		
		System.out.println("Total de números introducidos: " + numIntroducidos);
		System.out.println("Número fallados: " + numFallo);
		
		sc.close();
	}
}
