import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ComboBoxFrame extends JFrame{
	
	private final JComboBox<String> imagesJComboBox;
	private final JLabel label;
	
	private static final String[] clubs = {"1.png", "2.png", "3.png", "4.png"};
	private final Icon[] icones = {
		new ImageIcon(getClass().getResource(clubs[0])),
		new ImageIcon(getClass().getResource(clubs[1])),
		new ImageIcon(getClass().getResource(clubs[2])),
		new ImageIcon(getClass().getResource(clubs[3]))
	};
	
	public ComboBoxFrame() {
		
		super("Testando JComboBox");
		setLayout(new FlowLayout());
		
		imagesJComboBox = new JComboBox<String>(clubs);
		imagesJComboBox.setMaximumRowCount(3);
		
		imagesJComboBox.addItemListener(
				
				new ItemListener() {

					@Override
					public void itemStateChanged(ItemEvent event) {
						
						if(event.getStateChange() == ItemEvent.SELECTED){
							
							label.setIcon(icones[imagesJComboBox.getSelectedIndex()]);
								
						}
						
					}
					
				}
				
				);
		
		add(imagesJComboBox);
		label = new JLabel(icones[0]);
		add(label);
		
	}

}
