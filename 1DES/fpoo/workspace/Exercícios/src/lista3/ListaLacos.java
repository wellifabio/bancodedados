package lista3;

import java.util.Scanner;

public class ListaLacos {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int opcao = 0;
		while (opcao != 14) {
			System.out.println("Digite uma op�o:");
			System.out.println("1-Programa1\t5-Programa5\t9-Programa9\t13-Programa13");
			System.out.println("2-Programa2\t6-Programa6\t10-Programa10\t14-Sair");
			System.out.println("3-Programa3\t7-Programa7\t11-Programa11");
			System.out.println("4-Programa4\t8-Programa8\t12-Programa12");
			opcao = leia.nextInt();
			switch (opcao) {
			case 1:
				/*
				 * 1- Fa�a um programa que imprima na tela os valores no
				 * intervalo entre 10 e 200.
				 */
				for (int i = 10; i <= 200; i++) {
					System.out.println(i);
				}
				break;
			case 2:
				/*
				 * Fa�a um programa que imprima na tela os valores no intervalo
				 * entre 200 e 1.
				 */
				for (int i = 200; i > 0; i--) {
					System.out.println(i);
				}
				break;
			case 3:
				/*
				 * Fa�a um programa onde o usu�rio digite um valor, e imprima na
				 * tela todos os valores entre 0 e o valor digitado.
				 */
				System.out.println("Digite um valor inteiro maior do que 0:");
				int valor = leia.nextInt();
				for (int i = 0; i < valor; i++) {
					System.out.println(i);
				}
				break;
			case 4:
				/*
				 * Fa�a um programa onde o usu�rio digite dois valores, e
				 * imprima na tela todos os valores no intervalo entre os
				 * valores digitados.
				 */
				System.out.println("Digite um valor inteiro:");
				int valor1 = leia.nextInt();
				System.out.println("Digite outro valor inteiro maior do que o primeiro:");
				int valor2 = leia.nextInt();
				for (int i = valor1; i < valor2; i++) {
					System.out.println(i);
				}
				break;
			case 5:
				/*
				 * Fa�a um programa que imprima na tela todos os n�meros pares
				 * de um intervalo informado pelo usu�rio.
				 */
				System.out.println("Digite um valor inteiro:");
				int inicio = leia.nextInt();
				System.out.println("Digite outro valor inteiro maior do que o primeiro:");
				int fim = leia.nextInt();
				for (int i = inicio; i < fim; i++) {
					if (i % 2 == 0)
						System.out.println(i);
				}
				break;
			case 6:
				/*
				 * Fa�a um programa que imprima na tela a soma dos valores entre
				 * 0 e 100.
				 */
				int soma = 0;
				for (int i = 0; i < 100; i++) {
					soma += i;
				}
				System.out.println("A soma dos valores entre 0 e 100 � = " + soma);
				break;
			case 7:
				/*
				 * Fa�a um programa que imprima na tela a soma dos valores de um
				 * intervalo definido pelo usu�rio.
				 */
				System.out.println("Digite um valor inteiro:");
				int begin = leia.nextInt();
				System.out.println("Digite outro valor inteiro maior do que o primeiro:");
				int end = leia.nextInt();
				int sum = 0;
				for (int i = begin; i < end; i++) {
					sum += i;
				}
				System.out.println("A soma dos valores entre " + begin + " e " + end + " � = " + sum);
				break;
			case 8:
				/*
				 * Fa�a um programa que imprima na tela a soma dos valores pares
				 * de um intervalo definido pelo usu-�rio.
				 */
				System.out.println("Digite um valor inteiro:");
				int in = leia.nextInt();
				System.out.println("Digite outro valor inteiro maior do que o primeiro:");
				int fi = leia.nextInt();
				int somapar = 0;
				for (int i = in; i < fi; i++) {
					if (i % 2 == 0)
						somapar += i;
				}
				System.out.println("A soma dos valores pares entre " + in + " e " + fi + " � = " + somapar);
				break;
			case 9:
				/*
				 * Fa�a um programa onde o usu�rio digita 15 valores e imprima a
				 * soma destes valores na tela.
				 */
				int valores = 0, val;
				for (int i = 1; i <= 15; i++) {
					System.out.print("Digite o " + i + "� de 15: ");
					val = leia.nextInt();
					valores = valores + val;
				}
				System.out.println("A soma de todos os valores � = " + valores);
				break;
			case 10:
				/*
				 * Escreva um programa que exiba na tela em ordem crescente,
				 * apenas os n�meros pares existentes de 11 a 250.
				 */
				for (int i = 11; i < 250; i++) {
					if (i % 2 == 0)
						System.out.println(i);
				}
				break;
			case 11:
				/*
				 * Escreva um programa que exiba na tela a tabuada de um n�mero
				 * que dever� ser informado pelo usu�rio.
				 */
				System.out.println("Digite um n�mero entre 1 e 10 inclusive:");
				int num = 0;
				while (num < 1 || num > 10) {
					num = leia.nextInt();
				}
				for (int i = 1; i <= 10; i++) {
					System.out.println(num + " x " + i + " = " + (num * i));
				}
				break;
			case 12:
				/*
				 * Escreva um programa que leia 10 n�meros inteiros e exiba na
				 * tela ao final, o maior n�mero que foi digitado pelo usu�rio.
				 */
				int numero, maior = -999999;
				for (int i = 1; i <= 10; i++) {
					System.out.print("Digite o " + i + "� de 10 n�meros: ");
					numero = leia.nextInt();
					if (i == 1)
						maior = numero;
					if (numero > maior)
						maior = numero;
				}
				System.out.println("O maior n�mero digitado foi " + maior);
				break;
			case 13:
				/*
				 * Escreva um programa que leia 5 n�meros inteiros em qualquer
				 * ordem e exiba na tela ao final, os cinco n�meros em ordem
				 * crescente.
				 * Necess�rio conhecimento de Vetores*/
				break;
			case 14:
				System.out.println("At� logo.");
				break;
			default:
				System.out.println("Op��o Inv�lida.");
				break;
			}
		}
	}
}
