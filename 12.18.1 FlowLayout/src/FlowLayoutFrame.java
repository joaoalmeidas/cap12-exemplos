import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutFrame extends JFrame {
	
	private final JButton jbuttonEsquerda;
	private final JButton jbuttonCentro;
	private final JButton jbuttonDireita;
	private final FlowLayout layout;
	private final Container container;
	
	
	public FlowLayoutFrame() {
		
		super("FlowLayoutDemo");
		
		layout = new FlowLayout();
		container = getContentPane();
		setLayout(layout);
		
		jbuttonEsquerda = new JButton("Esquerda");
		add(jbuttonEsquerda);
		jbuttonEsquerda.addActionListener(
				
				new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent event) {
						
						layout.setAlignment(FlowLayout.LEFT);
						
						layout.layoutContainer(container);
						
					}
					
					
					
				}
				
				);
		
		
		jbuttonCentro = new JButton("Centro");
		add(jbuttonCentro);
		jbuttonCentro.addActionListener(
				
				new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent event) {
						
						layout.setAlignment(FlowLayout.CENTER);
						
						layout.layoutContainer(container);
						
					}
					
					
					
				}
				
				);
		
		jbuttonDireita = new JButton("Direita");
		add(jbuttonDireita);
		jbuttonDireita.addActionListener(
				
				new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent event) {
						
						layout.setAlignment(FlowLayout.RIGHT);
						
						layout.layoutContainer(container);
						
					}
					
					
					
				}
				
				);
		
	}
}
