import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TextAreaFrame extends JFrame {

	private final JTextArea text1;
	private final JTextArea text2;
	private final JButton copiaJButton;
	
	
	public TextAreaFrame() {
		
		super("TextArea Demo");
		Box caixa = Box.createHorizontalBox();
		String demo = "Esse é um texto de demonstração para ilustrar a cópia de textos de uma textarea para outra usando evento externo.";
		
		text1 = new JTextArea(demo, 10, 15);
		text1.setLineWrap(true);
		caixa.add(new JScrollPane(text1));
		
		copiaJButton = new JButton("Copia >>>");
		caixa.add(copiaJButton);
		copiaJButton.addActionListener(
				
				new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent event) {
						
						text2.setText(text1.getSelectedText());
						
					}
					
					
					
				}
				
				);
		
		text2 = new JTextArea(10, 15);
		text2.setEditable(false);
		text2.setLineWrap(true);
		caixa.add(new JScrollPane(text2));
		
		add(caixa);
	}
	
}
