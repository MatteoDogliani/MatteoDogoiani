
/*import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class Array extends ArrayList <Studente>{
	public Array() {
		super ();
	}
	public String createCsv() {
		String csv= "";
		for(int i =0; i<this.size(); i++) { 
			csv+= this.get(i).getNome() + ";" + this.get(i).getCognome() + ";" + this.get(i).getClasse() + "\n";
		}
		return csv;
	}
	public void creaFile (JFrame finestra) throws IOException {
		JFileChooser ciuser= new JFileChooser();
		ciuser.setFileFilter( new FileF() );
		int n = ciuser.showSaveDialog( finestra );
		if ( n==JFileChooser.APPROVE_OPTION ) {
			File f= ciuser.getSelectedFile();
			FileWriter fw= new FileWriter(f);
			fw.write(this.createCsv());
			fw.flush();
			fw.close();
		}
	}
}