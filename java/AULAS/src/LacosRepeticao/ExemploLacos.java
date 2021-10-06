package LacosRepeticao;

import java.util.Scanner;

public class ExemploLacos {
	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		String nome[] = new String[4]; //0-3
		int nota[]= {0,0,0,0};
		String disciplina[]= {"MATEMATICA","PORTUGUÊS","CIÊNCIAS","ARTES"};
		
		
		for(int x=0;x<4;x++) {
			System.out.println("Digite nome do aluno: ");
			nome[x]= leia.next();
			System.out.println("Digite a nota de "+ disciplina[x] + ":");
			nota[x] = leia.nextInt();
		}
	}

}
