import java.util.Scanner;

public class AtividadeJava3 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int horas;
		int segundos;
		int minutos;
		int seg;
		System.out.println("digite a dura��o do evento em segundos: ");
		segundos = leia.nextInt();

		horas = (segundos / 3600);
		minutos = ((segundos % 3600) / 60);
		seg = ((segundos % 3600) % 60);

		System.out.println(
				"A dura��o do evento foi de " + horas + " horas " + minutos + " minutos e " + seg + " segundos");
	}

}
