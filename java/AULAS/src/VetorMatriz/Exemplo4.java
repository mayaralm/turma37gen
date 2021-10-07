package VetorMatriz;

import java.util.Scanner;

public class Exemplo4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int tamanho = 3;
		int soma = 0;
		int diagonal = 0;
		int matriz[][] = new int [tamanho][3];
		int linha, coluna;
		
		for(linha=0; linha<tamanho; linha++) {
			for(coluna = 0; coluna<3; coluna++) {
				System.out.print("Digite um valor válido: ");
				matriz[linha][coluna]= leia.nextInt();
				soma += matriz[linha][coluna];
				if (linha == coluna) {
					diagonal += matriz[linha][coluna];
				}
			}
		}
		for(linha=0;linha<tamanho;linha++) {
			for(coluna=0;coluna<3;coluna++) {
				System.out.print("["+ matriz[linha][coluna] +"]");
			}
			System.out.println("");
		}
		System.out.println("\nSoma total é: " + soma);
		System.out.println("Soma diagonal é:" + diagonal);
	}

}
