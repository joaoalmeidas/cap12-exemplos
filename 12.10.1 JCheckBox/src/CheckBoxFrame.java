import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class CheckBoxFrame extends JFrame {
	
	private final JTextField textfield;
	private final JCheckBox bold;
	private final JCheckBox italic;

	
	public CheckBoxFrame() {
		
		super("Testando CheckBox");
		setLayout(new FlowLayout());
		
		textfield = new JTextField("Observe a mudança de estilo da fonte.");
		textfield.setFont(new Font("Serif", Font.PLAIN, 14));
		add(textfield);
		
		bold = new JCheckBox("Negrito");
		italic = new JCheckBox("Itálico");
		add(bold);
		add(italic);
		
		CheckBoxHandler handler = new CheckBoxHandler();
		bold.addItemListener(handler);
		italic.addItemListener(handler);
		
	}
	
	private class CheckBoxHandler implements ItemListener{
		
		
		
		@Override
		public void itemStateChanged(ItemEvent arg0) {
			
			Font fonte = null;
			
			if(bold.isSelected() && italic.isSelected()) {
				
				fonte = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
				
			}else if(italic.isSelected()) {
				
				fonte = new Font("Serif", Font.ITALIC, 14);
				
			}else if(bold.isSelected()) {
				
				fonte = new Font("Serif", Font.BOLD, 14);
				
			}
			
			textfield.setFont(fonte);
			
		}
		
		
		
	}
}
