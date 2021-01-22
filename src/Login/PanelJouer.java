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
	private JTextField num1;
	private JTextField num2;
	private JTextField num3;
	private JTextField num4;
	private JTextField num5;
	private JTextField num6;
	private JLabel lblInstruction;
	private JLabel lblSlectionnerUnJour;
	private int Tab1[] = new int[6]; //Premier tableau d'entiers
	private JButton btnValider;
    ButtonGroup group ;


    private JRadioButton btnLun;
    private JRadioButton btnMer;
    private JRadioButton btnSam;
    
    private String value;


	/**
	 * Create the panel.
	 */
	public PanelJouer() {
		
		setBounds(0,0,590,300);
		setLayout(null);
		
		
		JPanel p1 = new JPanel();
		p1.setBounds(6, 51, 53, 31);
		add(p1);
		p1.setLayout(null);
		
		num1 = new JTextField();
		num1.setBounds(0, 0, 53, 31);
		p1.add(num1);
		num1.setColumns(10);
		
		JPanel p2 = new JPanel();
		p2.setBounds(79, 51, 53, 31);
		add(p2);
		p2.setLayout(null);
		
		num2 = new JTextField();
		num2.setColumns(10);
		num2.setBounds(0, 0, 53, 31);
		p2.add(num2);
		
		JPanel p3 = new JPanel();
		p3.setBounds(154, 51, 53, 31);
		add(p3);
		p3.setLayout(null);
		
		num3 = new JTextField();
		num3.setBounds(0, 0, 53, 31);
		p3.add(num3);
		num3.setColumns(10);
		
		JPanel p4 = new JPanel();
		p4.setBounds(221, 51, 53, 31);
		add(p4);
		p4.setLayout(null);
		
		num4 = new JTextField();
		num4.setColumns(10);
		num4.setBounds(0, 0, 53, 31);
		p4.add(num4);
		
		JPanel p5 = new JPanel();
		p5.setBounds(293, 51, 53, 31);
		add(p5);
		p5.setLayout(null);
		
		num5 = new JTextField();
		num5.setBounds(0, 0, 53, 31);
		p5.add(num5);
		num5.setColumns(10);
		
		JPanel p6 = new JPanel();
		p6.setBounds(517, 51, 53, 31);
		add(p6);
		p6.setLayout(null);
		
		num6 = new JTextField();
		num6.setBounds(0, 0, 53, 31);
		p6.add(num6);
		num6.setColumns(10);
		
		lblInstruction = new JLabel("Rentrer 5 numéros de 1 à 49 et 1 numéro gagnant de 1 à 10");
		lblInstruction.setBounds(6, 22, 432, 16);
		add(lblInstruction);
		
		lblSlectionnerUnJour = new JLabel("Sélectionner un jour");
		lblSlectionnerUnJour.setBounds(6, 102, 432, 16);
		add(lblSlectionnerUnJour);
		
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
							JOptionPane.showMessageDialog(null, "Rentrer les 5 numéros et le numéro gagnant",
							      "Hey!", JOptionPane.ERROR_MESSAGE);
							checkGrille = false;
							break;
						}
					}
					if(checkGrille) {
						// Envoyer vers la page stat avec les valeurs de notre grille
						System.out.println("Grille ok :)");
						System.out.println(value);

					} else {
						// Ne rien faire
						System.out.println("Grille non valide :)");
					}

					JOptionPane.showMessageDialog(null, "Grille ajoutée avec succès");
					
					
					
			
			
			}	
		});
		
		btnValider.setBounds(467, 246, 117, 29);
		add(btnValider);
		
		
		group = new ButtonGroup();
		btnLun = new JRadioButton("Lundi");
		btnLun.setBounds(24, 164, 78, 23);
		add(btnLun);
		
		btnMer = new JRadioButton("Mercredi");
		btnMer.setBounds(178, 164, 96, 23);
		add(btnMer);
		
		btnSam = new JRadioButton("Samedi");
		btnSam.setBounds(314, 164, 78, 23);
		add(btnSam);
		
	    btnLun.setActionCommand("Lundi");
	    btnSam.setActionCommand("Samedi");
	    btnMer.setActionCommand("Mercredi");

	    group.add(btnLun);
	    group.add(btnMer);
	    group.add(btnSam);
		
	    


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
		if(num6.getText().equals("") || Integer.valueOf(num1.getText()).intValue() < 1 || Integer.valueOf(num1.getText()).intValue() > 10) {
			Tab1[5] = 0;
		} else {
			Tab1[5] = Integer.valueOf(num6.getText()).intValue();
		}
		value = group.getSelection().getActionCommand();


	}

}