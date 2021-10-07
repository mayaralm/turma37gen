package entitie;

public class Eletronico {
	public String tipo;
	public String modelo;
	public int qtde;
	public double valor;
	public String botoes;
	
	public void modeloTv(String eletronico) {
		if (eletronico == "smart tv") {
			tipo = "Smart Tv\nproduto em estoque.";
			
		} else {
			tipo = "Não possuimos esse eletronico em estoque.";
		}
		
	}
	@Override
	public String toString () {
		return "Produto selecionado: " + "\n"+ tipo+ "\n"+
				"Quantidade Selecionada:  "+ "\n"+ qtde+ "\n"+
				"Valor do produto selecionado: "+ "\n"+valor;
				
				
	}

}
