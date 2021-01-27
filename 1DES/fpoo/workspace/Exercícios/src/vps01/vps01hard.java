package vps01;

import java.util.Scanner;

public class vps01hard {
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
				// Administra a entrega de at� 10 cestas b�sicas de maneira mais organizada
				// Atribuir previamente o nome dos 10 funcion�rios administrados no vetor
				String[] funcionario = { "Alice", "Miguel", "Sophia", "Arthur", "Helena", "Bernardo", "Valentina",
						"Heitor", "Laura", "Davi" };
				// Atribuir o status false para a entrega das cestas
				boolean[] cesta = { false, false, false, false, false, false, false, false, false, false };
				String nomeFun;
				// Cria um submen� com 4 op��es
				int menuCesta = 0;
				while (menuCesta != 4) {
					System.out.println("\n\n1.Registrar Coleta\n2.Lista das Retiradas\n3.Lista dos Pendentes\n4.Sair");
					menuCesta = leia.nextInt();
					if (menuCesta == 1) {
						System.out.println("Digite o nome do Funcion�rio");
						nomeFun = leia.next();
						// Pesquisa se o funcion�rio est� cadastrado, se encontrar atribui true para
						// cesta
						for (int i = 0; i < funcionario.length; i++) {
							if (nomeFun.equals(funcionario[i])) {
								cesta[i] = true;
							}
						}
					} else if (menuCesta == 2) {
						// Lista somente os funcionarios onde a cesta est� como true
						for (int i = 0; i < funcionario.length; i++) {
							if (cesta[i]) {
								System.out.println(funcionario[i]);
							}
						}
					} else if (menuCesta == 3) {
						// Lista somente os funcionarios onde a cesta est� como false
						for (int i = 0; i < funcionario.length; i++) {
							if (!cesta[i]) {
								System.out.println(funcionario[i]);
							}
						}
					} else if (menuCesta == 4) {
						System.out.println("De volta ao menu principal!");
					} else {
						System.out.println("Op��o Inv�lida.");
					}
				}
				break;
			case 4:
				// Administrar at� 20 clientes, calculando cupons de 20% de desconto a cada 10
				// pedidos
				// De forma mais organizada
				int limite = 20;
				String[] clientes = new String[limite];
				int[] pedidos = new int[limite];
				int[] cupons = new int[limite];
				String nome;
				int n = 0;
				int menuClientes = 0;
				while (menuClientes != 3) {
					System.out.println("\n\n1.Cadastrar Pedido\n2.Listar Clientes\n3.Sair");
					menuClientes = leia.nextInt();
					switch (menuClientes) {
					case 1:
						System.out.println("Digite o nome do Cliente:");
						nome = leia.next();
						boolean encontrado = false;
						// Procura o nome, se estiver cadastrado acrescenta um pedido
						for (int i = 0; i < n; i++) {
							if (nome.equals(clientes[i])) {
								pedidos[i]++;
								// Verifica a quantidade de pedidos e adiciona o n�mero de cupons
								if (pedidos[i] <= 10) {
									cupons[i] = 0;
								} else if (pedidos[i] <= 20) {
									cupons[i] = 1;
								} else if (pedidos[i] <= 30) {
									cupons[i] = 2;
								} else if (pedidos[i] <= 40) {
									cupons[i] = 3;
								} else if (pedidos[i] <= 50) {
									cupons[i] = 4;
								} else {
									cupons[i] = 5; // No m�ximo 5 cupons que daria 100% de desconto
								}
								encontrado = true;
								// Como o cliente foi encontrado, atribui true e sai do la�o com break;
								break;
							}
						}
						// Se no nome n�o estiver cadastrado e o vetor n�o atingu o limite, cadastra o
						// cliente e um pedido.
						if (!encontrado && n < limite) {
							clientes[n] = nome;
							pedidos[n] = 1;
							cupons[n] = 0;
							n++; // Incrementa o n�mero de clientes cadastrados
						}
						break;
					case 2:
						System.out.println("Cliente, Pedidos, Cupons, % de Desconto");
						for (int i = 0; i < n; i++) {
							System.out.println(
									clientes[i] + ", " + pedidos[i] + ", " + cupons[i] + ", " + (cupons[i] * 20) + "%");
						}
						break;
					case 3:
						System.out.println("De volta ao menu principal!");
						break;
					default:
						System.out.println("Op��o Inv�lida.");
						break;
					}
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
