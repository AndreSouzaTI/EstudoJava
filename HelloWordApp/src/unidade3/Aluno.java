package unidade3;

import java.util.Scanner;

public class Aluno {

	public static void main(String[] args) {
		
		final int QUANTIDADE_NOTAS = 4;
		double nota1, nota2, nota3, nota4;
		double media;
		int frequencia;
		
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Favor informar nota 1 ");
		nota1 = teclado.nextDouble();				
		System.out.println("Favor informar nota 2 ");
		nota2 = teclado.nextDouble();
		System.out.println("Favor informar nota 3 ");
		nota3 = teclado.nextDouble();
		System.out.println("Favor informar nota 4 ");
		nota4 = teclado.nextDouble();
		
		System.out.println("Favor informar a frequência ");
		frequencia = teclado.nextInt();
		
		media = (nota1 + nota2 + nota3 + nota4) / QUANTIDADE_NOTAS;
		System.out.println("A média final é de " + media);
		
		if ((media < 5) || (frequencia < 75)) {
			System.out.println("Aluno reprovado!");
		} else {
			System.out.println("Aluno aprovado!");
			teclado.close();
		}
	}

}
