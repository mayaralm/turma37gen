package entitie;

import java.util.Arrays;

public class ProdutosDev {
	private String loja [][] =  {
			{"G4-1","Teclado", "40.0", "10", "0"}, 
			{"G4-2", "Mouse", "20.0", "10", "0"}, 
			{"G4-3", "Cadeira", "500.0", "10", "0"},
			{"G4-4", "Gabinetes", "400.0", "10", "0"},
			{"G4-5", "Memoria ram", "45.0", "10", "0"},
			{"G4-6", "Monitor", "600.0", "10", "0"},
			{"G4-7", "Headset", "40.0", "10", "0"},
			{"G4-8", "SuporteNote", "80.0", "10", "0"},
			{"G4-9", "Mousepad", "10.0", "10", "0"},
			{"G4-10", "Notebook", "2000.0", "10", "0"}};
	public String desejo;
	public boolean repete = true;
	public int opcaoPagamento = 0;
	public double qtdCompra = 0.0,totalCompra = 0.0, valorCompra = 0.0, imposto = 0.0, valor10Porcento = 0.0, aumento15Porcento=0.0;
	
	public String[][] getLoja() {
		return loja;
	}

	@Override
	public String toString() {
		return "ProdutosDev [loja=" + Arrays.toString(loja) + ", getLoja()=" + Arrays.toString(getLoja()) + "]";
	}
	
	
	
	
}
