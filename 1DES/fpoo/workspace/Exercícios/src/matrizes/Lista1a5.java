package matrizes;

import java.util.Random;
import java.util.Scanner;

public class Lista1a5 {

	public static Scanner input = new Scanner(System.in);
	public static Random random = new Random();

	public static void main(String[] args) {
		int menu = 0;
		while (menu != 6) {
			System.out.println("\n\n\n1.Exerc�cio1\n2.Exerc�cio2\n3.Exerc�cio3");
			System.out.println("4..Exerc�cio4\n5.Exerc�cio5\n6.Sair");
			menu = input.nextInt();
			switch (menu) {
			case 1:
				/*
				 * Gere e imprima uma matrix 3 x 3 com valores aleat�rios de 0 a
				 * 9. Ap�s determine o maior n�mero e informe a sua posi��o.
				 */

				// Preencher com n�meros aleat�rios
				int[][] matriz = new int[3][3];
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {
						matriz[i][j] = random.nextInt(9);
					}
				}
				// Mostrar a matriz
				System.out.println("\n   {0}{1}{2}");
				for (int i = 0; i < 3; i++) {
					System.out.print("{" + i + "}");
					for (int j = 0; j < 3; j++) {
						System.out.print("[" + matriz[i][j] + "]");
					}
					System.out.println();
				}
				// Descobrir o maior e informar a posi��o
				int x = 0, y = 0, maior = 0;
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {
						if(maior < matriz[i][j]){
							maior = matriz[i][j];
							x = i;
							y = j;
						}
					}
				}
				System.out.println("O maior n�mero � ="+maior);
				System.out.println("Posi��o x ="+x+", y = "+y);
				break;
			case 2:
				/*Gere e imprima uma matriz de 5 x 5 com valores de 0 a 25
				 * Ap�s informe qual o maior e o menor valor da linha 4
				 * e maior e o menor valor da linha 3*/
				// Preencher com n�meros aleat�rios
				int[][] matriz2 = new int[5][5];
				for (int i = 0; i < 5; i++) {
					for (int j = 0; j < 5; j++) {
						matriz2[i][j] = random.nextInt(25);
					}
				}
				// Mostrar a matriz
				for (int i = 0; i < 5; i++) {
					for (int j = 0; j < 5; j++) {
						System.out.print("[" + matriz2[i][j] + "]");
					}
					System.out.println();
				}
				
				//Processamento 1
				int maior2 = 0, menor2 = 25;
				int posXM = 0, posYM = 0;
				int posXm = 0, posYm = 0;
				for (int i = 0; i < 5; i++) {
					if(maior2 < matriz2[4][i]){
						maior2 = matriz2[4][i];
						posXM = 4;
						posYM = i;
					}
					if(menor2 > matriz2[4][i]){
						menor2 = matriz2[4][i];
						posXm = 4;
						posYm = i;
					}
				}
				//Sa�da 1
				System.out.println("O maior n�mero da linha 4 � "+maior2);
				System.out.println("Na posi��o x = "+posXM+", y = "+posYM);
				System.out.println("O menor n�mero da linha 4 � "+menor2);
				System.out.println("Na posi��o x = "+posXm+", y = "+posYm);
				//Processamento 2
				maior2 = 0;
				menor2 = 25;
				for (int i = 0; i < 5; i++) {
					if(maior2 < matriz2[3][i]){
						maior2 = matriz2[3][i];
						posXM = 3;
						posYM = i;
					}
					if(menor2 > matriz2[3][i]){
						menor2 = matriz2[3][i];
						posXm = 3;
						posYm = i;
					}
				}
				//Sa�da 2
				System.out.println("O maior n�mero da linha 3 � "+maior2);
				System.out.println("Na posi��o x = "+posXM+", y = "+posYM);
				System.out.println("O menor n�mero da linha 3 � "+menor2);
				System.out.println("Na posi��o x = "+posXm+", y = "+posYm);
				break;
			case 3:
				/*Preencha uma matriz de 5 x 5 com valores de 0 a 50
				 * Depois exiba os n�meros pares e �mpares na matriz
				 * e suas quantidades*/
				// Preencher com n�meros aleat�rios
				int[][] matriz3 = new int[5][5];
				for (int i = 0; i < 5; i++) {
					for (int j = 0; j < 5; j++) {
						matriz3[i][j] = random.nextInt(50);
					}
				}
				// Mostrar a matriz
				for (int i = 0; i < 5; i++) {
					for (int j = 0; j < 5; j++) {
						System.out.print("[" + matriz3[i][j] + "]");
					}
					System.out.println();
				}
				
				// Mostrar a matriz Par
				System.out.println("N�meros Pares:");
				int qtdPar = 0;
				for (int i = 0; i < 5; i++) {
					for (int j = 0; j < 5; j++) {
						if(matriz3[i][j] % 2 == 0){
							System.out.print("[" + matriz3[i][j] + "]");
							qtdPar++;
						}
					}
					System.out.println();
				}
				System.out.println("A quantidade de pares � "+qtdPar);
								
				// Mostrar a matriz Impar
				System.out.println("N�meros �mpares:");
				int qtdImpar = 0;
				for (int i = 0; i < 5; i++) {
					for (int j = 0; j < 5; j++) {
						if(matriz3[i][j] % 2 != 0){
							System.out.print("[" + matriz3[i][j] + "]");
							qtdImpar++;
						}
					}
					System.out.println();
				}
				System.out.println("A quantidade de pares � "+qtdImpar);
				
				break;
			case 4:
				/*Crie uma matriz de 4 x 4 com valores de 0 a 50
				 * e exiba todos os valores de sua diagonal*/
				// Preencher com n�meros aleat�rios
				int[][] matriz4 = new int[4][4];
				for (int i = 0; i < 4; i++) {
					for (int j = 0; j < 4; j++) {
						matriz4[i][j] = random.nextInt(50);
					}
				}
				// Mostrar a matriz
				for (int i = 0; i < 4; i++) {
					for (int j = 0; j < 4; j++) {
						System.out.print("[" + matriz4[i][j] + "]");
					}
					System.out.println();
				}
				//Exibir a diagonal
				System.out.println("Primeira diagonal");
				for (int i = 0; i < 4; i++){
					System.out.println("["+matriz4[i][i]+"]");
				}
				//Exibir segunda diagonal
				System.out.println("Segunda diagonal diagonal");
				for (int i = 0; i < 4; i++){
					System.out.println("["+matriz4[3-i][i]+"]");
				}
				break;
			case 5:
				/*Crie e preencha duas matrizes de 5 x 5 com valores de 0 a 50
				 * Exiba o resultado da soma e da subtra��o entre elas*/
				
				// Preencher com n�meros aleat�rios
				int[][] matriz5 = new int[5][5];
				for (int i = 0; i < 5; i++) {
					for (int j = 0; j < 5; j++) {
						matriz5[i][j] = random.nextInt(50);
					}
				}
				// Mostrar a matriz
				System.out.println("Primeira Matriz");
				for (int i = 0; i < 5; i++) {
					for (int j = 0; j < 5; j++) {
						System.out.print("[" + matriz5[i][j] + "]");
					}
					System.out.println();
				}
				
				// Preencher com n�meros aleat�rios
				int[][] matriz6 = new int[5][5];
				for (int i = 0; i < 5; i++) {
					for (int j = 0; j < 5; j++) {
						matriz6[i][j] = random.nextInt(50);
					}
				}
				// Mostrar a matriz
				System.out.println("Segunda Matriz");
				for (int i = 0; i < 5; i++) {
					for (int j = 0; j < 5; j++) {
						System.out.print("[" + matriz6[i][j] + "]");
					}
					System.out.println();
				}
				
				// Mostrar a soma
				System.out.println("Soma:");
				for (int i = 0; i < 5; i++) {
					for (int j = 0; j < 5; j++) {
						System.out.print("[" + (matriz5[i][j]+matriz6[i][j]) + "]");
					}
					System.out.println();
				}
				
				// Mostrar a subtra��o
				System.out.println("Subtra��o");
				for (int i = 0; i < 5; i++) {
					for (int j = 0; j < 5; j++) {
						System.out.print("[" + (matriz5[i][j]-matriz6[i][j]) + "]");
					}
					System.out.println();
				}
				
				break;
			case 6:
				System.out.println("Adeus, j� foi tarde.");
				break;
			default:
				System.out.println("Op��o inv�lida.");
				break;
			}
		}
	}
}
