package lista2reenye;

import java.util.Scanner;

/*Fa�a um algoritmo que receba o ano de nascimento do usu�rio
 * e verifique se ele tem 18 anos ou mais, se a resposta for 
 * positiva � maior de idade.*/
public class Ex2 {

	public static final int ANO_ATUAL = 2020;

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Digite o ano que voc� nasceu:");
		int anoNascimento = read.nextInt();
		int idade = ANO_ATUAL - anoNascimento;
		if (idade < 18) {
			System.out.println("Voc� � (DI-MENOR)");
		} else if (idade < 40) {
			System.out.println("Voc� � (DI-MAIOR)");
		} else if (idade < 70){
			System.out.println("Voc� � (V�IO)");
		} else if(idade < 100){
			System.out.println("Voc� est� (com o P� na cova)");
		} else {
			System.out.println("O que voc� est� fazendo aqui ainda.");
		}
	}

}
