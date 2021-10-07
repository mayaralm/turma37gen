package App;

import entitie.Paciente;

public class aplicacaoPaciente {

	public static void main(String[] args) {
		Paciente p1 = new Paciente();
		p1.cpf = 123456789;
		p1.nome = "theo";
		p1.sintomasDoPaciente("", "");
		
		
		
		System.out.println(p1);
		

	}

}
