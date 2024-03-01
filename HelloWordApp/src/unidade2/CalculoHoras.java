package unidade2;

import javax.swing.JOptionPane;

public class CalculoHoras {

	public static void main(String[] args) {
		
		int dias = Integer.parseInt((JOptionPane.showInputDialog("Informar o número de dias")));
		int horas = Integer.parseInt((JOptionPane.showInputDialog("Informar o número de horas")));
		int total_horas = (dias * 24) + horas;
		JOptionPane.showMessageDialog(null, "O valor total de viagem em horas é de " + total_horas);

	}

}
