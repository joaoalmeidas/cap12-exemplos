import javax.swing.JOptionPane;

public class Adicao {

	public static void main(String[] args) {
		
		String primeiroNumero = JOptionPane.showInputDialog("Insira um n�mero inteiro:");
		String segundoNumero = JOptionPane.showInputDialog("Insira um n�mero inteiro novamente:");
		
		int numero1 = Integer.parseInt(primeiroNumero);
		int numero2 = Integer.parseInt(segundoNumero);
		
		int soma = numero1 + numero2;
		
		JOptionPane.showMessageDialog(null, "O resultado � " +soma, "Soma de dois inteiros", JOptionPane.PLAIN_MESSAGE);
		
	}

}
