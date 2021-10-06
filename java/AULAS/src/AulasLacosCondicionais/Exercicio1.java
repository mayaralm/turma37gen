package AulasLacosCondicionais;

import java.util.Scanner;

public class Exercicio1 {
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
		int numero1;
		int numero2;
		int numero3;
		int op;
		
		System.out.println("Digite o primeiro número: ");
		numero1= input.nextInt();
		System.out.println("Digite o segundo número: ");
		numero2 = input.nextInt();
		System.out.println("Digite o terceiro número: ");
		numero3= input.nextInt();
		
		if (numero1 > numero2) {
			op = numero1;
		} 
		else if (numero2 > numero3) {
			op = numero2;
		} 
		
		else {
			op = numero3;
		}
		
		System.out.printf("O número maior é: %d",op);
			
		
		
		
		
	}

}
