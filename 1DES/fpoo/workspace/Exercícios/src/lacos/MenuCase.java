package lacos;

import java.util.Scanner;

public class MenuCase {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int opcao = 0;
		while (opcao != 4) {
			System.out.println("Digite uma das quatro op��es:");
			System.out.println("1-Bom dia\n2-Boa tarde\n3-Boa noite\n4-Sair");
			opcao = ler.nextInt();
			switch (opcao) {
			case 1:
				System.out.println("Ol�, bom dia!");
				break;
			case 2:
				System.out.println("Ol�, boa tarde!");
				break;
			case 3:
				System.out.println("Ol�, boa noite!");
				break;
			case 4:
				System.out.println("At� logo!");
				break;
			default:
				System.out.println("Op��o inv�lida!");
				break;
			}
		}
	}
}
