package AulasLacos;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args){
		Scanner leia= new Scanner(System.in);
		
		int idade;
		
		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();
		
		if(idade<=14) {
			System.out.println("voc� � da categoria infantil!");
		} else if (idade<=17) {
			System.out.println("voc� � da categoria juvenil!");
		} else {
			System.out.println("voc� � da categoria adulto! ");
		}
		
	}

}
