package ExemploHeranca;

public class Preguica extends Animal {
	
	
	public Preguica (String nome, int idade) {
		super(nome, idade);
}
	public void SubirEmArvore() {
		System.out.println(this.getNome() + " Est� subindo em �rvore");
	}

@Override
public String toString() {
	return "Dados animal: "+ 
		"Nome: " + getNome() + 
		"Idade: "+ getIdade();
}







}



	
	
