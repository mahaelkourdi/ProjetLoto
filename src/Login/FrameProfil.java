package Login;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Label;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrameProfil extends JFrame {

    private final JPanel contentPane;
    private final JTextField nom;
    private final JTextField prenom;
    private final JTextField mail;
    private final JButton btnValider;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    FrameProfil frame = new FrameProfil();
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
    public FrameProfil() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(200, 200, 700, 500);
        setUndecorated(true);
        setLocationRelativeTo(null);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);


        JPanel PanelHeader = new JPanel();
        PanelHeader.setBounds(0, 0, 700, 20);
        PanelHeader.setBackground(new Color(220, 220, 220));
        contentPane.add(PanelHeader);
        PanelHeader.setLayout(null);

        JButton buttonClose = new JButton("X");
        buttonClose.setBounds(670, 0, 30, 20);
        PanelHeader.add(buttonClose);

        JPanel panelInformations = new JPanel();
        panelInformations.setBounds(0, 98, 694, 366);
        contentPane.add(panelInformations);
        panelInformations.setLayout(null);

        JLabel lblNom = new JLabel("Nom");
        lblNom.setFont(new Font("PT Sans", Font.PLAIN, 16));
        lblNom.setBounds(29, 130, 127, 16);
        panelInformations.add(lblNom);

        JLabel lblPrénom = new JLabel("Prénom");
        lblPrénom.setFont(new Font("PT Sans", Font.PLAIN, 16));
        lblPrénom.setBounds(29, 192, 127, 16);
        panelInformations.add(lblPrénom);

        JLabel lblMail = new JLabel("E-mail");
        lblMail.setFont(new Font("PT Sans", Font.PLAIN, 16));
        lblMail.setBounds(29, 264, 127, 16);
        panelInformations.add(lblMail);

        nom = new JTextField();
        nom.setBounds(168, 120, 453, 36);
        panelInformations.add(nom);
        nom.setColumns(10);

        prenom = new JTextField();
        prenom.setColumns(10);
        prenom.setBounds(168, 181, 453, 36);
        panelInformations.add(prenom);

        mail = new JTextField();
        mail.setColumns(10);
        mail.setBounds(168, 254, 453, 36);
        panelInformations.add(mail);


        btnValider = new JButton("Valider");

        btnValider.setFont(new Font("PT Sans", Font.PLAIN, 13));
        btnValider.setBounds(559, 331, 117, 29);
        panelInformations.add(btnValider);

        // En cliquant sur le vouton valider, on récupère les champs saisis ( ce n'est pas fini)
        btnValider.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String nomSaisi = nom.getText();
                String prenomSaisi = prenom.getText();
                String mailSaisi = mail.getText();


                JOptionPane.showMessageDialog(null, "Vos modifications sont enregistrées avec succès");
                setVisible(false);
                FrameProfil.this.dispose();

            }
        });


        JLabel lblProfil = new JLabel("Profil");
        lblProfil.setBounds(235, 29, 224, 22);
        panelInformations.add(lblProfil);
        lblProfil.setFont(new Font("PT Sans", Font.PLAIN, 22));
        lblProfil.setHorizontalAlignment(SwingConstants.CENTER);

        JPanel panelModifier = new JPanel();
        panelModifier.setBounds(0, 20, 694, 77);
        contentPane.add(panelModifier);
        panelModifier.setLayout(null);

        JLabel lblSmartLoto = new JLabel("Smart-Loto");
        lblSmartLoto.setBounds(6, 24, 113, 32);
        panelModifier.add(lblSmartLoto);
        lblSmartLoto.setForeground(new Color(168, 193, 197));
        lblSmartLoto.setFont(new Font("SignPainter", Font.PLAIN, 32));

        buttonClose.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                if (JOptionPane.showConfirmDialog(null, "Etes vous sûrs de vouloir fermer l'application?", "Confirmation", JOptionPane.YES_NO_OPTION) == 0)
                    ;
                FrameProfil.this.dispose();
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
    }
}
