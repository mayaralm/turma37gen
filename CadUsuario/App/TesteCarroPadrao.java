package App;

import entitie.Carro;

public class TesteCarroPadrao {

	public static void main(String[] args) {
		Carro carro1 = new Carro("PLX-0301","CELTA","GM");
		Carro carro2= new Carro();
		
		
		carro2.setPlaca("BBC - 0801");
		carro2.setModelo("UNO");
		carro1.setPlaca("PPR - 0502");
		
		
		
		System.out.println(carro1.getModelo()+ " "+ carro1.getPlaca());
		System.out.println(carro2.getModelo()+ " " + carro2.getPlaca());

	}

}
