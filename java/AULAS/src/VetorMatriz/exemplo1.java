package VetorMatriz;

import java.util.Scanner;

public class exemplo1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int[] pontuacao = new int[5];
		int maiorPontuacao = 0;
		
		for(int i=0;i<pontuacao.length;i++) {
			System.out.println("Digite pontuação: ");
			pontuacao[i] = leia.nextInt();
		}
		for(int i=0;i<pontuacao.length;i++) {
			if (maiorPontuacao < pontuacao[i]) {
				maiorPontuacao = pontuacao[i];	
			}
		}
		System.out.println("A maior pontuação é: "+maiorPontuacao);

	}

}
