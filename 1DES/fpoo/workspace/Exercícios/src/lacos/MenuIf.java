package lacos;

import java.util.Scanner;

public class MenuIf {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int opcao = 0;
		while (opcao != 4) {
			System.out.println("Digite uma das quatro op��es:");
			System.out.println("1-Bom dia\n2-Boa tarde\n3-Boa noite\n4-Sair");
			opcao = ler.nextInt();
			if (opcao == 1) {
				System.out.println("Ol�, bom dia!");
			} else if (opcao == 2) {
				System.out.println("Ol�, boa tarde!");
			} else if (opcao == 3) {
				System.out.println("Ol�, boa noite!");
			} else if (opcao == 4) {
				System.out.println("At� logo!");
			} else {
				System.out.println("Op��o inv�lida!");
			}
		}
	}
}
