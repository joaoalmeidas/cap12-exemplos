import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;

import javax.swing.JPanel;

public class PaintPanel extends JPanel{
	
	private final ArrayList<Point> pontos = new ArrayList<>();
	
	public PaintPanel() {
		
		addMouseMotionListener(
				
				new MouseMotionAdapter() {

					@Override
					public void mouseDragged(MouseEvent event) {
						
						pontos.add(event.getPoint());
						repaint();
					}
					
					
					
				}
				
				);
		
	}
	
	@Override
	public void paintComponent(Graphics g) {
		
		super.paintComponents(g);
		
		for(Point ponto: pontos) {
			
			g.fillOval(ponto.x, ponto.y, 4, 4);
			
		}
		
	}
	
}
