package unidade3;

import javax.swing.JOptionPane;

public class AvaliacaoNota {

	public static void main(String[] args) {
		
		int nota = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a nota"));
		
		if ((nota >=0) && (nota <=100)) {
			JOptionPane.showMessageDialog(null, "A nota é " + nota);
		if (nota >=90) 
			JOptionPane.showMessageDialog(null, "Conceito Exelente");
		else if (nota >=70) 
			JOptionPane.showMessageDialog(null, "Conceito Bom");
		else if (nota >=50) 
			JOptionPane.showMessageDialog(null, "Conceito Regular");
		else
			JOptionPane.showMessageDialog(null, "Conceito Insuficiente");
		}else {
			JOptionPane.showMessageDialog(null, "A nota é inválida");
			AvaliacaoNota.main(null);
			
		} 

	}

}
