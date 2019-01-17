import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TestePaintPanel {

	public static void main(String[] args) {
		
		JFrame app = new JFrame("Um simples programa de desenho.");
		PaintPanel paint = new PaintPanel();
		app.add(paint, BorderLayout.CENTER);
		
		app.add(new JLabel("Arraster o mouse clicando para desenhar."), BorderLayout.SOUTH);
		
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setSize(400, 300);
		app.setVisible(true);
		
	}
	
}
