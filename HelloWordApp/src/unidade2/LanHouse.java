package unidade2;

import javax.swing.JOptionPane;

public class LanHouse {

	public static void main(String[] args) {

		double VALOR_15MIN = 2;
		
		double horas, minutos, total_minutos, valor_total;
		horas = Double.parseDouble((JOptionPane.showInputDialog("E Favor informar o numero de horas utilizadas!")));
		minutos = Double.parseDouble((JOptionPane.showInputDialog("E Favor informar o numero de minutos utilizados!")));
		total_minutos = (horas * 60  ) + minutos;
			JOptionPane.showMessageDialog(null, ("O total de minutos utilizados foi " + total_minutos));
		valor_total = Math.ceil(total_minutos / 15) * VALOR_15MIN;
			JOptionPane.showMessageDialog(null, ("O valor total é de ") + valor_total);
				
	}

}
