package vetores;

/*Programa que l� o nome e a idade de 15 pessoas e
 * informa a m�dia, o nome do indiv�duo com maior idade
 * e o nome do indiv�duo com menor idade*/
import java.util.Scanner;

public class Exemplo4 {

	public static final int TAMANHO = 15;
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		String[] nome = new String[TAMANHO];
		int[] idade = new int[TAMANHO];
		System.out.println("Digite o nome e a idade de " + TAMANHO + " pessoas:");
		for (int i = 0; i < TAMANHO; i++) {
			nome[i] = input.next();
			idade[i] = input.nextInt();
		}
		for (int i = 0; i < TAMANHO; i++) {
			System.out.println(nome[i] + ", " + idade[i]);
		}
		// T�cnica de acumula��o para calcular a m�dia
		float media = 0;
		for (int i = 0; i < TAMANHO; i++) {
			media += idade[i];
		}
		media /= TAMANHO;
		System.out.printf("A m�dia de idade desta popula��o � %.1f\n", media);
		// T�cnica de compara��o
		int maior = 0;
		int indiceMaior = 0;
		for (int i = 0; i < TAMANHO; i++) {
			if (idade[i] > maior) {
				maior = idade[i];
				indiceMaior = i;
			}
		}
		System.out.println("O nome do mais velho � "+nome[indiceMaior]+", sua idade � "+maior);
		// T�cnica de compara��o
		int menor = 200;
		int indiceMenor = 0;
		for (int i = 0; i < TAMANHO; i++) {
			if (idade[i] < menor) {
				menor = idade[i];
				indiceMenor = i;
			}
		}
		System.out.println("O nome do mais novo � "+nome[indiceMenor]+", sua idade � "+menor);
	}
}
