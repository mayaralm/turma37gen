import java.util.Scanner;

public class AtividadeJava2 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int dia;
		int mes;
		int ano;
		int dias;
		System.out.println("Escreva sua idade em dias: ");
		dias = leia.nextInt();
		
		ano = (dias/365);
		mes = (dias%365)/30;
		dia = (dias%365)%30;
		
		System.out.println("Você tem: " + ano + " anos " + mes + " meses e " + dia + " dias");
		
		
	}

}
