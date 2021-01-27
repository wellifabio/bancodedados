package principal;

import java.util.Scanner;

public class MenuPrincipal {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		/* Defini��o do escopo do problema
		*  Filtro atrav�s de um la�o enquanto para permitir somente numeros
		*  entre 1 e 100*/
		int n = 0;
		while (n < 1 || n >= 100) {
			System.out.println("Quantos funcion�rio voc� quer administrar de 1 a 100?");
			n = input.nextInt();
		}

		// Vair�veis que ser�o administradas (Vetores)
		String[] nome = new String[n];
		float[] salario = new float[n];
		float[] porcentagem = new float[n];
		float[] novoSalario = new float[n];
		boolean[] descontoAumento = new boolean[n];
		int ponteiro = 0;

		// Menu
		int menu = 0;
		while (menu != 4) {
			System.out.println("1.Cadastro\n2.Calcular Reajuste\n3.Listar Todos\n4.Sair");
			menu = input.nextInt();
			switch(menu){
			case 1:
				System.out.println("Digite Nome, Sal�rio, %, (true) aumento ou (false) desconto:");
				nome[ponteiro] = input.next();
				salario[ponteiro] = input.nextFloat();
				porcentagem[ponteiro] = input.nextFloat();
				descontoAumento[ponteiro] = input.nextBoolean();
				ponteiro++;
				System.out.println("Cadastrado com sucesso.");
				break;
			case 2:
				for(int i = 0; i < ponteiro; i++){
					if(descontoAumento[i]){
						novoSalario[i] = salario[i] + salario[i] * porcentagem[i] / 100;
					} else {
						novoSalario[i] = salario[i] - salario[i] * porcentagem[i] / 100;
					}
				}
				System.out.println("Reajuste calculado para todos os funcion�rios cadastrados.");
				break;
			case 3:
				System.out.println("Nome, Sal�rio, %, Reajuste, Novo Sal�rio");
				for(int i = 0; i < ponteiro; i++){
					System.out.println(nome[i]+", "+salario[i]+", "+porcentagem[i]+", "+descontoAumento[i]+", "+novoSalario[i]);
				}
				break;
			case 4:
				System.out.println("Adeus!");
				break;
			default:
				System.out.println("Op��o inv�lida!");
				break;
			}
		}
	}
}
