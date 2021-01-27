package listaead1;

/* Desenvolva um programa que leia o nome e o sal�rio de 5 pessoas, depois leia um valor de �ndice
percentual (%) de reajuste do sal�rio. Calcule e apresente na tela, uma tabela contendo: nome,
sal�rio atual, valor do aumento e novo sal�rio.
 * Dados de entrada:
 Ana 2500,25
 Maria 1800,00
 Joana 2900,90
 Estela 5305,45
 Bruno 3800,00
 */

import java.util.Scanner;

public class Atividade1 {

	public static final int TOTAL = 5;
	public static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		String[] nome = new String[TOTAL];
		float[] salario = new float[TOTAL];
		float percentual;

		// Entrada
		System.out.println("Digite o nome e o sal�rio de 5 pessoas");
		for (int i = 0; i < TOTAL; i++) {
			nome[i] = leia.next();
			salario[i] = leia.nextFloat();
		}
		System.out.println("Digite o percentual de almento:");
		percentual = leia.nextFloat();

		// Processamento e Sa�da
		System.out.println("Nome, Sal�rio, %, Valor aumento, Novo Sal�rio:");
		for (int i = 0; i < TOTAL; i++) {
			System.out.print(nome[i] + ", ");
			System.out.print(salario[i] + ", ");
			System.out.printf("%.1f", percentual);
			System.out.print("%, ");
			System.out.printf("%.2f, ", (salario[i] * percentual / 100));
			System.out.printf("%.2f\n", (salario[i] + salario[i] * percentual / 100));
		}
	}
}
