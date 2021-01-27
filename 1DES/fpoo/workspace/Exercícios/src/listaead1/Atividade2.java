package listaead1;

/* Desenvolva um programa que leia o nome e o pre�o de 5 mercadorias. Se o pre�o for menor do
que 1000 ter� um aumento de 5% no pre�o da mercadoria, sen�o o aumento ser� de 7%. Mostrar os
nomes das mercadorias e o seu novo pre�o.
 * Dados de entrada:
Furadeira 250,25
Serra 180,00
Arco 1290,90
Proa 1535,45
Bola 380,00
 */

import java.util.Scanner;

public class Atividade2 {

	public static final int TOTAL = 5;
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

		// Processamento e Sa�da
		System.out.println("Nome, preco, %, Valor aumento, Novo Preco:");
		for (int i = 0; i < TOTAL; i++) {
			System.out.print(nome[i] + ", ");
			System.out.print(preco[i] + ", ");
			if (preco[i] < 1000)
				percentual = 5;
			else
				percentual = 7;
			System.out.printf("%.1f", percentual);
			System.out.print("%, ");
			System.out.printf("%.2f, ", (preco[i] * percentual / 100));
			System.out.printf("%.2f\n", (preco[i] + preco[i] * percentual / 100));
		}
	}
}
