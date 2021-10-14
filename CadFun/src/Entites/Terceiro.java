package Entites;

public class Terceiro extends Funcionario {
	private double adicional;

	public Terceiro(String nome, String matricula, double adicional) {
		super(nome, matricula);
		this.adicional = adicional;
	}

	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	@Override
	public double calcularSalario() {
		return (super.getHorasTrabalhas()*super.getValorHora()) + this.adicional;
	}
	

}
