package Exercicios_Basicos;

import java.util.Scanner;

public class EX01 {

	public static void main(String[] args) {
		
		// Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
		// mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
		// (Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)

		Scanner sc = new Scanner(System.in);
		
		int anos, meses, dias, TotalIdadeEmDias;
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Idade Pessoa <<<<<<<<<<<<<<<<<<<<<<<<<<<<<\n");
		
		System.out.print("> Informe a idade expressa em anos: ");
		anos = sc.nextInt();
		
		System.out.print("> Informe a idade expressa em meses: ");
		meses = sc.nextInt();
		
		System.out.print("> Informe a idade expressa em dias: ");
		dias = sc.nextInt();
		
		TotalIdadeEmDias = (anos * 365 + meses * 30 + dias);
		
		System.out.println("\n" + anos + " anos, " + meses + " meses e " + dias + " dias = " + TotalIdadeEmDias + " dias.");
		
		sc.close();
		
	}

}
