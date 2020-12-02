package domains; // Domain = Model

import java.util.ArrayList;

public class Funcionario { // Nome da classe

	private int id;								// Declara��o de atributos da classe in�cio
	private String nome;						//
	private String nascimento;					//
	private String endereco;					//
	private String especialidade;				// 
	private ArrayList<String> competencias = new ArrayList<>();		// importa��o do ArrayList
	private String periodo;						//
	private double valorHora;					// Declara��o de atributos da classe fim

	//Instru��es autom�ticas
	
	public Funcionario() {				// Construtor vazio de Funcionario
		
	}

	public Funcionario(int id) {		// Construtor preenchido de Funcionario 
		this.id = id;
	}

	public int getId() {				// Getters
		return id;
	}

	public void setId(int id) {			// Setters
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNascimento() {
		return nascimento;
	}

	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public ArrayList<String> getCompetencias() {
		return competencias;
	}

	public void setCompetencias(ArrayList<String> competencias) {
		this.competencias = competencias;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario other = (Funcionario) obj;
		if (id != other.id)
			return false;
		return true;
	}

	public String competenciasToText() {
		String retorno = "";
		for (String l : competencias) {
			retorno += l + ",";
		}
		if (retorno.length() > 1) { // Removendo ultimo carcter para n�o gerar vetor vazio
			retorno = retorno.substring(0, retorno.length() - 1);
		}
		return retorno;
	}

	public String toCSV() {
		return id + ";" + nome + ";" + nascimento + ";" + endereco + ";" + especialidade + ";" + competenciasToText()
				+ ";" + periodo + ";" + valorHora + "\r\n";
	}
	
	public String toHTML() {
		return "<td>" + id + "</td><td>" + nome + "</td><td>" + nascimento + "</td><td>" + endereco + "</td><td>"
				+ especialidade + "</td><td>" + competenciasToText() + "</td><td>" + periodo + "</td><td>" + valorHora
				+ "</td>";
	}

}
