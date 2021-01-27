import java.util.Scanner;

public class SalarioVariavel {

	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		//Defini��o das vari�veis
		String nome;
		float salario;
		float porcentagem;
		float novoSalario;
		boolean desAum;
		
		System.out.println("Digite o nome, sal�rio e porcentagem");
		//Entrada
		nome = leia.next();
		salario = leia.nextFloat();
		porcentagem = leia.nextFloat();
		System.out.println("Digite (true) para aumento ou (false) para desconto");
		desAum = leia.nextBoolean();
		
		//Processamento
		if(desAum){
			novoSalario = salario + salario * porcentagem / 100;
		}else{
			novoSalario = salario - salario * porcentagem / 100;
		}
		
		//Sa�da
		System.out.printf("O novo salario de %s ser� R$ %.2f",nome,novoSalario);
	}
	
}
