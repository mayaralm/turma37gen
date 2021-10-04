package AulasLacos;

import java.util.Scanner;

public class Atividade4 {
	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		int numero;
		double raiz;
		double quadrado;

		System.out.println("Digite um número: ");
		numero = leia.nextInt();
		
		if (numero%2== 0) {
			System.out.println("Número " + numero + " é par");
			raiz = Math.sqrt(numero);
			System.out.println("raiz quadrada do número digitado:" + raiz);
		} else {
			System.out.println("Número "+ numero + " é impar");
			quadrado = numero * numero;
			System.out.println("O número digitado elevado ao quadrado é: " + quadrado);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
