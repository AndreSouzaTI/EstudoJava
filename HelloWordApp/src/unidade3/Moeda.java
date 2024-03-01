package unidade3;

import java.util.Scanner;

public class Moeda {

	public static void main(String[] args) {
		
		double valor, valor_convertido;
		int tipo_moeda;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Favor informar o valor ser convertido");
		valor = teclado.nextInt();
		System.out.println("Favor informar o tipo de moeda [1-Libra][2-Dolar][3-Euro]");
		tipo_moeda = teclado.nextInt();
		
		switch (tipo_moeda) {
		case 1: {
			
			valor_convertido = valor/6;
			System.out.println("O valor convertido em libras é de " + valor_convertido);
			break;
		}
		case 2: {
			
			valor_convertido = valor/4;
			System.out.println("O valor convertido em dolar é de " + valor_convertido);
			break;
		}
		case 3: {
	
			valor_convertido = valor/5;
			System.out.println("O valor convertido em euro é de " + valor_convertido);
			break;
		}
		default:
			System.out.println("Opção digitada incorreta");
			teclado.close();			
		
		}
		
		
	}

}
