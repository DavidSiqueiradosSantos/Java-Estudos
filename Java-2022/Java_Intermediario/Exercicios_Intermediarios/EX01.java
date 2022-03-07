package Exercicios_Intermediarios;

import java.util.Scanner;

public class EX01 {

	public static void main(String[] args) {

		
		 // Crie uma classe java MaiorNumero que contenha um método que receba dois
		 // números inteiros e imprima o maior entre eles.
		 

		Scanner sc = new Scanner(System.in);

		int n1, n2;

		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Maior Número! <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<\n");

		System.out.print("Digite o 1° Número inteiro: ");
		n1 = sc.nextInt();
		System.out.print("Digite o 2° Número inteiro: ");
		n2 = sc.nextInt();
		System.out.println();

		MaiorNumero(n1, n2);

		sc.close();

	}

	public static int MaiorNumero(int n1, int n2) {

		if (n1 > n2) {

			System.out.println("Número Maior: " + n1);

		} else if (n2 > n1) {

			System.out.println("Número Maior: " + n2);

		} else {
			
			System.out.println("Não foi encontrado um número MAIOR!");

		}

		return n2;

	}

}
