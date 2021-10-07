package App;

import entitie.Eletronico;

public class AppEletronico {

	public static void main(String[] args) {
		Eletronico p1 = new Eletronico ();
		p1.tipo = "tv";
		p1.qtde = 2;
		p1.valor = 2.000;
		p1.modeloTv("smart tv");
		
		
		System.out.println(p1);
	}
	

}
