package Exercicios_Basicos;

import javax.swing.JOptionPane;

public class EX05 {

	public static void main(String[] args) {
		
		/* 5. Crie um algoritmo que leia o valor do sal�rio m�nimo e o valor do sal�rio de um usu�rio,
		 *  calcule a quantidade de sal�rios m�nimos esse usu�rio ganha e imprima o resultado. (1SM=R$788,00)
		 */

	double salarioMinimo = 788.00;
	float salarioUsuario;
	
	salarioUsuario = Float.parseFloat(JOptionPane.showInputDialog("Informe o sal�rio do Usuario: R$" , "R$:"));
	
	float total = (float) (salarioUsuario / salarioMinimo);
	
	JOptionPane.showMessageDialog(null, "Quantidade de sal�rio Minimo do Usuario:\n R$ " + total );
	}

}
