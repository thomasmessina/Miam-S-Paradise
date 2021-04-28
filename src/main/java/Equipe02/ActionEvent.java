package Equipe02;

import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ActionEvent implements ActionListener {
	
	JFrame frame=new JFrame();
	JButton button=new JButton("Déconnexion");
	
	
	
	ActionEvent(){
		prepareGUI();
		buttonProperties();
	}

	private void prepareGUI() {
		frame.setSize(1650,1080);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		frame.setUndecorated(true);
		frame.setVisible(true);
		frame.setTitle("Miam's Paradise");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		frame.getContentPane().setBackground(Color.decode("#f7f4e3") );
	}

	private void buttonProperties() {
		button.setBounds(130,200,100,40);
		frame.add(button);
		button.addActionListener(this);
	}
	
	public void actionPerformed(java.awt.event.ActionEvent e) {
		System.exit(1);
		
	}

}

