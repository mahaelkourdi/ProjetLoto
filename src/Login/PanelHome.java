package Login;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;


import java.awt.Font;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;

public class PanelHome extends JPanel implements ActionListener{
	
	private JButton btnJouer ;
	private JPanel panelJouer;
	
	/**
	 * Create the panel.
	 */
	public PanelHome() {
		panelJouer = new PanelJouer();
		panelJouer.setBounds(0, 0, 700, 600);
		panelJouer.setVisible(false);
		
		
		
		setBounds(0,0,590,300);
		setLayout(null);
		
		btnJouer = new JButton("Cliquer sur jouer");
		btnJouer.setBounds(166, 104, 266, 29);
		
		add(btnJouer);
		add(panelJouer);
		btnJouer.addActionListener(this );
		
	
	
	}
	
		
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == btnJouer) {
			btnJouer.setVisible(false);
			panelJouer.setVisible(true);
			
		}
	
		
	}
	
	


}
