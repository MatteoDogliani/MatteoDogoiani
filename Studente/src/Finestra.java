
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class Finestra extends JFrame implements ActionListener {
	private JTable table;
	private DefaultTableModel dmt;
	private JScrollPane pane;
	private JMenuBar bar;
	private JMenu menu;
	private JMenuItem inserisci, salva, carica;
	//private Array a;
	private ImageIcon icon;
	private JLabel jl;
	private JPanel jp;
	
	public void initComp() {
	/*	Object[][] data = {};
		String[] nomeColonne={"Nome", "Cognome", "Classe"};
		dmt = new DefaultTableModel(data, nomeColonne);
		table = new JTable(dmt);
		pane = new JScrollPane(table);
		
		bar = new JMenuBar();
		menu = new JMenu("File");
		inserisci = new JMenuItem("Inserisci");
		salva = new JMenuItem("Salva");
		carica = new JMenuItem("Carica");
		icon= new ImageIcon("C:\\Users\\matteo\\Pictures\\Saved Pictures\\albero.jgp");
		jl= new JLabel(icon);
		jp= new JPanel(new FlowLayout());
		jp.add(jl);

		
		
		menu.add(carica);
		menu.add(salva);
		menu.add(inserisci);
		bar.add(menu);
		
		this.add(bar);
		this.add(pane);
	}*/
		icon= new ImageIcon("C:\\Users\\matteo\\Desktop\\compiti info\\corso pomeridiano Java\\albero.jpg");
		jl= new JLabel();
		jl.setIcon(icon);
		jp= new JPanel(new FlowLayout());
		jp.add(jl);
	}
	
	public Finestra() {
		initComp();
		//a = new Array();
	}

	public static void main(String[] args) {
		Finestra f = new Finestra();
		f.setTitle("Esercizio di recupero");
		f.setSize(400,600);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		
		
	}
	
}