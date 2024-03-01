package unidade2;

//import java.util.Scanner;

import javax.swing.JOptionPane;

public class CalculaDobro {

	public static void main(String[] args) {
		
//		Scanner teclado = new Scanner(System.in);
//		System.out.println("Digite o número");
//		double numero = teclado.nextDouble();
//		double dobro = numero * 2;
//		System.out.println("O dobro do número digitado é " + dobro);
		
		var numero = JOptionPane.showInputDialog(null, "Digite o número");
		var dobro = Double.parseDouble(numero) * 2;
		
		JOptionPane.showMessageDialog(null, "O dobro do número digitado é " + dobro);

	}

}
