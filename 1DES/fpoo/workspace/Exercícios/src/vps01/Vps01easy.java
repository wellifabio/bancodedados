package vps01;

import java.util.Scanner;

public class Vps01easy {

	public static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		int menuPrincipal = 0;
		while (menuPrincipal != 5) {
			System.out.println("\n\n\n1 - Situa��o Problema: Taxa de Juros");
			System.out.println("2 - Situa��o Problema: Calcular �rea");
			System.out.println("3 - Situa��o Problema: Controle de Cestas");
			System.out.println("4 - Situa��o Problema: Pizzaria Fidelidade");
			System.out.println("5 - Sair\n\n");
			menuPrincipal = leia.nextInt();
			switch (menuPrincipal) {
			case 1:
				// Algoritmo para calcular juros por dia de atraso
				System.out.println("Digite o valor do boleto de o n�mero de dias em atrazo:");
				float valor = leia.nextFloat();
				int dias = leia.nextInt();
				float juros = valor * (dias * (float) 1.3) / 100;
				float montante = valor + juros;
				System.out.printf(
						"Aplicando taxa de 1.3 porcento ao dia.\nO total de juros � R$ %.2f\nE o montante final � R$ %.2f\n",
						juros, montante);
				break;
			case 2:
				// Algoritmo para calcular a �rea e o volume de um CUBO
				System.out.println("Digite o valor (a) da lateral do cubo:");
				float a = leia.nextFloat();
				float ac = 6 * (a * a);
				float vc = a * a * a;
				System.out.printf("A �rea deste cubo � Ac=6 x a^2 = %.2f\n", ac);
				System.out.printf("O volume deste cubo � Ac=a^3 = %.2f\n", vc);
				break;
			case 3:
				// Administra a entrega de at� 10 cestas b�sicas
				String[] funcionario = new String[10];
				int contador = 0;
				// Criar um submenu
				int menuCesta = 0;
				while (menuCesta != 4) {
					System.out.println("\n\n1.Registrar Coleta\n2.Lista das Retiradas\n3.Lista dos Pendentes\n4.Sair");
					menuCesta = leia.nextInt();
					if (menuCesta == 1) {
						System.out.println("Digite o nome do Funcion�rio");
						funcionario[contador] = leia.next();
						contador++; // A cada nome de funcion�rio cadastrado o
									// contator aumenta 1
					} else if (menuCesta == 2) {
						// Lista todos os que j� receberam a cesta
						for (int i = 0; i < contador; i++) {
							System.out.println(funcionario[i]);
						}
					} else if (menuCesta == 3) {
						// Mostra quantas cestas faltam serem entregues
						System.out.println("Faltam " + (10 - contador) + " cestas a serem entregues.");
					} else if (menuCesta == 4) {
						System.out.println("De volta ao menu principal!");
					} else {
						System.out.println("Op��o Inv�lida.");
					}
				}
				break;
			case 4:
				// Administrar at� 20 clientes, calculando cupons de 20% de
				// desconto a cada 10 pedidos
				// Digitando o total de pedidos j� feitos
				String[] clientes = new String[20];
				int[] pedidos = new int[20];
				System.out.println("Digite quantos Clientes deseja cadastrar, no m�ximo 20");
				int n = leia.nextInt();
				System.out.println("Digite a tabela o nome e a quantidade de pedidos destes " + n + " clientes");
				for (int i = 0; i < n; i++) {
					clientes[i] = leia.next();
					pedidos[i] = leia.nextInt();
				}
				// Verificar o n�mero de cupons pelo total de pedidos
				for (int i = 0; i < n; i++) {
					int cupons = 0;
					if (pedidos[i] < 10) {
						cupons = 0;
					} else if (pedidos[i] < 20) {
						cupons = 1;
					} else if (pedidos[i] < 30) {
						cupons = 2;
					} else if (pedidos[i] < 40) {
						cupons = 3;
					} else if (pedidos[i] < 50) {
						cupons = 4;
					} else {
						cupons = 5;
					}
					System.out.println("O cliente " + clientes[i] + ", possui " + cupons + " cupons, num total de "
							+ (cupons * 20) + "% de desconto no pr�ximo pedido.");
				}
				break;
			case 5:
				System.out.println("Valeus, falows");
				break;
			default:
				System.out.println("Op��o inv�lida.");
				break;
			}
		}
	}
}
