package lista2reenye;

import java.util.Scanner;

/*Implemente um c�digo para aprovar empr�stimo banc�rio
 * o c�digo deve pedir tr�s informa��es:
 * Valor do empr�stimo
 * N�mero de parcelas
 * Sal�rio do solicitante
 * Aprovar empr�stimo caso o valor da parcela
 * represente no m�ximo 30% do sal�rio do Solicitante*/
public class Ex4 {

	public static void main(String[] args) {
		Scanner papaleguas = new Scanner(System.in);
		System.out.println("Digite o valor:");
		float valor = papaleguas.nextFloat();
		System.out.println("Digite o n�mero de parcelas:");
		int parcelas = papaleguas.nextInt();
		System.out.println("Digite seu sal�rio:");
		float salario = papaleguas.nextFloat();
		
		float juros = valor * 10 / 100; //Valor do juros
		valor = valor + juros; //Valor com juros
		float valorParcela = (float) valor / parcelas;
		
		if(valorParcela >= (salario * 30 / 100)) {
			System.out.println("Financiamento Reprovado");
			System.out.printf("O valor da parcela seria de R$%.2f\n",valorParcela);
			System.out.printf("Ultrapassando 30 por cento do seu sal�rio R$%.2f\n",salario);
		}else {
			System.out.println("Financiamento Aprovado");
			System.out.printf("O montante ser� de R$%.2f\n",valor);
			System.out.printf("A parcela ser� de R$%.2f\n",valorParcela);
		}
	}

}
