package models;

public class Produto {
	
	private int id;
	private String nome, descricao;
	private double preco;
	private int quantidade;
	
	//Construtor vazio
	public Produto() {
	}
	
	//Construtor vazio com um campo
	public Produto(int id) {
		this.id = id;
	}
	//Construtor com v�rios campos
	public Produto(int id, String nome, String descricao, double preco, int quantidade) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	//GETs && SETs
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public void setComprado() {
		this.quantidade--;
	}
	
}
