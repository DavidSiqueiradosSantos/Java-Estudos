package Exercicios_Intermediarios;

import java.util.Scanner;

public class EX01 {

	public static void main(String[] args) {

		
		 // Crie uma classe java MaiorNumero que contenha um m�todo que receba dois
		 // n�meros inteiros e imprima o maior entre eles.
		 

		Scanner sc = new Scanner(System.in);

		int n1, n2;

		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Maior N�mero! <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<\n");

		System.out.print("Digite o 1� N�mero inteiro: ");
		n1 = sc.nextInt();
		System.out.print("Digite o 2� N�mero inteiro: ");
		n2 = sc.nextInt();
		System.out.println();

		MaiorNumero(n1, n2);

		sc.close();

	}

	public static int MaiorNumero(int n1, int n2) {

		if (n1 > n2) {

			System.out.println("N�mero Maior: " + n1);

		} else if (n2 > n1) {

			System.out.println("N�mero Maior: " + n2);

		} else {
			
			System.out.println("N�o foi encontrado um n�mero MAIOR!");

		}

		return n2;

	}

}
