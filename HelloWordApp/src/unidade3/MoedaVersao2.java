package unidade3;

import javax.swing.JOptionPane;

public class MoedaVersao2 {

	public static void main(String[] args) {

		double valor = Double.parseDouble(JOptionPane.showInputDialog("Favor informar o valor total a ser convertido"));
		int moeda = Integer.parseInt(JOptionPane.showInputDialog("Favor informar a moeda a ser convertido"));
		
		JOptionPane.showMessageDialog(null, switch(moeda) {
		case 1 -> "O valor convertido em Libra é: "+(valor/6);
		case 2 -> "O valor convertido em Dolar é: "+(valor/5);
		case 3 -> "O valor convertido em Euro é: "+(valor/5.3);
		default -> "Favor informar uma moeda correta";

		});

	}

}
