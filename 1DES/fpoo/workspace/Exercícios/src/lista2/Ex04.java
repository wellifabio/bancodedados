package lista2;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// Entrada
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite os valores dos tr�s lados do tri�ngulo:");
		int a = leia.nextInt();
		int b = leia.nextInt();
		int c = leia.nextInt();

		// Processamento
		String triangulo = "N�o sei";
		
		if (a == b && b == c) {
			triangulo = "EQUIL�TERO";
		} else if (a != b && b != c && a != c) {
			triangulo = "ESCALENO";
		} else {
			triangulo = "ISOCELES";
		}
		
		// Sa�da
		System.out.println("O tri�nguo �: " + triangulo);
	}
}
