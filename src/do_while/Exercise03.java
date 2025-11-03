package do_while;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		//Creamos un escaner
		Scanner sc = new Scanner(System.in);
		
		//Declaramos una variable para contener la suma hasta que llegue al número deseado
		int suma = 0;

		//Declaramos una variable para contener un contador
		int contador = 1;
		
		//Declaramos una variable para contener un numero dado por el usuario
		int numero;
		
		//Le pedimos un numero al usuario
		numero = sc.nextInt();
		
		//Usamos do para ir sumando los valores hasta llegar al numero introducido
		do {
			suma += contador;
			contador++;			
		} while(contador <= numero);
		
		//Le imprimimos al usuario la suma de los numeros
		System.out.println("La suma total es: " + suma);
		
		//Cerramos escaner
		sc.close();
	}

}
