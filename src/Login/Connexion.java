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
import java.awt.event.MouseMotionAdapter;
import java.awt.image.BufferedImage;

import javax.swing.SwingConstants;

public class Connexion extends JFrame {

    private final JPanel panelConnexion;
    private final JTextField txtUsername;
    private final JPasswordField txtPassword;
    private final JButton btnClose;
    private final JTextPane txtSmartLoto;
    private JLabel lblIcon;
    private final JButton btnInscrire;
    private final JButton btnSeConnecter;
    private int posX = 0;   //Position X de la souris au clic
    private int posY = 0;   //Position Y de la souris au clic


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
        panelConnexion = new JPanel();
        panelConnexion.setBackground(new Color(238, 238, 238));
        panelConnexion.setBorder(new EmptyBorder(1, 1, 1, 1));
        setContentPane(panelConnexion);
        panelConnexion.setLayout(null);


        JPanel PanelHeader = new JPanel();
        PanelHeader.setBorder(new EmptyBorder(1, 1, 1, 1));
        PanelHeader.setBackground(new Color(220, 220, 220));
        PanelHeader.setBounds(0, 0, 600, 20);
        panelConnexion.add(PanelHeader);
        PanelHeader.setLayout(null);

        btnClose = new JButton("X");
        btnClose.setBounds(582, 0, 18, 16);
        PanelHeader.add(btnClose);
        btnClose.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (JOptionPane.showConfirmDialog(null, "Etes vous sûrs de vouloir fermer l'application?", "Confirmation", JOptionPane.YES_NO_OPTION) == 0) {

                    Connexion.this.dispose();
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                btnClose.setForeground(Color.RED);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnClose.setForeground(Color.WHITE);
            }

        });

        JPanel panel = new JPanel();
        panel.setBorder(new EmptyBorder(2, 2, 2, 2));
        panel.setBackground(SystemColor.controlLtHighlight);
        panel.setBounds(74, 192, 455, 40);
        panelConnexion.add(panel);
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
        panelConnexion.add(panel_1);
        panel_1.setLayout(null);

        txtUsername = new JTextField();
        txtUsername.setBorder(null);
        txtUsername.setBounds(6, 6, 392, 26);
        panel_1.add(txtUsername);
        txtUsername.setText("Username");
        txtUsername.setColumns(10);

        txtSmartLoto = new JTextPane();
        txtSmartLoto.setForeground(new Color(168, 193, 197));
        txtSmartLoto.setBackground(new Color(238, 238, 238));
        txtSmartLoto.setFont(new Font("SignPainter", Font.PLAIN, 32));
        txtSmartLoto.setText("Smart - Loto");
        txtSmartLoto.setBounds(237, 63, 150, 29);
        panelConnexion.add(txtSmartLoto);

        btnInscrire = new JButton("S'inscrire");
        btnInscrire.setBounds(270, 291, 117, 29);
        panelConnexion.add(btnInscrire);

        btnSeConnecter = new JButton("Se connecter");
        btnSeConnecter.setBounds(412, 291, 117, 29);
        panelConnexion.add(btnSeConnecter);


        // Bouger la fenêtre

        addMouseListener(new MouseAdapter() {
            @Override
            //on recupere les coordonnées de la souris
            public void mousePressed(MouseEvent e) {
                posX = e.getX();    //Position X de la souris au clic
                posY = e.getY();    //Position Y de la souris au clic
            }
        });

        addMouseMotionListener(new MouseMotionAdapter() {
            // A chaque deplacement on recalcul le positionnement de la fenetre
            public void mouseDragged(MouseEvent e) {
                int depX = e.getX() - posX;
                int depY = e.getY() - posY;
                setLocation(getX() + depX, getY() + depY);
            }
        });


    }
}
