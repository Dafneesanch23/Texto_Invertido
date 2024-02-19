package gen;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*Crear un programa en Java que realice lo siguiente:
			eduardo
			odraude
			Debe solicitar al usuario por consola una palabra o frase.
			Debe mostrar por consola el texto escrito al revés.
			Entrada: 
			Salida: 
			Al final de tu práctica, tienes que subir el ejercicio a tu repositorio de GitHub y adjuntar el link.*/
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Introduzca una palabra o frase");
		String input = scanner.nextLine();
		
		
		for(int i = input.length()-1; i >= 0; i--) {
			System.out.print(input.charAt(i));
		}
	}
	
}
