import iut.algo.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.JTextField;

public class Map extends JFrame implements ActionListener {

	// bouton
	private JButton choix1;
	private JButton choix2;
	private JButton choix3;
	private JButton choix4;
	private JButton choix5;
	private JButton retour;

	// panel
	private JPanel panelPrincipal;
	private JPanel panelMap;
	private JLabel texte1;
	private JLabel imgMap;

	private String nomMap;

	//Tableau des maps
	/*5*/	String twoCP[]   = {"Hanamura", "Horizon lunar colony", "Temple d'anubis" , "Volskaya", "Paris"};
	/*5*/	String payload[] = {"Dorado", "Junkertown", "Rialto" , "Route 66", "Gibraltar"};
	/*5*/	String hybrid[]  = {"Blizzard World", "Eichenwald", "Hollywood" , "King'srow","Numbani"};
	/*5*/	String koth[]    = {"Busan", "Ilios", "Lijang" , "Nepal","Oasis"};
				String map[]     = {"Busan", "Ilios", "Lijang" , "Nepal","Oasis","Blizzard World", "Eichenwald", "Hollywood" , "King'srow","Numbani","Dorado", "Junkertown", "Rialto" , "Route 66", "Gibraltar","Hanamura", "Horizon lunar colony", "Temple d'anubis" , "Volskaya", "Paris"};

	public Map() {

		setTitle("Map aléatoire");
		setSize(570,920);
		setLocation(50,0);
		setLayout(new BorderLayout());

		//panel principale

		JPanel panelPrincipal = new JPanel();
		panelPrincipal.setLayout(new GridLayout(4,1));
		panelPrincipal.setBackground(new Color(250, 250,250));

		//Panel et labelTexte
		JPanel panelMap    = new JPanel();
		panelMap.setLayout(new GridLayout(3,1));
		JPanel panelBouton = new JPanel();
		JPanel panelRetour = new JPanel();
		panelRetour.setLayout(new FlowLayout( FlowLayout.RIGHT, 10,190));
		JLabel labelTexte  = new JLabel("Quel type de map voulez-vous ?");
		JLabel panelImg    = new JLabel(new ImageIcon("/home/etudiant/ga180360/Images/ow.jpeg"));

		// création des boutons
		this.choix1 = new JButton("KOTH"   );
		this.choix2 = new JButton("Payload");
		this.choix3 = new JButton("Hybride");
		this.choix4 = new JButton("TwoCP"  );
		this.choix5 = new JButton("All map");
		this.retour = new JButton("Retour" );

		//add boutons aux panels
		panelBouton.add(this.choix1);
		panelBouton.add(this.choix2);
		panelBouton.add(this.choix3);
		panelBouton.add(this.choix4);
		panelBouton.add(this.choix5);
		panelRetour.add(this.retour);

		// ajout actionlistener des boutons
		choix1.addActionListener(this);
		choix2.addActionListener(this);
		choix3.addActionListener(this);
		choix4.addActionListener(this);
		choix5.addActionListener(this);
		retour.addActionListener(this);

		//texte Map

		texte1 = new JLabel("            ");
		imgMap = new JLabel("");

		//add panel au panels
		panelPrincipal.add(panelImg);
		panelMap.add(labelTexte);
		panelMap.add(panelBouton);
		panelMap.add(texte1);
		panelPrincipal.add(panelMap);
		panelPrincipal.add(imgMap);
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
				int alea  = (int) (Math.random()*5);
				this.nomMap = koth[alea];
				texte1.setText(this.nomMap);
				imgMap.setIcon(new ImageIcon("/home/etudiant/ga180360/Documents/TP/S2/Overwatch2.0/image/map/" + this.nomMap + ".jpg"));
			}

			if(e.getSource() == this.choix2)
			{
				int alea  = (int) (Math.random()*5);
				this.nomMap = payload[alea];
				texte1.setText(this.nomMap);
				imgMap.setIcon(new ImageIcon("/home/etudiant/ga180360/Documents/TP/S2/Overwatch2.0/image/map/" + this.nomMap + ".jpg"));
			}

			if(e.getSource() == this.choix3)
			{
				int alea  = (int) (Math.random()*5);
				this.nomMap = hybrid[alea];
				texte1.setText(this.nomMap);
				imgMap.setIcon(new ImageIcon("/home/etudiant/ga180360/Documents/TP/S2/Overwatch2.0/image/map/" + this.nomMap + ".jpg"));
			}

			if(e.getSource() == this.choix4)
			{
				int alea  = (int) (Math.random()*5);
				this.nomMap = twoCP[alea];
				texte1.setText(this.nomMap);
				imgMap.setIcon(new ImageIcon("/home/etudiant/ga180360/Documents/TP/S2/Overwatch2.0/image/map/" + this.nomMap + ".jpg"));
			}

			if(e.getSource() == this.choix5)
			{
				int alea2  = (int) (Math.random()*20);
				this.nomMap = map[alea2];
				texte1.setText(this.nomMap);
				imgMap.setIcon(new ImageIcon("/home/etudiant/ga180360/Documents/TP/S2/Overwatch2.0/image/map/" + this.nomMap + ".jpg"));
			}

			if(e.getSource() == this.retour)
			{
				this.dispose();
				new Menu();
			}
		}
}
