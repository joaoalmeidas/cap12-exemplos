import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutFrame extends JFrame implements ActionListener {
	
	private final JButton[] botoes;
	private final String[] nomes = {"um", "dois", "tres", "quatro", "cinco", "seis"};
	private boolean toggle = true;
	private final Container container;
	private final GridLayout grid1;
	private final GridLayout grid2;
	
	public GridLayoutFrame() {
		
		super("GridLayout demo");
		
		grid1 = new GridLayout(2, 3, 5, 5);
		grid2 = new GridLayout(3, 2);
		container = getContentPane();
		setLayout(grid1);
		botoes = new JButton[nomes.length];
		
		for(int cont = 0; cont < nomes.length; cont++) {
			
			botoes[cont] = new JButton(nomes[cont]);
			botoes[cont].addActionListener(this);
			add(botoes[cont]);
			
		}
				
				
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		
		if(toggle) {
			container.setLayout(grid2);
		}else {
			container.setLayout(grid1);
		}
		
		toggle = !toggle;
		container.validate();
		
	}
	
	
	
}
