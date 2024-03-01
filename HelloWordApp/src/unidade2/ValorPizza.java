package unidade2;

import javax.swing.JOptionPane;

public class ValorPizza {

	public static void main(String[] args) {
				
		double valor_pizza = Double.parseDouble(JOptionPane.showInputDialog("Favor informar o valor da Pizza!"));
		int numero_clientes = Integer.parseInt(JOptionPane.showInputDialog("Favor informar o numero de clientes!"));
		double valor_por_cliente = valor_pizza / numero_clientes;
		JOptionPane.showMessageDialog(null, "Valor a ser pago por cliente é de " + valor_por_cliente);

	}

}
