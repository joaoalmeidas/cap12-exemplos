import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutFrame extends JFrame implements ActionListener{
	
	private final JButton[] botoes;
	private static final String[] nomes = {"Esconde Norte", "Esconde Sul", "Esconde Leste", "Esconde Oeste", "Esconde Centro"};
	private final BorderLayout layout;
	
	public BorderLayoutFrame() {
		
		super("BorderLayout Demo");
		
		layout = new BorderLayout(5, 5);
		setLayout(layout);
		botoes = new JButton[nomes.length];
		
		for(int cont = 0; cont < nomes.length; cont++) {
			
			botoes[cont] = new JButton(nomes[cont]);
			botoes[cont].addActionListener(this);
			
		}
		
		add(botoes[0], BorderLayout.NORTH);
		add(botoes[1], BorderLayout.SOUTH);
		add(botoes[2], BorderLayout.EAST);
		add(botoes[3], BorderLayout.WEST);
		add(botoes[4], BorderLayout.CENTER);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		
		for(JButton botao : botoes) {
			
			if(event.getSource() == botao) {
				botao.setVisible(false);
			}else {
				botao.setVisible(true);
			}
			
		}
		
		layout.layoutContainer(getContentPane());
		
	}
	
	
	
}
