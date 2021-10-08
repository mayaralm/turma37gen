package ExemploHeranca;

public class Cachorro extends Animal {
	
	
	public Cachorro(String nome,int idade) {
		 super(nome, idade);
		 
	}
	public void Correr() {
		System.out.println(this.getNome() + " Está correndo");
	}
	
	@Override
	public void EmitirSom() {
		System.out.println("AU AU");
	}
	@Override
	public String toString() {
		return "Dados animal: "+ 
			"Nome: " + getNome() + 
			" Idade: "+ getIdade();
	}

	
}
