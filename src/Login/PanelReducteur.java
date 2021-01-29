package Login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class PanelReducteur extends JPanel {


	private int Tab1[] = new int[12]; //Premier tableau d'entiers
	
	private JTextField num1;
	private JTextField num2;
	private JTextField num3;
	private JTextField num4;
	private JTextField num5;
	private JTextField num6;
	private JTextField num7;
	private JTextField num8;
	private JTextField num9;
	private JTextField num10;
	private JTextField num11;
	private JTextField num12;
	
	private ButtonGroup grpObjectif ;
	private ButtonGroup grpGarantie;

	private String objectif;
	private String garantie;

  



	/**
	 * Create the panel.
	 */
	public PanelReducteur() {
		setBounds(100,0,548,335);
		setLayout(null);
		
		JLabel lblInstruction = new JLabel("Saisir au moins 6 numéros compris entre 1 et 49:");
		lblInstruction.setBounds(17, 25, 329, 16);
		add(lblInstruction);
		
		num1 = new JTextField();
		num1.setBounds(17, 53, 51, 34);
		add(num1);
		num1.setColumns(10);
		
		num2 = new JTextField();
		num2.setColumns(10);
		num2.setBounds(80, 53, 51, 34);
		add(num2);
		
		num3 = new JTextField();
		num3.setColumns(10);
		num3.setBounds(142, 53, 51, 34);
		add(num3);
		
		num4 = new JTextField();
		num4.setColumns(10);
		num4.setBounds(210, 53, 51, 34);
		add(num4);
		
		num5 = new JTextField();
		num5.setColumns(10);
		num5.setBounds(274, 53, 51, 34);
		add(num5);
		
		num6 = new JTextField();
		num6.setColumns(10);
		num6.setBounds(343, 53, 51, 34);
		add(num6);
		
		num7 = new JTextField();
		num7.setColumns(10);
		num7.setBounds(17, 99, 51, 34);
		add(num7);
		
		num8 = new JTextField();
		num8.setColumns(10);
		num8.setBounds(79, 99, 51, 34);
		add(num8);
		
		num9 = new JTextField();
		num9.setColumns(10);
		num9.setBounds(142, 99, 51, 34);
		add(num9);
		
		num10 = new JTextField();
		num10.setColumns(10);
		num10.setBounds(210, 99, 51, 34);
		add(num10);
		
		num11 = new JTextField();
		num11.setColumns(10);
		num11.setBounds(274, 99, 51, 34);
		add(num11);
		
		num12 = new JTextField();
		num12.setColumns(10);
		num12.setBounds(343, 99, 51, 34);
		add(num12);
		
		// Garantie
		JLabel lblGarantie = new JLabel("Séléctionner la garantie  souhaitée:");
		lblGarantie.setBounds(17, 227, 290, 16);
		add(lblGarantie);
		
		JRadioButton btn80 = new JRadioButton("80%");
		btn80.setBounds(50, 256, 93, 23);
		add(btn80);
		
		JRadioButton btn100 = new JRadioButton("100%");
		btn100.setBounds(150, 256, 93, 23);
		add(btn100);
		
		
		 btn80.setActionCommand("80%");
		 btn100.setActionCommand("100%");
		 
		 grpGarantie = new ButtonGroup();
		 grpGarantie.add(btn80);
		 grpGarantie.add(btn100);

		
		// Objectifs 
		JLabel lblObjectif = new JLabel("Sélectionner l'objectif souhaité :");
		lblObjectif.setBounds(17, 145, 284, 16);
		add(lblObjectif);
		
		JRadioButton btn3 = new JRadioButton("3 ");
		btn3.setBounds(50, 173, 51, 23);
		add(btn3);
		
		JRadioButton btn4 = new JRadioButton("4");
		btn4.setBounds(150, 173, 51, 23);
		add(btn4);
		
		JRadioButton btn5 = new JRadioButton("5");
		btn5.setBounds(250, 173, 51, 23);
		add(btn5);
		
		grpObjectif = new ButtonGroup();
		grpObjectif.add(btn3);
		grpObjectif.add(btn4);
		grpObjectif.add(btn5);


		
		
		JButton btnValider = new JButton("Valider");
		btnValider.setBounds(425, 300, 117, 29);
		
		btnValider.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					boolean checkGrille = true;
					Valider();
					for(int i =0; i<7 ; i++) {
						System.out.println(Tab1[i]);
						checkGrille = true;
						if (Tab1[i]==0) {
							JOptionPane.showMessageDialog(null, "Saisir au moins 6 numéros",
							      "Hey!", JOptionPane.ERROR_MESSAGE);
							checkGrille = false;
							break;
						}
					}
					
					
					if(checkGrille) {
						// Envoyer vers la page stat avec les valeurs de notre grille
						System.out.println("Grille ok :)");
						JOptionPane.showMessageDialog(null, "Grille ajoutée avec succès");


					} else {
						// Ne rien faire
						System.out.println("Grille non valide :)");
					}

					
					
					
			
			
			}	
		});
		
		
		add(btnValider);
		
	}
	
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
		if(num6.getText().equals("") || Integer.valueOf(num6.getText()).intValue() < 1 || Integer.valueOf(num1.getText()).intValue() > 49) {
			Tab1[5] = 0;
		} else {
			Tab1[5] = Integer.valueOf(num6.getText()).intValue();
		}
		
		Tab1[6] = Integer.valueOf(num7.getText()).intValue();
		Tab1[7] = Integer.valueOf(num8.getText()).intValue();
		Tab1[8] = Integer.valueOf(num9.getText()).intValue();
		Tab1[9] = Integer.valueOf(num10.getText()).intValue();
		Tab1[10] = Integer.valueOf(num11.getText()).intValue();
		Tab1[11] = Integer.valueOf(num12.getText()).intValue();

		garantie = grpGarantie.getSelection().getActionCommand();
		objectif = grpObjectif.getSelection().getActionCommand();

	
	
		/*if(num8.getText().equals("") || Integer.valueOf(num8.getText()).intValue() < 1 || Integer.valueOf(num8.getText()).intValue() > 49) {
			Tab1[7] = 0;
		} else {
			Tab1[7] = Integer.valueOf(num8.getText()).intValue();
		}
		if(num9.getText().equals("") || Integer.valueOf(num9.getText()).intValue() < 1 || Integer.valueOf(num9.getText()).intValue() > 49) {
			Tab1[8] = 0;
		} else {
			Tab1[8] = Integer.valueOf(num9.getText()).intValue();
		}*/



	}
}


