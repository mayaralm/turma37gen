package entitie;

public class Paciente {
	
// atributos ->
	public String nome;
	public int idade;
	public int cpf;
	public String sintomas;

// metodos->
	public void sintomasDoPaciente(String dor, String dorDois) {
		if(dor == "febre" && dorDois == "paladar") {
			sintomas = "Ala da covid"; 
		}
		if(dor == "febre" && dorDois == "dor corpo" ) {
			sintomas = "Dengue";
		}
		else if(dor == "cabeça" && dorDois == "enxaqueca") {
			sintomas = "Ala do neuro";
		}
		else if(dor == "" && dorDois == "") {
			sintomas = "asintomatico";
		}
	}
	
	public String toString(){
		return 	"DATA: "+
				"Nome do pacinete: " + nome + " "
				+ 
				"idade: "+idade +   " "
				+
				"CPF: "+cpf+ " "
				+
				"Resultado: "+sintomas;
				
	}
	
}
