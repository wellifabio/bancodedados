package controllers;

import java.util.ArrayList;

import models.Produto;
import models.dao.ProdutoDAO;

public class ProcessaProduto {

	private static ArrayList<Produto> produtos = new ArrayList<>();
	private static ProdutoDAO pd = new ProdutoDAO();
	
	public static void abrir() {
		produtos = pd.getProdutos();
	}
	
	public static boolean salvar() {
		return pd.setProdutos(produtos);
	}
	
	//GETs && SETs
	public static ArrayList<Produto> getProdutos() {
		return produtos;
	}
	public static void setProdutos(ArrayList<Produto> produtos) {
		ProcessaProduto.produtos = produtos;
	}
	
	public static int getAutoCodigo() {
		if(ProcessaProduto.produtos.isEmpty()) {
			return 1;
		} else {
			return ProcessaProduto.produtos.get(ProcessaProduto.produtos.size()-1).getCodigo()+1;
		}
	}
	
}
