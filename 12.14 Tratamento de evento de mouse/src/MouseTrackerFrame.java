import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MouseTrackerFrame extends JFrame{
	
	private final JPanel mousePanel;
	private final JLabel barraDeStatus;
	
	MouseTrackerFrame(){
		
		super("Demonstrando eventos do mouse");
		
		mousePanel = new JPanel();
		mousePanel.setBackground(Color.WHITE);
		
		add(mousePanel, BorderLayout.CENTER);
		
		barraDeStatus = new JLabel("Mouse fora do JPanel");
		add(barraDeStatus, BorderLayout.SOUTH);
		
		MouseHandler handler = new MouseHandler();
		mousePanel.addMouseListener(handler);
		mousePanel.addMouseMotionListener(handler);
	}
	
	
	private class MouseHandler implements MouseListener, MouseMotionListener{

		@Override
		public void mouseDragged(MouseEvent event) {

			barraDeStatus.setText(String.format("Arrastado em [%d, %d]", event.getX(), event.getY()));
			
		}

		@Override
		public void mouseMoved(MouseEvent event) {
			
			barraDeStatus.setText(String.format("Movido em [%d, %d]", event.getX(), event.getY()));
			
		}

		@Override
		public void mouseClicked(MouseEvent event) {
			
			barraDeStatus.setText(String.format("Clicou em [%d, %d]", event.getX(), event.getY()));
			
		}

		@Override
		public void mouseEntered(MouseEvent event) {

			barraDeStatus.setText(String.format("Mouse entrou em [%d][%d]", event.getX(), event.getY()));
			mousePanel.setBackground(Color.GREEN);
			
		}

		@Override
		public void mouseExited(MouseEvent event) {

			barraDeStatus.setText("Mouse fora da área.");
			mousePanel.setBackground(Color.WHITE);
			
		}

		@Override
		public void mousePressed(MouseEvent event) {

			barraDeStatus.setText(String.format("Pressionado em [%d][%d]", event.getX(), event.getY()));
			
		}

		@Override
		public void mouseReleased(MouseEvent event) {

			barraDeStatus.setText(String.format("Despressionado em [%d][%d]", event.getX(), event.getY()));
			
		}
		
		
		
	}

}
