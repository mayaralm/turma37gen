package VetorMatriz;

import java.util.Scanner;

public class Exemplo2 {

	public static void main(String[] args) {
		/*Um dado � lan�ado 10 vezes e o valor correspondente � anotado.
		 * Fa�a um programa que gere um vetor com os lan�amentos, escreva esse vetor. 
		 * A seguir determine e imprima a m�dia aritm�tica dos lan�amentos, contabilize 
		 *e apresente tamb�m quantas foram as ocorr�ncias da maior pontua��o.
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
    	 System.out.println("Lan�amento "+ (x+1)+ "=" + lancamentos[x]);
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
     System.out.println("M�dia: "+ media);
     System.out.println("Maior Valor: "+ maiorValor);
    
     
     System.out.println("Maior valor aparece: " + quantidadeMaiorValor + " nos lan�amentos");
     
	}
	  
}
