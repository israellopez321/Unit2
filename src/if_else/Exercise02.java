package if_else;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		//Creation a new scanner
		Scanner sc = new Scanner(System.in);
		
		//Declararion a varible for contain a number
		double num;
		
		//Ask the user for a decimal number
		System.out.println("Introduzca un número decimal:");
		num = sc.nextDouble();
		
		//Checking if it is a number almost-zero
		if (num < 1 && num > -1){
			if (num == 0) {
				System.out.println("El número no es casi-cero");
			} else {
				System.out.println("El número es casi-cero");
			}
		}else {
			System.out.println("El número no es casi-cero");
		}
		sc.close();
	}

}
