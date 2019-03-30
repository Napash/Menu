import iut.algo.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.JTextField;

//j'essaie de faire un menu
public class Menu extends JFrame implements ActionListener {

	// bouton
	private JButton chx1;
	private JButton chx2;
	private JButton chx3;
	private JButton chx4;
	private JButton chx5;

	// panel
	private JPanel panelMain;
	private JPanel panelBoutonChoix;

	public Menu() {

		setTitle("Overwatch 2.0");
		setSize(570,920);
		setLocation(50,0);
		setLayout(new BorderLayout());

		//panel principale

		JPanel panelMain = new JPanel();
		panelMain.setLayout(new GridLayout(2,1));
		panelMain.setBackground(new Color(250, 250,250));

		//Panel et labelTexte
		panelBoutonChoix    = new JPanel();
		JLabel panelImg     = new JLabel(new ImageIcon("/home/etudiant/ga180360/Images/ow.jpeg"));


		// création des boutons
		this.chx1 = new JButton("Map aléatoire"   );
		this.chx2 = new JButton("Héro aléatoire"  );
		this.chx3 = new JButton("Mini-Jeu"        );
		this.chx4 = new JButton("Map Aléa Arcade" );
		this.chx5 = new JButton("Draft"           );

		//add boutons aux panels
		panelBoutonChoix.add(chx1);
		panelBoutonChoix.add(chx2);
		panelBoutonChoix.add(chx3);
		panelBoutonChoix.add(chx4);
		panelBoutonChoix.add(chx5);

		// ajout actionlistener des boutons
		chx1.addActionListener(this);
		chx2.addActionListener(this);
		chx3.addActionListener(this);
		chx4.addActionListener(this);
		chx5.addActionListener(this);

		//add panel au panels
		panelMain.add(panelImg);
		panelMain.add(panelBoutonChoix);

		// close la fenetre
		this.addWindowListener( new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		}

			);
		this.add(panelMain);
		setVisible(true);
		}

		//Les actions des boutons
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource() == this.chx1)
			{
				this.dispose(); //ferme la premiere frame
				new Map();
			}

			if(e.getSource() == this.chx2)
			{
				this.dispose(); //ferme la première fenetre
				new Hero();
			}

			if(e.getSource() == this.chx3)
			{
				System.out.println("En cours de construction");
			}

			if(e.getSource() == this.chx4)
			{
				System.out.println("En cours de construction");
			}

			if(e.getSource() == this.chx5)
			{
				System.out.println("En cours de construction");
			}
		}

//le main
public static void main(String[] args){
			new Menu();
		}
	}
