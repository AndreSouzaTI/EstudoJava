package unidade2;

import javax.swing.JOptionPane;

public class Jantar {

	public static void main(String[] args) {
		
		final double TAXA_GARCON = 0.1;
		
		
		double valor_jantar, valor_jantar_total;
		valor_jantar = Double.parseDouble(JOptionPane.showInputDialog("Favor informar o valor do jantar!"));
		valor_jantar_total = valor_jantar + (TAXA_GARCON * valor_jantar);
		JOptionPane.showMessageDialog(null, "Valor total do jantar a ser pago é de " + valor_jantar_total);

	}

}
