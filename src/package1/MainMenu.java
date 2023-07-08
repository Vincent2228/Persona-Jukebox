package package1;

import java.awt.EventQueue;
import javafx.embed.swing.JFXPanel;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import java.io.File;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JProgressBar;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Image;
import javax.swing.SwingConstants;
import javax.swing.DropMode;


public class MainMenu {

	private JFrame frmPersonaJukeboxMain;
	
	private MediaPlayer mediaPlayer;
	final JFXPanel fxPanel = new JFXPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu window = new MainMenu();
					window.frmPersonaJukeboxMain.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPersonaJukeboxMain = new JFrame();
		frmPersonaJukeboxMain.setTitle("Persona Jukebox Main Menu");
		frmPersonaJukeboxMain.setBounds(100, 100, 765, 451);
		frmPersonaJukeboxMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPersonaJukeboxMain.getContentPane().setLayout(null);
        
        JButton persona1 = new JButton("PERSONA 1");
        persona1.setFont(new Font("Rockwell Condensed", Font.BOLD, 17));
        persona1.setBackground(new Color(102, 153, 102));
        persona1.setForeground(new Color(51, 0, 51));
        persona1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		Persona1.main(null);
        	}
        });
        persona1.setBounds(16, 339, 130, 46);
        frmPersonaJukeboxMain.getContentPane().add(persona1);
        
        JButton persona2 = new JButton("PERSONA 2");
        persona2.setForeground(new Color(102, 0, 0));
        persona2.setBackground(new Color(220, 20, 60));
        persona2.setFont(new Font("Rockwell Condensed", Font.BOLD, 17));
        persona2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Persona2.main(null);
        	}
        });
        persona2.setBounds(154, 339, 137, 46);
        frmPersonaJukeboxMain.getContentPane().add(persona2);
        
        JButton persona3 = new JButton("PERSONA 3");
        persona3.setBackground(new Color(65, 105, 225));
        persona3.setFont(new Font("Rockwell Condensed", Font.BOLD, 17));
        persona3.setForeground(new Color(0, 0, 205));
        persona3.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Persona3.main(null);
        	}
        });
        persona3.setBounds(313, 339, 130, 46);
        frmPersonaJukeboxMain.getContentPane().add(persona3);
        
        JButton persona4 = new JButton("PERSONA 4");
        persona4.setForeground(new Color(255, 153, 0));
        persona4.setFont(new Font("Rockwell Condensed", Font.BOLD, 17));
        persona4.setBackground(new Color(255, 215, 0));
        persona4.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Persona4.main(null);
        	}
        });
        persona4.setBounds(460, 339, 130, 47);
        frmPersonaJukeboxMain.getContentPane().add(persona4);
        
        JButton persona5 = new JButton("PERSONA 5");
        persona5.setForeground(new Color(0, 0, 0));
        persona5.setFont(new Font("Rockwell Condensed", Font.BOLD, 17));
        persona5.setBackground(new Color(139, 0, 0));
        persona5.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Persona5.main(null);
        	}
        });
        persona5.setBounds(609, 339, 130, 46);
        frmPersonaJukeboxMain.getContentPane().add(persona5);
        
        JLabel lblNewLabel_5 = new JLabel("Persona Jukebox");
        lblNewLabel_5.setForeground(new Color(0, 0, 0));
        lblNewLabel_5.setFont(new Font("Rockwell Condensed", Font.BOLD | Font.ITALIC, 51));
        lblNewLabel_5.setBounds(206, 0, 500, 80);
        frmPersonaJukeboxMain.getContentPane().add(lblNewLabel_5);
        
        JLabel lblNewLabel_4 = new JLabel("Persona Jukebox");
        lblNewLabel_4.setForeground(new Color(255, 255, 255));
        lblNewLabel_4.setFont(new Font("Rockwell Condensed", Font.BOLD | Font.ITALIC, 50));
        lblNewLabel_4.setBounds(206, 0, 500, 80);
        frmPersonaJukeboxMain.getContentPane().add(lblNewLabel_4);
        
        
        JLabel lblNewLabel_2 = new JLabel("The Persona games are a series of jrpg games developed by Atlus.");
        lblNewLabel_2.setFont(new Font("Rockwell Condensed", Font.BOLD, 14));
        lblNewLabel_2.setForeground(new Color(0, 255, 0));
        lblNewLabel_2.setBounds(10, 258, 500, 55);
        frmPersonaJukeboxMain.getContentPane().add(lblNewLabel_2);
        
        JLabel lblNewLabel_1 = new JLabel("They are often known for having exceptionally great soundtracks.");
        lblNewLabel_1.setForeground(new Color(0, 255, 0));
        lblNewLabel_1.setFont(new Font("Rockwell Condensed", Font.BOLD, 14));
        lblNewLabel_1.setBounds(250, 291, 500, 29);
        frmPersonaJukeboxMain.getContentPane().add(lblNewLabel_1);
        
        
        JLabel lblNewLabel_3 = new JLabel("The five best songs from each of the persona games 1-5");
        lblNewLabel_3.setForeground(new Color(0, 0, 0));
        lblNewLabel_3.setFont(new Font("Rockwell Condensed", Font.BOLD | Font.ITALIC, 15));
        lblNewLabel_3.setBounds(229, 47, 500, 46);
        frmPersonaJukeboxMain.getContentPane().add(lblNewLabel_3);
        
        
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon(MainMenu.class.getResource("/resources/Atlus_Logo (1).png")));
        lblNewLabel.setBounds(-469, 0, 559, 68);
        frmPersonaJukeboxMain.getContentPane().add(lblNewLabel);
        
        JLabel label = new JLabel("");        
        label.setBounds(0, 0, 749, 401);
        
        ImageIcon x = new ImageIcon(System.getProperty("user.dir") + "/src/resources/carvitkkoiny.png");
        Image image = x.getImage();
        Image newimg = image.getScaledInstance(label.getWidth(), label.getHeight(), java.awt.Image.SCALE_SMOOTH);  
        x = new ImageIcon(newimg);
        label.setIcon(x);
        
        frmPersonaJukeboxMain.getContentPane().add(label);
        
        
	}
}