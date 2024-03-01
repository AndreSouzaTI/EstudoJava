package unidade3;

import javax.swing.JOptionPane;

public class Imc {

	public static void main(String[] args) {
		
		double altura, peso_ideal_homem, peso_ideal_mulher;
		String sexo;
				
		altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o altura"));
		sexo = JOptionPane.showInputDialog(null, "Digite o sexo");
		
		if (sexo.equalsIgnoreCase("M")) {
			peso_ideal_homem = (altura*72.7) - 58;
			JOptionPane.showMessageDialog(null, "O peso ideal do homem é de " + peso_ideal_homem + "KG");
			
		}else {
			peso_ideal_mulher = (altura*62.1) - 44.7;
			JOptionPane.showMessageDialog(null, "O peso ideal da mulher é de " + peso_ideal_mulher + "KG");
		}
		
		
						

	}

}
