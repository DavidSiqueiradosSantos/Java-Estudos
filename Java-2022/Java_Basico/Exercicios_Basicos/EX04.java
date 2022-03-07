package Exercicios_Basicos;

import java.util.Scanner;

public class EX04 {

	public static void main(String[] args) {
		
		/* 4. Escrever um algoritmo que l�: - a porcentagem do IPI a ser acrescido no valor das pe�as - o c�digo da pe�a 1, 
		 * valor unit�rio da pe�a 1, quantidade de pe�as 1 - o c�digo da pe�a 2, valor unit�rio da pe�a 2, quantidade de pe�as 2
		 * O algoritmo deve calcular 
		 * o valor total a ser pago e apresentar o resultado. F�rmula : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1)
		 */

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe a procentagem do IPI a ser acrescentado: ");
		double ipi = sc.nextDouble();
		
		System.out.print("\nC�digo da pe�a 1: ");
		int cod1 = sc.nextInt();
		
		System.out.print("Valor Unit�rio da pe�a 1(cod-" + cod1 + "): R$");
		float valor1 = sc.nextFloat();
		
		System.out.print("Quantida de pe�as 1: ");
		int qntd1 = sc.nextInt();
		
		System.out.print("\nC�digo da pe�a 2: ");
		int cod2 = sc.nextInt();
		
		System.out.print("Valor Unit�rio da pe�a 1(cod-" + cod2 + "): R$");
		float valor2 = sc.nextFloat();
		
		System.out.print("Quantida de pe�as 2: ");
		int qntd2 = sc.nextInt();
		
		float valorTotal = (float) ((valor1 * qntd1 + valor2 * qntd2) * (ipi/100 + 1));
		
		
		System.out.printf("\nValor total a ser pago: R$%.2f" , valorTotal);
		
		sc.close();
	}

}
