package do_while;

public class Exercise02 {

	public static void main(String[] args) {
		
		//Declaramos una variable para contener un numero par que se va a ir sumando
		int numero = 2;
		
		//Usamos do para ir mostrando todos los numeros pares
		do {
			System.out.println(numero);
			numero++;
		} while(numero <= 200);

	}

}
