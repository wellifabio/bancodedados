package eaddesafio1;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Ferramentas {

	public static Scanner scan = new Scanner(System.in);
	public static ArrayList<String> funcionarios = new ArrayList<String>();
	public static ArrayList<String> ferramentas = new ArrayList<String>();
	public static ArrayList<String> datas = new ArrayList<String>();
	public static Date data = new Date();
	public static SimpleDateFormat hoje = new SimpleDateFormat("dd/MM/yyyy");
	public static int menu, indice;
	public static String funcionario;

	public static void main(String[] args) {
		menu = 0;
		while (menu != 4) {
			System.out.println("1. Retirar Ferramenta");
			System.out.println("2. Listar Ferramentas Retiradas");
			System.out.println("3. Devolver Ferramenta");
			System.out.println("4. Sair");
			menu = scan.nextInt();
			switch (menu) {
			case 1:
				System.out.println("Digite o nome do mec�nido e o nome da ferramenta retirada:");
				funcionarios.add(scan.next());
				ferramentas.add(scan.next());
				datas.add(hoje.format(data));
				break;
			case 2:
				System.out.println("Data, Funcion�rio, Ferramenta:");
				for(int i = 0; i < funcionarios.size(); i++) {
					System.out.print(datas.get(i)+", ");
					System.out.print(funcionarios.get(i)+", ");
					System.out.println(ferramentas.get(i));
				}
				break;
			case 3:
				System.out.println("Digite o nome do funcion�rio:");
				funcionario = scan.next();
				if(funcionarios.contains(funcionario)){
					System.out.println("O funcion�rio est� com as seguintes ferramentas:");
					System.out.println("�ndice, Funcion�rio, Ferramenta, Data:");
					for(int i = 0; i < funcionarios.size(); i++) {
						if(funcionarios.get(i).equals(funcionario)) {
							System.out.print(i+", ");
							System.out.print(funcionarios.get(i)+", ");
							System.out.print(ferramentas.get(i)+", ");
							System.out.println(datas.get(i));					
						}
					}
					System.out.println("Digite o �ndice da ferramenta a ser devolvida:");
					indice = scan.nextInt();
					funcionarios.remove(indice);
					ferramentas.remove(indice);
					datas.remove(indice);
				} else {
					System.out.println("Este funcion�rio n�o retirou nenhuma ferramenta.");
				}
				break;
			case 4:
				System.out.println("Valews, falows!");
				break;
			default:
				System.out.println("Op��o inv�lida");
				break;
			}
		}
	}
}
