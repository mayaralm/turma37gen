package App;

import java.util.Scanner;

import Entites.ContaCorrente;

public class aplicacao {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("1 - CONTA POUPANÇA\r\n"
				+ "2 - CONTA CORRENTE\r\n"
				+ "3 - CONTA ESPECIAL\r\n"
				+ "4 - CONTA EMPRESA\r\n"
				+ "5 - CONTA ESTUDANTIL\r\n"
				+ "6 - SAIR");

		int opcao = sc.nextInt();
		switch(opcao) {
		case 1:
		 System.out.println("LOGICA DA CONTA POUPANÇA");
		 break;
		case 2: 
			ContaCorrente cc = new ContaCorrente(12346, "9960021564");
			System.out.println("\nDigite um valor de Deposito:");
			double valor = sc.nextDouble();			
			cc.credito(valor);
			System.out.println(cc);			
			System.out.println("\nValor a ser sacado: ");
			double sacarValor = sc.nextDouble();
			cc.debitar(sacarValor);
			System.out.println(cc);
			System.out.println("\nDigite quantos talões você deseja pedir:");	
			int comprarTalao = sc.nextInt();
			cc.pedirTalao(comprarTalao);
		
			
			System.out.println(cc);
		break;
		case 3: 
			System.out.println("CONTA ESPECIAL");
			break;
		case 4:
			System.out.println("CONTA EMPRESA");
			break;
		case 5: 
			System.out.println("CONTA ESTUDANTIL");
			break;
		case 6:
			System.out.println("VOLTE SEMPRE");
		}
			
		
	
	}
}
