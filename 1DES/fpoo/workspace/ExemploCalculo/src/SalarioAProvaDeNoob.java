import java.util.Scanner;

public class SalarioAProvaDeNoob {

	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		//Defini��o das vari�veis
		String nome;
		float salario = 0;
		float porcentagem = 0;
		float novoSalario;
		boolean desAum;
		
		//Entrada
		System.out.println("Digite o nome:");
		nome = leia.nextLine();
		while(salario <= 0 || salario > 1000000){
			System.out.println("Digite o Sal�rio");		
			salario = leia.nextFloat();
		}
		while(porcentagem <=0 || porcentagem >= 100){
			System.out.println("Digite a porcentagem");
			porcentagem = leia.nextFloat();
		}
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
