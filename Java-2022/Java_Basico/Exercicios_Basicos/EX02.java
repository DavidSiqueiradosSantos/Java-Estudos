package Exercicios_Basicos;

import java.util.Scanner;

public class EX02 {

	public static void main(String[] args) {
		
		// Fazer um programa que imprima a m�dia aritm�tica dos n�meros 8,9 e 7. A m�dia dos
		// n�meros 4, 5 e 6. A soma das duas m�dias. A m�dia das m�dias.
		
		Scanner sc = new Scanner(System.in);
		
		double media1 = (8 + 9 + 7) / 3;
		double media2 = (4 + 5 + 6) / 3;
		double soma = media1 + media2;
		double mediaTotal = (media1 + media2) / 2;
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>> M�dia Aritm�tica! <<<<<<<<<<<<<<<<<<<<<<<<<<\n");
		
		System.out.println("1� N�meros = {8, 9 e 7}\n" +
						   "2� N�meros = {4, 5 e 6}\n");
		
		System.out.println("1� M�dia aritm�tica: " + media1);
		System.out.println("2� M�dia aritm�tica: " + media2);
		System.out.println("A soma das duas M�dia aritm�tica: " + soma);
		System.out.println("M�dia total: " + mediaTotal);
		
		
		sc.close();
		

	}

}
