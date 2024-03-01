package unidade2;

import javax.swing.JOptionPane;

public class OpcoesPagamento {

	public static void main(String[] args) {
		double valor_produto = Double.parseDouble(JOptionPane.showInputDialog("Favor informar o valor do produto!"));
		double produto_avista = valor_produto * 0.9;
		double produto_parcelado = 	valor_produto / 3;
		System.out.println("O produto a vista com 10% de desconto sairá " + produto_avista);
		System.out.println("O produto a parcelado fica em 3x de " + produto_parcelado);
		
	}

}
