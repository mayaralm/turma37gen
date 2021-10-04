import java.util.Scanner;

public class AtividadeJava1 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int dia;
		int mes;
		int ano;
		System.out.println("Digite sua idade: ");
		ano = leia.nextInt();
		System.out.println("Digite quantos meses: ");
		mes = leia.nextInt();
		System.out.println("Digite quantos dias: ");
		dia = leia.nextInt();

		dia += (ano * 365) + (mes * 30);
		System.out.println("Sua idade em dias é: " + dia);
	}

}
