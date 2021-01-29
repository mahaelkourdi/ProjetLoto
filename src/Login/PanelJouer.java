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


public class PanelJouer extends JPanel  {
	private JLabel lblInstruction;
	private JLabel lblSlectionnerUnJour;
	private int Tab1[] = new int[6]; //Premier tableau d'entiers
	private JButton btnValider;
	private ButtonGroup group ;


    private JRadioButton btnLun;
    private JRadioButton btnMer;
    private JRadioButton btnSam;
    
    private String value;
    private JTextField num1;
    private JTextField num2;
    private JTextField num3;
    private JTextField num4;
    private JTextField num5;
    private JTextField num6;


	/**
	 * Create the panel.
	 */
	public PanelJouer() {
		
		setBounds(100,0,590,300);
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
	    
	    JLabel lblNumDeChance = new JLabel("Rentrer le numéro de chance : ");
	    lblNumDeChance.setBounds(24, 106, 268, 16);
	    add(lblNumDeChance);
	   
		
		btnValider = new JButton("Valider");
		btnValider.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					int i = 0;
					boolean checkGrille = true;
					Valider();
					for(i =0; i<6 ; i++) {
						System.out.println(Tab1[i]);
						checkGrille = true;
						if (Tab1[i]==0) {
							JOptionPane.showMessageDialog(null, "Rentrer les 5 numéros et le numéro de chance",
							      "Hey!", JOptionPane.ERROR_MESSAGE);
							checkGrille = false;
							break;
						}
					}
					
					
					if(checkGrille) {
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
	
	public void Valider()
	{
        	//On stockes les valeurs entr�es dans le premier tableau
		if(num1.getText().equals("") || Integer.valueOf(num1.getText()).intValue() < 1 || Integer.valueOf(num1.getText()).intValue() > 49) {
			Tab1[0] = 0;
		} else {
			Tab1[0] = Integer.valueOf(num1.getText()).intValue();
		}
		if(num2.getText().equals("") || Integer.valueOf(num2.getText()).intValue() < 1 || Integer.valueOf(num2.getText()).intValue() > 49) {
			Tab1[1] = 0;
		} else {
			Tab1[1] = Integer.valueOf(num2.getText()).intValue();
		}
		if(num3.getText().equals("") || Integer.valueOf(num3.getText()).intValue() < 1 || Integer.valueOf(num3.getText()).intValue() > 49) {
			Tab1[2] = 0;
		} else {
			Tab1[2] = Integer.valueOf(num3.getText()).intValue();
		}
		if(num4.getText().equals("") || Integer.valueOf(num4.getText()).intValue() < 1 || Integer.valueOf(num4.getText()).intValue() > 49) {
			Tab1[3] = 0;
		} else {
			Tab1[3] = Integer.valueOf(num4.getText()).intValue();
		}
		if(num5.getText().equals("") || Integer.valueOf(num5.getText()).intValue() < 1 || Integer.valueOf(num5.getText()).intValue() > 49) {
			Tab1[4] = 0;
		} else {
			Tab1[4] = Integer.valueOf(num5.getText()).intValue();
		}
		if(num6.getText().equals("") || Integer.valueOf(num6.getText()).intValue() < 1 || Integer.valueOf(num1.getText()).intValue() > 10) {
			Tab1[5] = 0;
		} else {
			Tab1[5] = Integer.valueOf(num6.getText()).intValue();
		}
		value = group.getSelection().getActionCommand();

	}
}