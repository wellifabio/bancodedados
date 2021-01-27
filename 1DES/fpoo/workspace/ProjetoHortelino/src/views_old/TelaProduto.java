package views_old;

import controllers.ProcessaProduto;
import models.Produto;

public class TelaProduto {

	private Produto produto;

	public boolean crud() {
		int menu = 0;
		System.out.println("1.Cadastrar\n2.Listar\n3.Alterar\n4.Excluir");
		menu = MainMenu.read.nextInt();
		switch (menu) {
		case 1:
			System.out.print("Digite o c�digo do novo produto:");
			produto = new Produto();
			produto.setCodigo(MainMenu.read.nextInt());
			//Verificar duplicado
			if (!ProcessaProduto.getProdutos().contains(produto)) {
				System.out.println("Preencha os campos abaixo:");
				System.out.println("Nome Descric�o Pre�o Quantidade");
				produto.setNome(MainMenu.read.next());
				produto.setDescricao(MainMenu.read.next());
				produto.setPreco(MainMenu.read.nextDouble());
				produto.setQuantidade(MainMenu.read.nextInt());
				ProcessaProduto.getProdutos().add(produto);
			} else {		
				System.out.println("Este c�digo j� est� cadastrado.");
			}
			break;
		case 2:
			int totalQuantidade = 0;
			double totalDinheiro = 0;
			for (Produto p : ProcessaProduto.getProdutos()) {
				System.out.print(p.toString());
				System.out.printf("[subtotal = %.2f]\n",p.getSubtotal());
				totalQuantidade +=p.getQuantidade();
				totalDinheiro += p.getSubtotal();
			}
			System.out.println("[A quantidade de �tens no estoque �: "+totalQuantidade+"]");
			System.out.printf("[O valor total do estoque �: R$%.2f\n",totalDinheiro);
			break;
		case 3:
			System.out.println("Informe o c�digo do produto a ser alterado:");
			produto = new Produto();
			produto.setCodigo(MainMenu.read.nextInt());
			for (int i = 0; i < ProcessaProduto.getProdutos().size(); i++) {
				if (produto.getCodigo() == ProcessaProduto.getProdutos().get(i).getCodigo()) {
					// Mostrar os dados atuais
					System.out.println(ProcessaProduto.getProdutos().get(i).toString());
					System.out.println("Digite: Nome, Descri��o, Pre�o, Quantidade:");
					// Ler os novos dados
					produto.setNome(MainMenu.read.next());
					produto.setDescricao(MainMenu.read.next());
					produto.setPreco(MainMenu.read.nextDouble());
					produto.setQuantidade(MainMenu.read.nextInt());
					// Remove o atual e adiona o novo na mesma posi��o
					ProcessaProduto.getProdutos().remove(i);
					ProcessaProduto.getProdutos().add(i, produto);
					System.out.println("Produto alterado.");
				}
			}
			break;
		case 4:
			System.out.println("Informe o c�digo do produto a ser exclu�do:");
			int cod = MainMenu.read.nextInt();
			for (int i = 0; i < ProcessaProduto.getProdutos().size(); i++) {
				if (cod == ProcessaProduto.getProdutos().get(i).getCodigo()) {
					ProcessaProduto.getProdutos().remove(i);
					System.out.println("Produto removido.");
				}
			}
			break;
		default:
			System.out.println("Op��o inv�lida.");
			break;
		}
		return true;
	}

}
