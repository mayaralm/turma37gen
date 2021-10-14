package utils;

public abstract class Conta {
	private int number;
	private String cpf;
	private double saldo;
	private boolean isAtive = true;
	
	public Conta(int number, String cpf) {
		this.number = number;
		this.cpf = cpf;
	}
	
	public int getNumber() {
		return number;
	}

	public double getSaldo() {
		return saldo;
	}

	public boolean isAtive() {
		return isAtive;
	}

	public void setAtive(boolean isAtive) {
		this.isAtive = isAtive;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getCpf() {
		return cpf;
	}

	public double debitar(double valor) {
		if(valor <= this.saldo) {
			this.saldo -= valor;
		} else {
			System.out.println("SALDO INDISPONIVEL!");
		} 
		
		return this.saldo;
	}
	public void ativarConta(boolean isAtive) {
		this.isAtive = isAtive;
	}
	public void credito(double valor) {
		this.saldo += valor;
	}
	
	
	
}
