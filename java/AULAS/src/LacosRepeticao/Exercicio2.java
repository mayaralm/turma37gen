package LacosRepeticao;


import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {
	
	 int numero = 0;
	
	 
	 for(int i=1;i <=10;i++) {
		 System.out.println("Informe número: ");
		 numero = Integer.parseInt(JOptionPane.showInputDialog("Informe número: "));
		 if (numero%2== 0) {
				System.out.println("Número " + numero + " é par");
		}else {
				System.out.println("Número "+ numero + " é impar");
			}
		 
	 } 
	} 

}
