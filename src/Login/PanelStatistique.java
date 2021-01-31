package Login;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import fonction.ModeleStatique;

import javax.swing.border.BevelBorder;
import javax.swing.table.TableColumn;

import java.awt.Color;
import java.awt.Component;
import javax.swing.border.MatteBorder;

public class PanelStatistique extends JPanel {
    private JTable table;

    /**
     * Create the panel.
     */
    public PanelStatistique() {
        setSize(700, 500);
        setLayout(null);


        // Création du tableau de statistiques
        JTable tableau = new JTable(new ModeleStatique());
        tableau.setMaximumSize(getMaximumSize());

        // Redimensionner les colonnes

        TableColumn column = null;
        for (int i = 0; i < 6; i++) {
            column = tableau.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(25);
            } else {
                column.setPreferredWidth(100);
            }

        }


        JScrollPane scrollPane = new JScrollPane(tableau);
        scrollPane.setBorder(new MatteBorder(1, 1, 1, 1, Color.BLACK));
        scrollPane.setBounds(6, 6, 679, 474);
        add(scrollPane, BorderLayout.CENTER);
        tableau.setVisible(true);


    }


}
