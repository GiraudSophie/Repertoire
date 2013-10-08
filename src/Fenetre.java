import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Fenetre extends JFrame implements ActionListener {
	private JTextField nom, prenom, rue, cp, ville,tel;
	private JButton b_ajout,b_affprec,b_affsuiv,b_quit;
	private Repertoire g;
	private int num_cour;

	public Fenetre(Repertoire gg) {
		setTitle("REPERTOIRE");
		Container cf = this.getContentPane();
		cf.setLayout(new GridLayout(5,1));

		JPanel p1 = new JPanel();
		p1.add(new JLabel("NOM "));
		nom=new JTextField(18);
		p1.add(nom);
		cf.add(p1);

		JPanel p2 = new JPanel();
		p2.add(new JLabel("PRENOM "));
		prenom=new JTextField(18);
		p2.add(prenom);
		cf.add(p2);

		JPanel p3 = new JPanel();
		p3.add(new JLabel("Adresse "));
		rue=new JTextField(25);
		p3.add(rue);
		cp=new JTextField(5);
		p3.add(cp);
		ville=new JTextField(15);
		p3.add(ville);
		cf.add(p3);

		JPanel p4 = new JPanel();
		p4.add(new JLabel("Téléphone "));
		tel=new JTextField(10);
		p4.add(tel);
		cf.add(p4);

		JPanel p5 = new JPanel();
		b_ajout = new JButton("AJOUT");
		p5.add(b_ajout);
		b_affprec = new JButton("<< Affiche");
		p5.add(b_affprec);
		b_affsuiv = new JButton("Affiche >>");
		p5.add(b_affsuiv);
		b_quit = new JButton("QUITTER");
		p5.add(b_quit);
		cf.add(p5);

		b_ajout.addActionListener(this); 
		b_affprec.addActionListener(this); 
		b_affsuiv.addActionListener(this); 
		b_quit.addActionListener(this); 

		g=gg;
		num_cour=-1;
		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
	}

	public void actionPerformed(ActionEvent e) {
		Object source=e.getSource();
		if(source==b_ajout) ajoutePers();
		else if(source==b_affprec) affichePrec();
		else if(source==b_affsuiv) afficheSuiv();
		else if(source==b_quit) System.exit(0);
		//System.out.println(num_cour);
	}

	private void ajoutePers(){
		String n=nom.getText();
		String p=prenom.getText();
		Adresse a=new Adresse(rue.getText(), cp.getText(), ville.getText());
		String t=tel.getText();
		g.ajoutePersonne(new Personne(n,p,a,t));
		num_cour=g.taille();
	}

	private void affichePrec() {
		int nn=num_cour-1;
		if(nn>=0 && nn<g.taille()) {
			Personne p=g.recherchePersonne(nn);
			nom.setText(p.getNom());
			prenom.setText(p.getPrenom());
			rue.setText(p.getAdresse().getRue());
			cp.setText(p.getAdresse().getCodePostal());
			ville.setText(p.getAdresse().getVille());
			tel.setText(p.getTelephone());
			num_cour--;
		}
		else num_cour=0;
	}

	private void afficheSuiv() {
		int nn=num_cour+1;
		if(nn>=0 && nn<g.taille()) {
			Personne p=g.recherchePersonne(nn);
			nom.setText(p.getNom());
			prenom.setText(p.getPrenom());
			rue.setText(p.getAdresse().getRue());
			cp.setText(p.getAdresse().getCodePostal());
			ville.setText(p.getAdresse().getVille());
			tel.setText(p.getTelephone());
			num_cour++;
		}
		else {
			nom.setText("");
			prenom.setText("");
			rue.setText("");
			cp.setText("");
			ville.setText("");
			tel.setText("");
			num_cour=g.taille();
		}
	}
}