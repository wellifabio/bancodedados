package lista2reenye;

import java.util.Scanner;

/*Fa�a um algoritmo para calcular a m�dia final da disciplina
 * de programa��o e mostrar esta m�dia fina e uma mensagem
 * informando se o aluno foi ou n�o aprovado (media >=6)*/
public class Ex1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite as duas notas da disciplina:");
		int nota1 = leia.nextInt();
		int nota2 = leia.nextInt();
		
		float media = (float) (nota1 + nota2) / 2;
		
		System.out.printf("A m�dia � %.1f\n", media);
		
		if (media >= 6) {
			System.out.println("Voc� est� Aprovado");
		} else {
			System.out.println("Voc� est� Reprovado");
		}
	}
}
