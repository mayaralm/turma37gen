package ExemploHeranca;

public class Cavalo extends Animal {
	
	
	public Cavalo (String nome, int idade) {
		
		super(nome, idade);
 }
	public void Correr() {
		System.out.println(this.getNome() + " Está correndo");
	}
	
	@Override
	public void EmitirSom() {
		System.out.println("E RELINCHA");
	}

	@Override
	public String toString() {
		return "Dados animal: "+ 
			"Nome: " + getNome() + 
			" Idade: "+ getIdade();
	}
}