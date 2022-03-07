package Exercicios_Basicos;

import javax.swing.JOptionPane;

public class EX05 {

	public static void main(String[] args) {
		
		/* 5. Crie um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
		 *  calcule a quantidade de salários mínimos esse usuário ganha e imprima o resultado. (1SM=R$788,00)
		 */

	double salarioMinimo = 788.00;
	float salarioUsuario;
	
	salarioUsuario = Float.parseFloat(JOptionPane.showInputDialog("Informe o salário do Usuario: R$" , "R$:"));
	
	float total = (float) (salarioUsuario / salarioMinimo);
	
	JOptionPane.showMessageDialog(null, "Quantidade de salário Minimo do Usuario:\n R$ " + total );
	}

}
