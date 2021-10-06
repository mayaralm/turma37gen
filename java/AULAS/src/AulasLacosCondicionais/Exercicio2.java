package AulasLacosCondicionais;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numero1;
		int numero2;
		int numero3;
		int auxiliar;
		
	System.out.println("Digite o primeiro número: ");
	numero1 = input.nextInt();
	System.out.println("Digite o segundo número: ");
	numero2 = input.nextInt();
	System.out.println("Digite o terceiro número: ");
	numero3 = input.nextInt();
	
	
	 if (numero1 > numero2) {
         auxiliar = numero1;
         numero1 = numero2;
         numero2 = auxiliar;
     }

     if (numero2 > numero3) {
         auxiliar = numero2;
         numero2 = numero3;
         numero3 = auxiliar;

     }
      
  
     if (numero1 > numero2) {
         auxiliar = numero1;
         numero1 = numero2;
         numero2 = auxiliar;
     }
     
     
     	System.out.println("Ordem crescente: " + numero1 + " " + numero2 + " " + numero3);
     
     
     
     
	}
	

}
