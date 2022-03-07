package Exercicios_Basicos;

import java.util.Scanner;

public class EX06 {

	public static void main(String[] args) {
		
		/* 6. Desenvolva um algoritmo em Java que leia um número inteiro e imprima o seu antecessor e seu sucessor.
		 */
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>> Antecessor & Sucessor! <<<<<<<<<<<<<<<<<<<<<<<<<<");
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.print("Informe um número qualquer: ");
		n = sc.nextInt();
		
		int antecessor = n - 1;
		int sucesor = n + 1;
		
		System.out.println("\nNúmero antecessor: " + antecessor +
						   "\nNúmero sucessor: " + sucesor);
		
		sc.close();

	}

}
