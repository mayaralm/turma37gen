package LacosRepeticao;


import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {
	
	 int numero = 0;
	
	 
	 for(int i=1;i <=10;i++) {
		 System.out.println("Informe n�mero: ");
		 numero = Integer.parseInt(JOptionPane.showInputDialog("Informe n�mero: "));
		 if (numero%2== 0) {
				System.out.println("N�mero " + numero + " � par");
		}else {
				System.out.println("N�mero "+ numero + " � impar");
			}
		 
	 } 
	} 

}
