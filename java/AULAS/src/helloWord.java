import java.util.Scanner;

public class helloWord {
		public static void main(String[] args) {
			System.out.println("Hello Word!");
		Scanner leia = new Scanner(System.in);
		
			String nome;
			int anoNascimento;
			System.out.println("digite o nome: ");
			nome = leia.next();
		   System.out.println("digite o ano de nascimento: ");
			anoNascimento = leia.nextInt();
			
			System.out.println(nome + " sua idade é: " +(2021-anoNascimento)+ " anos");
		}
}
