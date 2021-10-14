package Entites;

public class Funcionario {
	private String nome;
	private String matricula;
	private int horasTrabalhas;
	private double valorHora;
	
	
	public Funcionario (String nome) {
		this.nome = nome;
	}
	
	public Funcionario(String nome, String matricula) {
		super();
		this.nome = nome;
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getHorasTrabalhas() {
		return horasTrabalhas;
	}

	public void setHorasTrabalhas(int horasTrabalhas) {
		this.horasTrabalhas = horasTrabalhas;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	
	
	public double calcularSalario() {
		return (this.horasTrabalhas*this.valorHora);
	}
	
	
	
	

}
