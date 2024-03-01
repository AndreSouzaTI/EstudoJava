package unidade3;

import java.util.Scanner;

public class AlgoritmoTriangulo {

	public static void main(String[] args) {
					
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite valor de a");
		var a = teclado.nextInt();
		System.out.println("Digite valor de b");
		var b = teclado.nextInt();
		System.out.println("Digite valor de c");
		var c = teclado.nextInt();
		
		if ((a < b +c) && (b < a + c) && (c < a + b)) {
			
			if ((a == b) && (b == c))
			System.out.println("Triângulo Equilátero!!");
			else {
				if ((a == b) || (b == c ))
				System.out.println("Triângulo Isósceles!!");
			
				else 
				System.out.println("Triângulo Escaleno!!");
			}
		}else {
			System.out.println("Os valores informados não formam um triângulo!");
			teclado.close();
		}
		
		

	}

}
