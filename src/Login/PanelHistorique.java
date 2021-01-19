package Login;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.Desktop;
import java.awt.event.ActionEvent;

public class PanelHistorique extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelHistorique() {
		setSize(500,400);
		setLayout(null);
		
		JButton btnTélécharger = new JButton("Ciquer ici ");
		
		btnTélécharger.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 try {

				        File pdfFile = new File("./src/test.pdf");
				        if (pdfFile.exists()) {

				            if (Desktop.isDesktopSupported()) {
				                Desktop.getDesktop().open(pdfFile);
				            } else {
				                System.out.println("Awt Desktop is not supported!");
				            }

				        } else {
				            System.out.println("File is not exists!");
				        }


				      } catch (Exception ex) {
				        ex.printStackTrace();
				      }
			}
		});
		btnTélécharger.setBounds(341, 33, 108, 29);
		add(btnTélécharger);
		
		JLabel lbl = new JLabel("Pour télécharger les derniers résultats du tirage : ");
		lbl.setBounds(17, 38, 340, 16);
		add(lbl);


	}
}
