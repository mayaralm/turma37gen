package App;

import Entites.Funcionario;
import Entites.Terceiro;

public class Testefun {

	public static void main(String[] args) {
		Funcionario func1 = new Funcionario("Mayara","001");
		Terceiro ter1 = new Terceiro("Theo","020",50.00);
		
		func1.setHorasTrabalhas(80);
		func1.setValorHora(5.00);
		ter1.setHorasTrabalhas(80);
		ter1.setValorHora(5.00);
		
	
		System.out.println(func1.getNome() + " Salario é : "+ func1.calcularSalario());
		System.out.println(ter1.getNome() + " Salario é : " + ter1.calcularSalario());
	}

}
