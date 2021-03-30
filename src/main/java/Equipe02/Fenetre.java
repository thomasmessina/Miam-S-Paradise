package Equipe02;


import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;


public class Fenetre extends JFrame implements KeyListener {
ConteneurFenetre pan;
	
	
	public Fenetre() {
		super();
		proprietesFenetre();
	}
	
	
	private void proprietesFenetre() {
		this.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		this.setUndecorated(true);
		this.setVisible(true);
		this.setResizable(true);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setAlwaysOnTop(true);
		pan = new ConteneurFenetre();
		this.setContentPane(pan);
		
	}


	private void setContentPane(ConteneurFenetre pan2) {
		// TODO Auto-generated method stub
		
	}
	
	public void keyReleased(KeyEvent e) {
		
		if(e.getKeyCode() == KeyEvent.VK_ESCAPE) {
		    System.exit(1);
		}
		
	}


	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}

