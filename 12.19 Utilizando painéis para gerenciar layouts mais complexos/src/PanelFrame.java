import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelFrame extends JFrame {

	private final JPanel botaoJPanel;
	private final JButton[] botoes;
	
	public PanelFrame() {
		
		super("Panel Demo");
		botoes = new JButton[5];
		botaoJPanel = new JPanel();
		botaoJPanel.setLayout(new GridLayout(1, botoes.length));
		
		for(int cont = 0; cont < botoes.length; cont++) {
			
			botoes[cont] = new JButton("Botao " +(cont + 1));
			botaoJPanel.add(botoes[cont]);
			
		}
		
		add(botaoJPanel, BorderLayout.SOUTH);
		
	}
		
}
