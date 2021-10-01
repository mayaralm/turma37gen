import java.util.Scanner;

public class AtividadeJava4 {
	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int nota1;
		int nota2;
		int nota3;
		int media;
		System.out.println("digite nota 1: ");
		nota1 = leia.nextInt();
		System.out.println("digite nota 2: ");
		nota2 = leia.nextInt();
		System.out.println("digite nota 3: ");
		nota3 = leia.nextInt();
		
		media = ((nota1*2)+(nota2*3)+(nota3*5))/10;
		
		System.out.println("Sua média é :" + media);
		
		
	}

}
