package lista3;

import java.util.Scanner;

public class CorrecaoLacos {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int menu = 0;
		while (menu != 10) {
			System.out.println("1.De 10 a 200\n2.De 200 a 1\n3.De 0 a ?");
			System.out.println("4.Contador\n5.Acumula��o\n6.Fatorial-Acumula��o");
			System.out.println("7.AcumulaIntervaloPar\n8.Maior entre 10\n9.Tabuada");
			System.out.println("10. Sair");
			menu = leia.nextInt();
			switch (menu) {
			case 1:
				for (int i = 10; i <= 200; i++) {
					System.out.println(i);
				}
				break;
			case 2:
				for (int i = 200; i >= 1; i--) {
					System.out.println(i);
				}
				break;
			case 3:
				System.out.println("Digite o total de itera��es:");
				int limite = leia.nextInt();
				for (int i = 0; i <= limite; i++) {
					System.out.println(i);
				}
				break;
			case 4:
				int contadorPositivo = 0;
				int contadorNegativo = 0;
				int valorDigitado;
				System.out.println("Digite 5 valores inteiros (Positivos e Negativos):");
				for (int i = 0; i < 5; i++) {
					valorDigitado = leia.nextInt();
					if(valorDigitado >= 0){
						contadorPositivo++; //contadorPositivo = contadorPositivo + 1;
					}else{
						contadorNegativo++;
					}
				}
				System.out.println("Total positivo " + contadorPositivo);
				System.out.println("Total negativo " + contadorNegativo);
				break;
			case 5:
				int acumuladorPares = 0;
				System.out.println("Digite um n�mero N inteiro e positivo:");
				int n = leia.nextInt();
				for(int i = 1; i <= n; i++){
					if(i % 2 == 0){
						acumuladorPares += i; //acumuladorPares = acumuladorPares + i
					}
				}
				System.out.println("O total de pares entre 0 e "+n+" � "+acumuladorPares);
				break;
			case 6:
				int fatorial = 1;
				System.out.println("Digite um n�mero N inteiro e positivo:");
				int numero = leia.nextInt();
				for(int i = 1; i <= numero; i++){
					fatorial *= i; // faltorial = fatorial * i
				}
				System.out.println("O fatorial de "+numero+" � "+fatorial);
				break;
			case 7:
				System.out.println("Digite um n�mero inteiro representando o in�cio de um intervalo:");
				int inicio = leia.nextInt();
				System.out.println("Digite um n�mero inteiro representando o fim de um intervalo:");
				int fim = leia.nextInt();
				int acumulador = 0;
				for(int i = inicio; i <= fim; i++){
					if(i % 2 == 0){
						acumulador += i;
					}
				}
				System.out.println("A soma dos n�meros pares neste intervalo � = "+acumulador);
				break;
			case 8:
				int maior = -999999;
				int numeroLido;
				System.out.println("Digite 10 n�meros inteiros:");
				for(int i = 0; i < 10; i++){
					numeroLido = leia.nextInt();
					if(numeroLido > maior){
						maior = numeroLido;
					}
				}
				System.out.println("O maior n�mero � "+maior);
				break;
			case 9:
				int num;
				do{
					System.out.println("Digite um n�mero entre 1 e 10");
					num = leia.nextInt();
				}while(num <= 0 || num > 10);
				int resultado;
				for(int i = 1; i <= 10; i++){
					resultado = i * num;
					System.out.println(i+" x "+num+" = "+resultado);
				}
				break;
			case 10:
				System.out.println("Bye, bye.");
				break;
			default:
				System.out.println("Op��o inv�lida.");
				break;
			}
		}
	}

}
