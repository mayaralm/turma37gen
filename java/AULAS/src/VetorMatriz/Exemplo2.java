package VetorMatriz;

import java.util.Scanner;

public class Exemplo2 {

	public static void main(String[] args) {
		/*Um dado é lançado 10 vezes e o valor correspondente é anotado.
		 * Faça um programa que gere um vetor com os lançamentos, escreva esse vetor. 
		 * A seguir determine e imprima a média aritmética dos lançamentos, contabilize 
		 *e apresente também quantas foram as ocorrências da maior pontuação.
		 */
     Math.random();
     Scanner leia= new Scanner(System.in);
     int[] lancamentos = new int [10];
     int total= 0;
     double media = 0.00;
     int maiorValor = 0;
     int quantidadeMaiorValor = 0;
     
     
     for (int x=0;x<10;x++) {
    	 lancamentos[x]=(int)(Math.random()*10);
    	 System.out.println("Lançamento "+ (x+1)+ "=" + lancamentos[x]);
    	 total+=lancamentos[x];
    	 if(lancamentos[x] >= maiorValor) {
    		 if(lancamentos[x] == maiorValor) {
    			 quantidadeMaiorValor++;
    		 }
    	 } else if(lancamentos[x]>maiorValor) {
    		 quantidadeMaiorValor = 1;
    	 }
    	 	maiorValor = lancamentos[x];
     
     }   
     media = total/10;
     System.out.println("Média: "+ media);
     System.out.println("Maior Valor: "+ maiorValor);
    
     
     System.out.println("Maior valor aparece: " + quantidadeMaiorValor + " nos lançamentos");
     
	}
	  
}
