package unidade3;

import java.util.Scanner;

public class CaixaEletronico {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite Valor do saque");
		int saque = teclado.nextInt();
		double notas100, notas50, notas10, resto;
		
		
		if (saque%10 == 0) {
			notas100 = Math.floor(saque/100);
			resto = saque % 100;
			notas50 = Math.floor(resto/50);
			resto = resto % 50;
			notas10 = Math.floor(resto/10);
			
			if(notas100 > 0)
			System.out.println("O número de notas de cem = " + notas100);
			if(notas50 > 0)
				System.out.println("O número de notas de cinquenta = " + notas50);
			if(notas10 > 0) {
				System.out.println("O número de notas de dez = " + notas10);
			}
		}else {
			System.out.println("Valor informado de saque incorreto. Favor inserir novo valor!");
		}
	main(null);
	teclado.close();
	
	}
}	


