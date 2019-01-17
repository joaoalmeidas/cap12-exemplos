import java.awt.FlowLayout;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class LabelFrame extends JFrame {
	
	private final JLabel label1;
	private final JLabel label2;
	private final JLabel label3;
	
	
	public LabelFrame(){
		
		super("Testando JLabel");
		setLayout(new FlowLayout());
		
		label1 = new JLabel("Label com texto.");
		label1.setToolTipText("Esse é o label1.");
		add(label1);
		
		Icon bug = new ImageIcon(getClass().getResource("681.gif"));
		label2 = new JLabel("Label com texto e icone", bug, SwingConstants.LEFT);
		label2.setToolTipText("Esse é o label2.");
		add(label2);
		
		label3 = new JLabel();
		label3.setText("Label com icone e texto no rodapé;");
		label3.setIcon(bug);
		label3.setHorizontalTextPosition(SwingConstants.CENTER);
		label3.setVerticalTextPosition(SwingConstants.BOTTOM);
		label3.setToolTipText("Esse é o label3.");
		add(label3);
		
	}
	
	
	
}
