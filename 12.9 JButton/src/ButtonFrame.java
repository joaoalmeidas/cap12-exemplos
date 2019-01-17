import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ButtonFrame extends JFrame{
	
	private final JButton jbuttonSimples;
	private final JButton jbuttonIcone;
	
	public ButtonFrame() {
		
		super("Testando Buttons");
		setLayout(new FlowLayout());
		
		jbuttonSimples = new JButton("Botão Simples");
		add(jbuttonSimples);
		
		Icon bug1 = new ImageIcon(getClass().getResource("pacman-128.png"));
		Icon bug2 = new ImageIcon(getClass().getResource("get_info.png"));
		jbuttonIcone = new JButton("Botão com Icone", bug1);
		jbuttonIcone.setRolloverIcon(bug2);
		add(jbuttonIcone);
		
		ButtonHandler handler = new ButtonHandler();
		jbuttonIcone.addActionListener(handler);
		jbuttonSimples.addActionListener(handler);
		
	}
	
	private class ButtonHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent event) {
			
			JOptionPane.showMessageDialog(ButtonFrame.this, String.format("Você pressionou: %s", event.getActionCommand()));
			
		}
		
		
		
	}
	
}
