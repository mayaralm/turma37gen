package ExemploHeranca;

public class Teste {

	public static void main(String[] args) {
		Cachorro dog = new Cachorro("dog", 1);
		dog.Correr();
		dog.EmitirSom();
		
		System.out.println(dog+ "\n");
		
		Cavalo pocoto = new Cavalo("pocoto",3);
		pocoto.Correr();
		pocoto.EmitirSom();
		
		System.out.println(pocoto + "\n");
		
		
		Preguica ted = new Preguica("ted ",2);
		ted.SubirEmArvore();
		ted.EmitirSom();
		
		System.out.println(ted + "\n");
		

	}

}
