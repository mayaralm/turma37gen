package ExemploHeranca;

public class Animal {
	private String nome;
	private int idade;
	
	
	public Animal(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void EmitirSom(){
		System.out.println("Animal emitiu som");
	}
	
	public String toString() {
		return "Dados animal: "+ 
			"Nome: " + this.nome + 
			" Idade: "+ this.idade;
	}
	

	

}
