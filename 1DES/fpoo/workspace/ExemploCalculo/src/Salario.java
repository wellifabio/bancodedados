import java.util.Scanner;

public class Salario {

	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		//Defini��o das vari�veis
		String nome;
		float salario;
		float porcentagem;
		float novoSalario;
		
		System.out.println("Digite o nome, sal�rio e porcentagem de aumento:");
		//Entrada
		nome = leia.next();
		salario = leia.nextFloat();
		porcentagem = leia.nextFloat();
		
		//Processamento
		novoSalario = salario + salario * porcentagem / 100;
		
		//Sa�da
		System.out.printf("O novo salario de %s ser� R$ %.2f",nome,novoSalario);
	}
}
