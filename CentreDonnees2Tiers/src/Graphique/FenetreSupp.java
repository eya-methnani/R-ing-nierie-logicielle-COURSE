package Graphique;


import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import Logique.ConnexionBD;
import Logique.Etudiant;


public class FenetreSupp extends JFrame{




		public JLabel id,nom;
			
			public JTextField idT,nomT;
			
			public JButton ok = new JButton("ok");
			public JButton cancel = new JButton("cancel");
			
			public FenetreSupp()
			{
				this.id = new JLabel("id");
				//this.nom = new JLabel("nom");
				this.idT = new JTextField(20);
				//this.nomT = new JTextField(20);
				setTitle("supp d'un étudiant");
				setLayout(new FlowLayout(1,50,50));
				setSize(700,400);
				setResizable(true);
				setVisible(true);
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				this.add(id);
				this.add(idT);
				//this.add(nom);
				//this.add(nomT);
				this.add(ok);
				this.add(cancel);
				
				this.ok.addActionListener(new ActionListener() {


					@Override
					public void actionPerformed(ActionEvent arg0) {
						// TODO Auto-generated method stub
						int id = Integer.parseInt(idT.getText());
						//Etudiant e = new Etudiant (Integer.parseInt(idT.getText()), nomT.getText());
						ConnexionBD gg = new ConnexionBD();
						gg.supp("delete from etudiant where id ="+id);
						JOptionPane.showMessageDialog(null, "supp succes!", "Information",
		    					JOptionPane.INFORMATION_MESSAGE) ;
					}});
				
				this.cancel.addActionListener(new ActionListener() {


					@Override
					public void actionPerformed(ActionEvent arg0) {
						// TODO Auto-generated method stub
						setVisible(false);
						
					}});
			}


}
