
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class AnlagenModel extends AbstractTableModel {
    
    private static String[] colNames = {"Bezeichnung", "AK", "Inbetriebnahme", "ND", "bish. ND", "AfA bisher", "Wert vor AfA", "Afa d.J.", "BW 31.12"};
    private ArrayList<Eintrag> einträge = new ArrayList<>();
    private File f = new File("src\\anlagenverzeichnis.csv");
    
    public void add(Eintrag e) {
        einträge.add(e);
        fireTableRowsInserted(einträge.size() - 1, einträge.size() - 1);
    }
    
    public void remove(int i) {
        einträge.remove(i);
        fireTableRowsDeleted(einträge.size() - 1, einträge.size() - 1);
    }
    
    public void load(File f) throws FileNotFoundException, IOException {
        BufferedReader br = new BufferedReader(new FileReader(f));
        
        String line;
        
        while((line=br.readLine())!=null) {
            String[] split = line.split(";");
            this.add(new Eintrag(split[0], Double.parseDouble(split[1]), Double.parseDouble(split[2]), Double.parseDouble(split[3]), Double.parseDouble(split[4]), Double.parseDouble(split[5]), Double.parseDouble(split[6]), Double.parseDouble(split[7]), Double.parseDouble(split[8])));
        }
    }
    
    @Override
    public int getRowCount() {
        return einträge.size();
    }

    @Override
    public int getColumnCount() {
        return colNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Eintrag e = einträge.get(rowIndex);
        
        return e;
    }
    
}
