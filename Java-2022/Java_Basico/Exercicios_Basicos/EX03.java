package Exercicios_Basicos;


import javax.swing.JOptionPane;

public class EX03 {

	public static void main(String[] args) {
		
		// Informar um saldo e imprimir o saldo com reajuste de 1%.
		
		double saldo = Double.parseDouble(JOptionPane.showInputDialog("Informe o saldo: " , "0.00"));
		
		double reajuste = saldo * 0.01;
		
		
		JOptionPane.showMessageDialog(null, "saldo com Reajuste de 1%!"
											 + "\n" + (reajuste));

	}

}
