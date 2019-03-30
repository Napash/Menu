import iut.algo.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.JTextField;

public class Hero extends JFrame implements ActionListener {

	// bouton
	private JButton choix1;
	private JButton choix2;
	private JButton choix3;
	private JButton choix4;
	private JButton choix5;
	private JButton retour;

	// panel
	private JPanel panelPrincipal;
	private JPanel panelHero;
	private JLabel texte1;
	private JLabel imgHero;

	private String nomHero;

	// tableau des héros
	/*7*/	String tank[]   = {"Hammond", "Roadhog", "D.va" , "Orisa", "Reinhard", "Winston", "Zarya"};
	/*16*/String degats[] = {"Ashe", "Bastion", "Junkrat" , "Doomfist", "Widowmaker", "Reaper", "Genji", "Hanzo", "Mccree", "Mei", "Pharah", "Soldier 76", "Sombra", "Symmetra", "Torbjorn", "Tracer" };
	/*7*/	String soutien[]= {"Ana", "Mercy", "Baptiste" , "Brigitte","Lucio", "Moira" , "Zenyatta"};
	/*5*/	String all[]    = {"Ana", "Mercy", "Baptiste" , "Brigitte","Lucio", "Moira" , "Zenyatta" , "Ashe", "Bastion", "Junkrat" , "Doomfist", "Widowmaker", "Reaper", "Genji", "Hanzo", "Mccree", "Mei" , "Pharah", "Soldier 76", "Sombra", "Symmetra", "Torbjorn", "Tracer" , "Hammond", "Roadhog", "D.va" , "Orisa", "Reinhard", "Winston", "Zarya" };

	public Hero() {

		setTitle("Héro aléatoire");
		setSize(570,920);
		setLocation(50,0);
		setLayout(new BorderLayout());

		//panel principale

		JPanel panelPrincipal = new JPanel();
		panelPrincipal.setLayout(new GridLayout(4,1));
		panelPrincipal.setBackground(new Color(250, 250,250));

		//Panel et labelTexte
		JPanel panelRetour = new JPanel();
		panelRetour.setLayout(new FlowLayout( FlowLayout.RIGHT, 10,190));
		JPanel panelHero    = new JPanel();
		panelHero.setLayout(new GridLayout(3,1));
		JPanel panelBouton = new JPanel();
		JLabel labelTexte  = new JLabel("Quel type de Hero voulez-vous ?");
		JLabel panelImg    = new JLabel(new ImageIcon("/home/etudiant/ga180360/Images/ow.jpeg"));

		// création des boutons
		this.choix1 = new JButton("tank"   );
		this.choix2 = new JButton("Dps");
		this.choix3 = new JButton("Heal");
		this.choix4 = new JButton("Tout les Heros"  );
		this.retour = new JButton("Retour");

		//add boutons aux panels
		panelBouton.add(this.choix1);
		panelBouton.add(this.choix2);
		panelBouton.add(this.choix3);
		panelBouton.add(this.choix4);
		panelRetour.add(this.retour);

		// ajout actionlistener des boutons
		choix1.addActionListener(this);
		choix2.addActionListener(this);
		choix3.addActionListener(this);
		choix4.addActionListener(this);
		retour.addActionListener(this);

		//texte Hero

		texte1 = new JLabel("            ");
		imgHero = new JLabel("");

		//add panel au panels
		panelPrincipal.add(panelImg);
		panelHero.add(labelTexte);
		panelHero.add(panelBouton);
		panelHero.add(texte1);
		panelPrincipal.add(panelHero);
		panelPrincipal.add(imgHero);
		panelPrincipal.add(panelRetour);


		// close la fenetre
		this.addWindowListener( new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		}
			);
		this.add(panelPrincipal);
		this.setVisible(true);
		}

		//Les actions des boutons
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource() == this.choix1)
			{
				int alea  = (int) (Math.random()*7);
				this.nomHero = tank[alea];
				texte1.setText(this.nomHero);
				imgHero.setIcon(new ImageIcon("/home/etudiant/ga180360/Documents/TP/S2/Overwatch2.0/image/hero/" + this.nomHero + ".jpg"));
			}

			if(e.getSource() == this.choix2)
			{
				int alea  = (int) (Math.random()*16);
				this.nomHero = degats[alea];
				texte1.setText(this.nomHero);
				imgHero.setIcon(new ImageIcon("/home/etudiant/ga180360/Documents/TP/S2/Overwatch2.0/image/hero/" + this.nomHero + ".jpg"));
			}

			if(e.getSource() == this.choix3)
			{
				int alea  = (int) (Math.random()*7);
				this.nomHero = soutien[alea];
				texte1.setText(this.nomHero);
				imgHero.setIcon(new ImageIcon("/home/etudiant/ga180360/Documents/TP/S2/Overwatch2.0/image/hero/" + this.nomHero + ".jpg"));
			}

			if(e.getSource() == this.choix4)
			{
				int alea  = (int) (Math.random()*30);
				this.nomHero = all[alea];
				texte1.setText(this.nomHero);
				imgHero.setIcon(new ImageIcon("/home/etudiant/ga180360/Documents/TP/S2/Overwatch2.0/image/hero/" + this.nomHero + ".jpg"));
			}

			if(e.getSource() == this.retour)
			{
				this.dispose();
				new Menu();
			}
		}
}
