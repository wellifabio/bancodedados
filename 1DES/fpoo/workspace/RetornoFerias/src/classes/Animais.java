package classes;

public class Animais {
	
	//Atributos
	String nome;
	String especie;
	String cor;
	float peso;
	
	//M�todos
	public String retornaFrase() {
		return "O "+nome+" � um(a) "+especie+" da cor "+cor+" e pesa "+peso+" quilos.";
	}
	
	public String retornaFraseComParametro(String sexo) {
		if(sexo.equals("m")) {
			return "O "+nome+" � um "+especie+" da cor "+cor+" e pesa "+peso+" quilos";
		}else {
			return "A "+nome+" � uma "+especie+" da cor "+cor+" e pesa "+peso+" quilos";
		}	
	}
	
	public void escreveFrase(String inmetro) {
		System.out.println("O "+nome+" � um(a) "+especie+" da cor "+cor+" e pesa "+peso+inmetro);
	}
}
