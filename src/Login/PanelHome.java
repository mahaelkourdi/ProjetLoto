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

public class PanelHome extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelHome() {
		setBounds(0,0,500,300);
		setLayout(null);
		
		JButton btnJouer = new JButton("Cliquer sur jouer");
		btnJouer.setBounds(6, 24, 233, 23);
		add(btnJouer);
		
		JButton btnSmartLoto = new JButton("Smart-Loto");
		btnSmartLoto.setForeground(new Color(168, 193, 197));
		btnSmartLoto.setFont(new Font("SignPainter", Font.BOLD, 33));
		btnSmartLoto.setBounds(32, 73, 429, 207);
		add(btnSmartLoto);
		

	}

}
