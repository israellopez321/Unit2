package for_;

public class Exercise04 {
	public static void main(String[] args) {
		
		//Declaramos una variable para contener la suma de los numeros
		int suma = 0;
		
		//Usamos for para sumar los 10 primero numeros impares
		for (int cont = 1; cont<=20; cont += 2) {
			suma += cont; 
		}
		
		//Le mostramos al usuario la suma de los numeros impares
		System.out.println("La suma de los primeros 10 números impares es igual a " + suma);
	}
}
