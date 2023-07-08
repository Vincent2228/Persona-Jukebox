package package1;

import java.awt.EventQueue;
import javafx.embed.swing.JFXPanel;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaPlayer.Status;
import javafx.util.Duration;

import java.io.File;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JProgressBar;
import javax.swing.JScrollBar;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.ActionEvent;
import java.awt.Image;
import javax.swing.SwingConstants;
import javax.swing.DropMode;
import javafx.scene.media.MediaPlayer.Status;
import javafx.util.Duration;

public class Persona5 {

	private JFrame frmPersona;
	
	private MediaPlayer mediaPlayer;
	final JFXPanel fxPanel = new JFXPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Persona5 window = new Persona5();
					window.frmPersona.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Persona5() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPersona = new JFrame();
		frmPersona.setTitle("Persona 5");
		frmPersona.setBounds(100, 100, 765, 451);
		frmPersona.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPersona.getContentPane().setLayout(null);
		
		String music = System.getProperty("user.dir") + "/src/resources/Persona 3 OST Velvet Room.mp3";
		Media musicFile = new Media(new File(music).toURI().toString());
		mediaPlayer = new MediaPlayer(musicFile);
		mediaPlayer.setVolume(0.10);
		mediaPlayer.play();
		
		 JScrollBar scrollBar = new JScrollBar();
	        scrollBar.setForeground(new Color(204, 0, 51));
	        scrollBar.setBackground(new Color(255, 0, 0));
	        scrollBar.setBlockIncrement(5);
	        scrollBar.setMaximum(110);
	        scrollBar.addAdjustmentListener(new AdjustmentListener() {
	        	public void adjustmentValueChanged(AdjustmentEvent arg0) {
	        		if ((mediaPlayer != null) && (mediaPlayer.getStatus().equals(Status.PLAYING)))                    
	        			  new Thread(() -> mediaPlayer.seek(new Duration(mediaPlayer.getTotalDuration().toMillis()*scrollBar.getValue()/100) )).start();
	        	}
	        });
	        scrollBar.setOrientation(JScrollBar.HORIZONTAL);
	        scrollBar.setBounds(230, 381, 284, 17);
	        frmPersona.getContentPane().add(scrollBar);
		
		JButton btnNewButton_5 = new JButton("STOP");
		btnNewButton_5.setForeground(new Color(0, 0, 0));
		btnNewButton_5.setBackground(new Color(128, 0, 0));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				scrollBar.setMaximum(0);
        		scrollBar.setMaximum(100);
				mediaPlayer.stop();
			}
		});
        btnNewButton_5.setBounds(641, 60, 98, 38);
        frmPersona.getContentPane().add(btnNewButton_5);
		
        JButton btnNewButton_6 = new JButton("BACK");
        btnNewButton_6.setBackground(new Color(128, 128, 128));
        btnNewButton_6.setForeground(new Color(0, 0, 0));
        btnNewButton_6.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		mediaPlayer.stop();
        		frmPersona.setVisible(false);
        	}
        });
        btnNewButton_6.setBounds(641, 11, 98, 38);
        frmPersona.getContentPane().add(btnNewButton_6);
        
        
        JButton btnNewButton = new JButton("Wake Up, Get Up, Get Out");
        btnNewButton.setBackground(new Color(255, 0, 0));
        btnNewButton.setFont(new Font("Impact", Font.PLAIN, 12));
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		mediaPlayer.stop();
        		scrollBar.setMaximum(0);
        		scrollBar.setMaximum(100);
        		String music = System.getProperty("user.dir") + "/src/resources/01 Wake Up, Get Up, Get Out There OST - Persona 5.mp3";
        		Media musicFile = new Media(new File(music).toURI().toString());
        		mediaPlayer = new MediaPlayer(musicFile);
        		mediaPlayer.setVolume(0.50);
        		mediaPlayer.play();
        		
        	}
        });
        btnNewButton.setBounds(10, 329, 161, 41);
        frmPersona.getContentPane().add(btnNewButton);
        
        JButton btnNewButton_1 = new JButton("Life Will Change");
        btnNewButton_1.setBackground(new Color(255, 0, 0));
        btnNewButton_1.setFont(new Font("Impact", Font.PLAIN, 12));
        btnNewButton_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		mediaPlayer.stop();
        		scrollBar.setMaximum(0);
        		scrollBar.setMaximum(100);
        		String music = System.getProperty("user.dir") + "/src/resources/Life Will Change Persona 5 OST.mp3";
        		Media musicFile = new Media(new File(music).toURI().toString());
        		mediaPlayer = new MediaPlayer(musicFile);
        		mediaPlayer.setVolume(0.50);
        		mediaPlayer.play();
        		
        	}
        });
        btnNewButton_1.setBounds(192, 329, 140, 41);
        frmPersona.getContentPane().add(btnNewButton_1);
        
        JButton btnNewButton_2 = new JButton("Last Surprise");
        btnNewButton_2.setBackground(new Color(255, 0, 0));
        btnNewButton_2.setFont(new Font("Impact", Font.PLAIN, 12));
        btnNewButton_2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		mediaPlayer.stop();
        		scrollBar.setMaximum(0);
        		scrollBar.setMaximum(100);
        		String music = System.getProperty("user.dir") + "/src/resources/Last Surprise Persona 5 OST.mp3";
        		Media musicFile = new Media(new File(music).toURI().toString());
        		mediaPlayer = new MediaPlayer(musicFile);
        		mediaPlayer.setVolume(0.50);
        		mediaPlayer.play();
        		
        	}
        });
        btnNewButton_2.setBounds(342, 328, 122, 42);
        frmPersona.getContentPane().add(btnNewButton_2);
        
        JButton btnNewButton_3 = new JButton("Yaldabaoth");
        btnNewButton_3.setBackground(new Color(255, 0, 0));
        btnNewButton_3.setFont(new Font("Impact", Font.PLAIN, 12));
        btnNewButton_3.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		mediaPlayer.stop();
        		scrollBar.setMaximum(0);
        		scrollBar.setMaximum(100);
        		String music = System.getProperty("user.dir") + "/src/resources/Yaldabaoth Persona 5 OST.mp3";
        		Media musicFile = new Media(new File(music).toURI().toString());
        		mediaPlayer = new MediaPlayer(musicFile);
        		mediaPlayer.setVolume(0.50);
        		mediaPlayer.play();
        		
        	}
        });
        btnNewButton_3.setBounds(474, 329, 122, 41);
        frmPersona.getContentPane().add(btnNewButton_3);
        
        JButton btnNewButton_4 = new JButton("No More What Ifs");
        btnNewButton_4.setBackground(new Color(255, 0, 0));
        btnNewButton_4.setFont(new Font("Impact", Font.PLAIN, 12));
        btnNewButton_4.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		mediaPlayer.stop();
        		scrollBar.setMaximum(0);
        		scrollBar.setMaximum(100);
        		String music = System.getProperty("user.dir") + "/src/resources/No More What Ifs - Persona 5 The Royal OST.mp3";
        		Media musicFile = new Media(new File(music).toURI().toString());
        		mediaPlayer = new MediaPlayer(musicFile);
        		mediaPlayer.setVolume(0.50);
        		mediaPlayer.play();
        		
        	}
        });
        btnNewButton_4.setBounds(606, 329, 133, 41);
        frmPersona.getContentPane().add(btnNewButton_4);
        
		JLabel label = new JLabel("");        
        label.setBounds(0, 0, 749, 412);
        
        ImageIcon x = new ImageIcon(System.getProperty("user.dir") + "/src/resources/P5.jpg");
        Image image = x.getImage();
        Image newimg = image.getScaledInstance(label.getWidth(), label.getHeight(),  java.awt.Image.SCALE_SMOOTH);  
        x = new ImageIcon(newimg);
        label.setIcon(x);
        
        frmPersona.getContentPane().add(label);
        
        
	}

}