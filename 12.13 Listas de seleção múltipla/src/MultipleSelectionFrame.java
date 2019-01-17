import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class MultipleSelectionFrame extends JFrame{
	
	private final JList<String> coresJList;
	private final JList<String> copiaCoresJList;
	private JButton copiaJButton;
	private static final String[] nomeCores = {"Preto", "Azul", "Ciano", "CInza Escuro", "Cinza", "Verde", "Cinza Claro", "Magenta", "Laranja", 
			"Rosa", "Vermelho", "Branco", "Amarelo"};
	
	public MultipleSelectionFrame() {
		
		super("Testando MultipleSelectionFrame");
		setLayout(new FlowLayout());
		
		coresJList = new JList<String>(nomeCores);
		coresJList.setVisibleRowCount(5);
		coresJList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		add(new JScrollPane(coresJList));
		
		copiaJButton = new JButton("Cópia >>>");
		copiaJButton.addActionListener(
				
				new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent event) {
						
						copiaCoresJList.setListData(coresJList.getSelectedValuesList().toArray(new String[0]));
						
					}
					
					
					
				}
				
				);
		
		add(copiaJButton);
		
		copiaCoresJList = new JList<String>();
		copiaCoresJList.setVisibleRowCount(5);
		copiaCoresJList.setFixedCellWidth(100);
		copiaCoresJList.setFixedCellHeight(15);
		copiaCoresJList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		
		add(new JScrollPane(copiaCoresJList));
		
	}
	
}
