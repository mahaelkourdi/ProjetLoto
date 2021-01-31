package Login;

import java.awt.Button;
import java.awt.Color;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;


public class PanelJouer extends JPanel {
    private final JLabel lblInstruction;
    private final JLabel lblSlectionnerUnJour;
    private final int[] tab1 = new int[6];
    private final JButton btnValider;
    private final ButtonGroup group;


    private final JRadioButton btnLun;
    private final JRadioButton btnMer;
    private final JRadioButton btnSam;

    private String value;
    private final JTextField num1;
    private final JTextField num2;
    private final JTextField num3;
    private final JTextField num4;
    private final JTextField num5;
    private final JTextField num6;


    /**
     * Create the panel.
     */
    public PanelJouer() {

        setBounds(100, 0, 590, 300);
        setLayout(null);

        // Champs pour saisir les numéros
        num1 = new JTextField();
        num1.setColumns(10);
        num1.setBounds(34, 48, 53, 31);
        add(num1);

        num2 = new JTextField();
        num2.setColumns(10);
        num2.setBounds(108, 48, 53, 31);
        add(num2);

        num3 = new JTextField();
        num3.setColumns(10);
        num3.setBounds(178, 48, 53, 31);
        add(num3);

        num4 = new JTextField();
        num4.setColumns(10);
        num4.setBounds(250, 48, 53, 31);
        add(num4);

        num5 = new JTextField();
        num5.setColumns(10);
        num5.setBounds(326, 48, 53, 31);
        add(num5);

        num6 = new JTextField();
        num6.setColumns(10);
        num6.setBounds(34, 134, 53, 31);
        add(num6);


        lblInstruction = new JLabel("Saisir 5 numéros de 1 à 49 :");
        lblInstruction.setBounds(24, 20, 432, 16);
        add(lblInstruction);

        lblSlectionnerUnJour = new JLabel("Sélectionner un jour");
        lblSlectionnerUnJour.setBounds(24, 178, 432, 16);
        add(lblSlectionnerUnJour);


        // Boutons pour sélectionner les jours
        group = new ButtonGroup();
        btnLun = new JRadioButton("Lundi");
        btnLun.setBounds(24, 196, 78, 23);
        add(btnLun);

        btnMer = new JRadioButton("Mercredi");
        btnMer.setBounds(178, 196, 96, 23);
        add(btnMer);

        btnSam = new JRadioButton("Samedi");
        btnSam.setBounds(314, 196, 78, 23);
        add(btnSam);

        btnLun.setActionCommand("Lundi");
        btnSam.setActionCommand("Samedi");
        btnMer.setActionCommand("Mercredi");

        group.add(btnLun);
        group.add(btnMer);
        group.add(btnSam);

        JLabel lblNumDeChance = new JLabel("Saisir le numéro de chance entre 1 et 10 : ");
        lblNumDeChance.setBounds(24, 106, 268, 16);
        add(lblNumDeChance);


        btnValider = new JButton("Valider");
        btnValider.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int i = 0;
                boolean checkGrille = true;
                Valider();
                for (i = 0; i < 5; i++) {
                    System.out.println(tab1[i]);
                    checkGrille = true;
                    if (tab1[i] == 0) {
                        JOptionPane.showMessageDialog(null, "Rentrer les 5 numéros",
                                "Hey!", JOptionPane.ERROR_MESSAGE);
                        checkGrille = false;
                        break;
                    }
                }
                if (tab1[5] == 0) {
                    JOptionPane.showMessageDialog(null, "Rentrer le numéro chance",
                            "Hey!", JOptionPane.ERROR_MESSAGE);
                    checkGrille = false;
                }
                if (value == "error") {
                    JOptionPane.showMessageDialog(null, "Veuillez choisir un jour",
                            "Hey!", JOptionPane.ERROR_MESSAGE);
                    checkGrille = false;
                }


                if (checkGrille) {
                    // Envoyer vers la page stat avec les valeurs de notre grille
                    System.out.println("Grille ok :)");
                    System.out.println(value);
                    JOptionPane.showMessageDialog(null, "Grille ajoutée avec succès");


                } else {
                    // Ne rien faire
                    System.out.println("Grille non valide :)");
                }


            }
        });

        btnValider.setBounds(467, 246, 117, 29);
        add(btnValider);


    }

// Valider la grille jouée

    private boolean StringOrNot(String s) {
        boolean x = false;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '0' || s.charAt(i) == '1' || s.charAt(i) == '2' || s.charAt(i) == '3' || s.charAt(i) == '4' || s.charAt(i) == '5' || s.charAt(i) == '6' || s.charAt(i) == '7' || s.charAt(i) == '8' || s.charAt(i) == '9') {

            } else x = true;
        }
        return x;
    }

    public void Valider() {
        //On stockes les valeurs entr�es dans le tableau

        if (StringOrNot(num1.getText()) || num1.getText().equals("") || Integer.valueOf(num1.getText()).intValue() < 1 || Integer.valueOf(num1.getText()).intValue() > 49) {
            tab1[0] = 0;
        } else {
            tab1[0] = Integer.valueOf(num1.getText()).intValue();
        }
        if (StringOrNot(num2.getText()) || num2.getText().equals("") || Integer.valueOf(num2.getText()).intValue() < 1 || Integer.valueOf(num2.getText()).intValue() > 49) {
            tab1[1] = 0;
        } else {
            tab1[1] = Integer.valueOf(num2.getText()).intValue();
        }
        if (StringOrNot(num3.getText()) || num3.getText().equals("") || Integer.valueOf(num3.getText()).intValue() < 1 || Integer.valueOf(num3.getText()).intValue() > 49) {
            tab1[2] = 0;
        } else {
            tab1[2] = Integer.valueOf(num3.getText()).intValue();
        }
        if (StringOrNot(num4.getText()) || num4.getText().equals("") || Integer.valueOf(num4.getText()).intValue() < 1 || Integer.valueOf(num4.getText()).intValue() > 49) {
            tab1[3] = 0;
        } else {
            tab1[3] = Integer.valueOf(num4.getText()).intValue();
        }
        if (StringOrNot(num5.getText()) || num5.getText().equals("") || Integer.valueOf(num5.getText()).intValue() < 1 || Integer.valueOf(num5.getText()).intValue() > 49) {
            tab1[4] = 0;
        } else {
            tab1[4] = Integer.valueOf(num5.getText()).intValue();
        }
        if (StringOrNot(num6.getText()) || num6.getText().equals("") || Integer.valueOf(num6.getText()).intValue() < 1 || Integer.valueOf(num6.getText()).intValue() > 10) {
            tab1[5] = 0;
        } else {
            tab1[5] = Integer.valueOf(num6.getText()).intValue();
        }
        if (group.getSelection() == null) {
            value = "error";
        } else  {
            value = group.getSelection().getActionCommand();
        }
    }
}