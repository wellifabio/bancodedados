package lista2;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// Entrada
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite seu sal�rio");
		float salario = leia.nextFloat();
		float desconto = 0;

		// Processamento
		if (salario > 2000) {
			desconto = salario * 11 / 100;
		} else if (salario < 1200) {
			desconto = salario * 8 / 100;
		} else {
			desconto = salario * 9 / 100;
		}

		salario -= desconto;

		// Sa�da
		System.out.printf("O desconto de INSS ser� de R$%.2f\n", desconto);
		System.out.printf("O sal�rio com o desconto ficou R$%.2f", salario);
	}
}
