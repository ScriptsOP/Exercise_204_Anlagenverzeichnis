
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;


public class TableCellRenderer implements javax.swing.table.TableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Eintrag e = (Eintrag) value;
        JLabel label = new JLabel();
        label.setOpaque(true);
        
        switch(column) {
            case 0:
                label.setText(e.getBezeichnung());
                break;
            case 1:
                label.setText(e.getAk() + "");
                break;
            case 2:
                label.setText(e.getInbetriebnahme() + "");
                break;
            case 3:
                label.setText(e.getNd() + "");
                break;
            case 4:
                label.setText(e.getBishND() + "");
                break;
            case 5:
                label.setText(e.getBishAfa() + "");
                break;
            case 6:
                label.setText(e.getWertVorAfa() + "");
                break;
            case 7:
                label.setText(e.getAfaDj() + "");
                break;
            case 8:
                label.setText(e.getBw() + "");
                break;
        }
        
        return label;
    }
    
}
