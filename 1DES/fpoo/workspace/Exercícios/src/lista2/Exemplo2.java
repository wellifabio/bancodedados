package lista2;

import java.util.Scanner;

public class Exemplo2 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite a sua idade:");

		int idade = leia.nextInt();

		if (idade <= 0) {
			System.out.println("Idade inv�lida");
		} else {
			if (idade >= 18) {
				System.out.println("Voc� � 'DE-MAIOR'");
			} else {
				System.out.println("Voc� � 'DE-MENOR'");
			}
		}

	}
}
