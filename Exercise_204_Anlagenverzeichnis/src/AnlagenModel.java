
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class AnlagenModel extends AbstractTableModel {
    
    private static String[] colNames = {"Bezeichnung", "AK", "Inbetriebnahme", "ND", "bish. ND", "AfA bisher", "Wert vor AfA", "Afa d.J.", "BW 31.12"};
    private ArrayList<Eintrag> einträge = new ArrayList<>();
    
    public void add(Eintrag e) {
        einträge.add(e);
        fireTableRowsInserted(einträge.size() - 1, einträge.size() - 1);
    }
    
    public void remove(int i) {
        einträge.remove(i);
        fireTableRowsDeleted(einträge.size() - 1, einträge.size() - 1);
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
