package AulasLacosCondicionais;

import java.util.Scanner;

public class Exercicio1 {
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
		int numero1;
		int numero2;
		int numero3;
		int op;
		
		System.out.println("Digite o primeiro n�mero: ");
		numero1= input.nextInt();
		System.out.println("Digite o segundo n�mero: ");
		numero2 = input.nextInt();
		System.out.println("Digite o terceiro n�mero: ");
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
		
		System.out.printf("O n�mero maior �: %d",op);
			
		
		
		
		
	}

}
