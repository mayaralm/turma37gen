package AulasLacos;

import java.util.Scanner;

public class Atividade4 {
	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		int numero;
		double raiz;
		double quadrado;

		System.out.println("Digite um n�mero: ");
		numero = leia.nextInt();
		
		if (numero%2== 0) {
			System.out.println("N�mero " + numero + " � par");
			raiz = Math.sqrt(numero);
			System.out.println("raiz quadrada do n�mero digitado:" + raiz);
		} else {
			System.out.println("N�mero "+ numero + " � impar");
			quadrado = numero * numero;
			System.out.println("O n�mero digitado elevado ao quadrado �: " + quadrado);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
