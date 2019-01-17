import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class RadioButtonFrame extends JFrame{

	private final JTextField textfield;
	private final Font fonteNormal;
	private final Font fonteNegrito;
	private final Font fonteItalico;
	private final Font fonteNegritoItalico;
	private final JRadioButton jradioNormal;
	private final JRadioButton jradioNegrito;
	private final JRadioButton jradioItalico;
	private final JRadioButton jradioNegritoItalico;
	private final ButtonGroup grupoRadio;
	
	public RadioButtonFrame() {
		
		super("Testando RadioButton");
		setLayout(new FlowLayout());
		
		textfield = new JTextField("Observe as mudanças da fonte", 25);
		add(textfield);
		
		jradioNormal = new JRadioButton("Normal", true);
		jradioNegrito = new JRadioButton("Negrito", false);
		jradioItalico = new JRadioButton("Itálico", false);
		jradioNegritoItalico = new JRadioButton("Negrito/Itálico", false);
		
		add(jradioNormal);
		add(jradioNegrito);
		add(jradioItalico);
		add(jradioNegritoItalico);
		
		grupoRadio = new ButtonGroup();
		grupoRadio.add(jradioNormal);
		grupoRadio.add(jradioNegrito);
		grupoRadio.add(jradioItalico);
		grupoRadio.add(jradioNegritoItalico);
		
		fonteNormal = new Font("Serif", Font.PLAIN, 14);
		fonteNegrito = new Font("Serif", Font.BOLD, 14);
		fonteItalico = new Font("Serif", Font.ITALIC, 14);
		fonteNegritoItalico = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
		
		jradioNormal.addItemListener(new RadioButtonHandler(fonteNormal));
		jradioNegrito.addItemListener(new RadioButtonHandler(fonteNegrito));
		jradioItalico.addItemListener(new RadioButtonHandler(fonteItalico));
		jradioNegritoItalico.addItemListener(new RadioButtonHandler(fonteNegritoItalico));
		
	}
	
	private class RadioButtonHandler implements ItemListener{
		
		private Font fonte;
		
		public RadioButtonHandler(Font fonte) {
			super();
			this.fonte = fonte;
		}

		@Override
		public void itemStateChanged(ItemEvent event) {
			
			textfield.setFont(fonte);
			
		}
		
		
		
	}
}
