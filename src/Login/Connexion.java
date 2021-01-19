package Login;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JTextField;
import java.awt.Component;
import java.awt.Rectangle;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

import javax.swing.SwingConstants;

public class Connexion extends JFrame {

	private JPanel contentPaneAccueil;
	private JTextField txtUsername;
	private JPasswordField txtPassword;
	private JPanel panelInscrire;
	private JButton buttonClose;
	private JTextPane txtSmartLoto;
	private JPanel panelSeConnecter;
	private JLabel lblSeConnecter;
	private JLabel lblIcon;
	
		

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Connexion frame = new Connexion();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		
		});
	}

	/**
	 * Create the frame.
	 */
	public Connexion() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		setLocationRelativeTo(null);
		contentPaneAccueil = new JPanel();
		contentPaneAccueil.setBackground(new Color(238, 238, 238));
		contentPaneAccueil.setBorder(new EmptyBorder(1, 1, 1, 1));
		setContentPane(contentPaneAccueil);
		contentPaneAccueil.setLayout(null);
		

		JPanel PanelHeader = new JPanel();
		PanelHeader.setBorder(new EmptyBorder(1, 1, 1, 1));
		PanelHeader.setBackground(new Color(220, 220, 220));
		PanelHeader.setBounds(0, 0, 600, 20);
		contentPaneAccueil.add(PanelHeader);
		PanelHeader.setLayout(null);
		
		buttonClose = new JButton("X");
		buttonClose.setBounds(582, 6, 18, 16);
		PanelHeader.add(buttonClose);
		buttonClose.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Etes vous sûrs de vouloir fermer l'application?", "Confirmation", JOptionPane.YES_NO_OPTION)==0);
				Connexion.this.dispose();
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				buttonClose.setForeground(Color.RED);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				buttonClose.setForeground(Color.WHITE);
			}
			
		});
		
		JPanel panel = new JPanel();
		panel.setBorder(new EmptyBorder(2, 2, 2, 2));
		panel.setBackground(SystemColor.controlLtHighlight);
		panel.setBounds(74, 192, 455, 40);
		contentPaneAccueil.add(panel);
		panel.setLayout(null);
		
		txtPassword = new JPasswordField();
		txtPassword.setBorder(null);
		txtPassword.setBounds(6, 6, 392, 26);
		panel.add(txtPassword);
		txtPassword.setText("Password");
		
		JPanel panel_1 = new JPanel();
		panel_1.setFont(new Font("PT Sans", Font.PLAIN, 13));
		panel_1.setBorder(new EmptyBorder(2, 2, 2, 2));
		panel_1.setBackground(SystemColor.controlLtHighlight);
		panel_1.setBounds(74, 121, 455, 40);
		contentPaneAccueil.add(panel_1);
		panel_1.setLayout(null);
		
		txtUsername = new JTextField();
		txtUsername.setBorder(null);
		txtUsername.setBounds(6, 6, 392, 26);
		panel_1.add(txtUsername);
		txtUsername.setText("Username");
		txtUsername.setColumns(10);
		
		panelInscrire = new JPanel();
		panelInscrire.setBackground(new Color(220, 172, 70 ));
		panelInscrire.setBorder(new EmptyBorder(2, 2, 2, 2));
		panelInscrire.setLayout(null);
		panelInscrire.setBounds(158, 264, 112, 29);
		contentPaneAccueil.add(panelInscrire);
		
		JLabel txtInscrire = new JLabel("S'inscrire");
		txtInscrire.setBounds(54, 6, 52, 16);
		panelInscrire.add(txtInscrire);
		txtInscrire.setFont(new Font("PT Sans", Font.PLAIN, 11));
		
		txtSmartLoto = new JTextPane();
		txtSmartLoto.setForeground(new Color(168, 193, 197));
		txtSmartLoto.setBackground(new Color(238, 238, 238));
		txtSmartLoto.setFont(new Font("SignPainter", Font.PLAIN, 32));
		txtSmartLoto.setText("Smart - Loto");
		txtSmartLoto.setBounds(237, 63, 150, 29);
		contentPaneAccueil.add(txtSmartLoto);
		
		panelSeConnecter = new JPanel();
		panelSeConnecter.setBackground(new Color(168, 193, 197));
		panelSeConnecter.setBorder(new EmptyBorder(2, 2, 2, 2));
		panelSeConnecter.setLayout(null);
		panelSeConnecter.setBounds(328, 264, 112, 29);
		contentPaneAccueil.add(panelSeConnecter);
		
		lblSeConnecter = new JLabel("Se connecter");
		lblSeConnecter.setFont(new Font("PT Sans", Font.PLAIN, 11));
		lblSeConnecter.setBounds(43, 6, 63, 16);
		panelSeConnecter.add(lblSeConnecter);
		
	
	
		
	}
}
