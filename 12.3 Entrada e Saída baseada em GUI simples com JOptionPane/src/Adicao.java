import javax.swing.JOptionPane;

public class Adicao {

	public static void main(String[] args) {
		
		String primeiroNumero = JOptionPane.showInputDialog("Insira um número inteiro:");
		String segundoNumero = JOptionPane.showInputDialog("Insira um número inteiro novamente:");
		
		int numero1 = Integer.parseInt(primeiroNumero);
		int numero2 = Integer.parseInt(segundoNumero);
		
		int soma = numero1 + numero2;
		
		JOptionPane.showMessageDialog(null, "O resultado é " +soma, "Soma de dois inteiros", JOptionPane.PLAIN_MESSAGE);
		
	}

}
