import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class KeyDemoFrame extends JFrame implements KeyListener{
	
	
	private static String linha1 = "";
	private static String linha2 = "";
	private static String linha3 = "";
	private  JTextArea textArea;
	
	public KeyDemoFrame() {
		
		super("Demonstrando eventos de teclas.");
		
		textArea = new JTextArea(10, 15);
		textArea.setText("Pressiona qualquer tecla.");
		textArea.setEnabled(false);
		textArea.setDisabledTextColor(Color.BLACK);
		add(textArea);
		
		addKeyListener(this);
		
	}

	@Override
	public void keyPressed(KeyEvent event) {
		
		linha1 = String.format("Tecla Pressionada: %s", KeyEvent.getKeyText(event.getKeyCode()));
		setLinhas2eLinhas3(event);
		
	}

	@Override
	public void keyReleased(KeyEvent event) {
		
		linha1 = String.format("Tecla Despressionada: %s", KeyEvent.getKeyText(event.getKeyCode()));
		setLinhas2eLinhas3(event);
		
	}

	@Override
	public void keyTyped(KeyEvent event) {
		
		linha1 = String.format("Tecla Digitada: %s", event.getKeyChar());
		setLinhas2eLinhas3(event);
		
	}
	
	
	private void setLinhas2eLinhas3(KeyEvent event) {
		
		linha2 = String.format("Essa tecla %sé uma tecla de ação.", (event.isActionKey() ? "" : "não "));
		
		String temp = KeyEvent.getKeyModifiersText(event.getModifiers());
		
		linha3 = String.format("Tecla modificadora: %s", (temp.equals("") ? "nenhuma": temp));
		
		textArea.setText(String.format("%s%n%s%n%s%n", linha1, linha2, linha3));
		
	}
	
	
}
