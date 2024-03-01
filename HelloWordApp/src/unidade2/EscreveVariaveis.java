package unidade2;

import javax.swing.JOptionPane;

public class EscreveVariaveis {

	public static void main(String[] args) {

		double valor = 3.50;
		String fruta = JOptionPane.showInputDialog("Digite a fruta");
		//System.out.println("O valor da " + fruta +  "é de " + valor );
		JOptionPane.showConfirmDialog(null, "O valor da " + fruta +  " é de " + valor + " reais!");

	}

}
