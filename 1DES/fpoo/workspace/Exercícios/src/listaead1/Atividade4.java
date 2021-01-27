package listaead1;

/* Desenvolva um programa que leia o nome e o pre�o de 10 mercadorias, depois leia o valor do
�ndice percentual (%) de desconto no pre�o da mercadoria. Calcule e apresente na tela, o nome, o
pre�o original, o valor do desconto e pre�o final de cada mercadoria com desconto.

Furadeira 250,25
Serra 180,00
Arco 1290,90
Proa 1535,45
Bola 380,00
Arame 100,00
Rolha 10,5
Alicate 35,99
Brocha 5,25
Prego 2,99
 */

import java.util.Scanner;

public class Atividade4 {

	public static final int TOTAL = 10;
	public static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		String[] nome = new String[TOTAL];
		float[] preco = new float[TOTAL];
		float percentual;

		// Entrada
		System.out.println("Digite o nome e o sal�rio de 5 pessoas");
		for (int i = 0; i < TOTAL; i++) {
			nome[i] = leia.next();
			preco[i] = leia.nextFloat();
		}
		System.out.println("Digite o percentual de desconto:");
		percentual = leia.nextFloat();

		// Processamento e Sa�da
		System.out.println("Nome, Preco, %, Valor desconto, Novo Preco:");
		for (int i = 0; i < TOTAL; i++) {
			System.out.print(nome[i] + ", ");
			System.out.print(preco[i] + ", ");
			System.out.printf("%.1f", percentual);
			System.out.print("%, ");
			System.out.printf("%.2f, ", (preco[i] * percentual / 100));
			System.out.printf("%.2f\n", (preco[i] - preco[i] * percentual / 100));
		}
	}
}