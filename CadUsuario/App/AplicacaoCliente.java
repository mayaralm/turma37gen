package App;

import entitie.Cliente;

public class AplicacaoCliente {

	public static void main(String[] args) {
		Cliente c1 = new Cliente ();
		c1.nome = "Mayara leite";
		c1.email = "mayaralm.com";
		c1.logarCliente("theo", "abcd1234");
		
		System.out.println(c1);

	}

}
