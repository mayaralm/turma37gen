package LacosRepeticao;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
		int numero;
		int soma=0, contador=0, media=0;
		
		do {
			System.out.println("Digite um n�mero inteiro multiplo de 3: ");
			numero = leia.nextInt();
			if (numero%3==0 && numero!=0) {
				soma = soma+numero;
				contador++;
				media= soma/contador;			
			}else {
				System.out.println("n�mero digitado n�o � multiplo de 3!");
			}
		}
		while (numero!=0);
		System.out.println("m�dia:"+ media);

	}

}
