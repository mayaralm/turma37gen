package entitie;

public class Cliente {
// atributos ->
	public String nome;
	public int idade;
	public String email;
	public int telefone;
	public String login;
	public int qtdeProduto;
// metodos-> 
	public void logarCliente(String usuario, String senha) {
		if(usuario == "mayara" && senha == "abcd123") {
			login = "Usuario logado com sucesso.";
		} else {
			login = "Usuario ou senha invalido.";
		}
	}
	@Override
	public String toString() {
		return "Dados do cliente: "+ login+ "   \n"+
				"nome de usuario: " +  nome +" \n" +
				"Email de cliente: " +  email + "  \n" +
				"Quantidade de produtos comprados: " + qtdeProduto;
				
	}
}
