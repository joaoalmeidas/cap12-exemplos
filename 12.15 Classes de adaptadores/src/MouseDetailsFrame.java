import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseDetailsFrame extends JFrame{
	
	private String detalhes;
	private final JLabel barraDeStatus;
	
	public MouseDetailsFrame() {
		
		super("Cliques do mouse e botoes");
		
		barraDeStatus = new JLabel("Clique o mouse");
		add(barraDeStatus, BorderLayout.SOUTH);
		addMouseListener(new MouseClickHandler());
		
	}
	
	private class MouseClickHandler extends MouseAdapter{

		@Override
		public void mouseClicked(MouseEvent event) {
			
			int xPos = event.getX();
			int yPos = event.getY();
			
			detalhes = String.format("Clicado %d vezes", event.getClickCount());
			
			if(event.isMetaDown()) {
				detalhes += " com o botão direito.";
			}else if(event.isAltDown()) {
				detalhes += " com o botão central";
			}else {
				detalhes += " com o botão esquerdo";
			}
			
			barraDeStatus.setText(detalhes);
			
		}
		
		
		
	}
	
}
