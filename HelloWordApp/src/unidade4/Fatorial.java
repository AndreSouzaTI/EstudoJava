package unidade4;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		
		double fatorial = 1;
		int numero, i;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Favor informar o número");
		numero = teclado.nextInt();
		i = numero;
		while (i >=1)
		{
			fatorial = fatorial * i;
			i--; // numero = numero - 1;
		}
		System.out.println("O fatorial do número:"+numero+"="+fatorial);
		teclado.close();
	}
}
