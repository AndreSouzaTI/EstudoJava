package unidade2;

//import java.util.Scanner;

import javax.swing.JOptionPane;

public class LeituraEscrita {

	public static void main(String[] args) {
		
//		Scanner teclado = new Scanner(System.in);
//		System.out.println("Digite seu nome");
//		String nome = teclado.next();
//		System.out.println("Seja bem vindo " + nome);
		
		var nome = JOptionPane.showInputDialog("Digite seu nome");
		JOptionPane.showMessageDialog(null, "Bem-vindo " + nome);
				

	}

}
