package fonction;

import java.awt.Color;

import javax.swing.table.AbstractTableModel;

public class ModeleStatique extends AbstractTableModel {
    private final Object[][] donnees;
 
    private final String[] entetes = {"Num", "Réussite Totale","Sorties récentes","Ecart Max", "Ecart Actuel", "+Affinité","-Affinité"};
 
    public ModeleStatique() {
        super();
 
        donnees = new Object[][]{
                {"1", "Sykes", "Test 1","Test 1","Test 1","Test 1","Test 1"},
                {"2", "Van de Kampf","Test 1", "Test 1","Test 1","Test 1","Test 1"},
          
        };
    }
 
    public int getRowCount() {
        return donnees.length;
    }
 
    public int getColumnCount() {
        return entetes.length;
    }
 
    public String getColumnName(int columnIndex) {
        return entetes[columnIndex];
    }
 
    public Object getValueAt(int rowIndex, int columnIndex) {
        return donnees[rowIndex][columnIndex];
    }
}