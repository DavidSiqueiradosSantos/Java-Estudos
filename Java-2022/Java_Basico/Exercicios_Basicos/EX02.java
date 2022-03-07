package Exercicios_Basicos;

import java.util.Scanner;

public class EX02 {

	public static void main(String[] args) {
		
		// Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A média dos
		// números 4, 5 e 6. A soma das duas médias. A média das médias.
		
		Scanner sc = new Scanner(System.in);
		
		double media1 = (8 + 9 + 7) / 3;
		double media2 = (4 + 5 + 6) / 3;
		double soma = media1 + media2;
		double mediaTotal = (media1 + media2) / 2;
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>> Média Aritmética! <<<<<<<<<<<<<<<<<<<<<<<<<<\n");
		
		System.out.println("1° Números = {8, 9 e 7}\n" +
						   "2° Números = {4, 5 e 6}\n");
		
		System.out.println("1° Média aritmética: " + media1);
		System.out.println("2° Média aritmética: " + media2);
		System.out.println("A soma das duas Média aritmética: " + soma);
		System.out.println("Média total: " + mediaTotal);
		
		
		sc.close();
		

	}

}
