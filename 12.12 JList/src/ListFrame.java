import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ListFrame extends JFrame{
	
	private final JList<String> coresJList;
	private static final String[] nomeCores = {"Preto", "Azul", "Ciano", "CInza Escuro", "Cinza", "Verde", "Cinza Claro", "Magenta", "Laranja", 
			"Rosa", "Vermelho", "Branco", "Amarelo"};
	private static final Color[] cores = {Color.BLACK, Color.BLUE, Color.CYAN, Color.DARK_GRAY, Color.GRAY, Color.GREEN, Color.LIGHT_GRAY, Color.MAGENTA,
			Color.ORANGE, Color.PINK, Color.RED, Color.WHITE, Color.YELLOW};
	
	
	public ListFrame() {
		
		super("Testando ListFrame");
		setLayout(new FlowLayout());
		
		coresJList = new JList<String>(nomeCores);
		coresJList.setVisibleRowCount(5);
		
		coresJList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		add(new JScrollPane(coresJList));
		
		coresJList.addListSelectionListener(
				new ListSelectionListener() {

					@Override
					public void valueChanged(ListSelectionEvent event) {
						
						getContentPane().setBackground(cores[coresJList.getSelectedIndex()]);
						
					}
					
					
					
				}
				);
		
		
	}
}
