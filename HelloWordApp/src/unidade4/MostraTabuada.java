package unidade4;

import java.util.Scanner;

public class MostraTabuada {

	public static void main(String[] args) {
		
		int i, numero, total = 1;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Favor inserir o número");
		numero = teclado.nextInt();
		
		for (i=1;i<=10; i++) {
			total = numero * i;
			System.out.println("Número: " +numero+ " x " +i+ " = " +total);
			teclado.close();
		}
	}

}