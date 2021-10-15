package DevStoreProjet;

public class ItensLoja {
 private String nome;
 private String codigo;
 private double preco;
 private int estoque;
 
public ItensLoja(String nome, String codigo, double preco, int estoque) {
	super();
	this.nome = nome;
	this.codigo = codigo;
	this.preco = preco;
	this.estoque = estoque;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getCodigo() {
	return codigo;
}
public void setCodigo(String codigo) {
	this.codigo = codigo;
}
public double getPreco() {
	return preco;
}
public void setPreco(double preco) {
	this.preco = preco;
}
public int getEstoque() {
	return estoque;
}
public void setEstoque(int estoque) {
	this.estoque = estoque;
}
 public int remover(int valor) {
	 if (valor<= this.estoque) {
		return this.estoque -= valor;
	 }else {
		 System.out.println("Quantidade Indisponivel!");
	 }
	 return this.estoque;
	 
	 
 }
@Override
public String toString() {
	return "ItensLoja [ Nome = " + nome + " " + "codigo= " + codigo + " " + "preco= " + preco + " "+ "estoque= " + estoque + "]";
}
 
}

