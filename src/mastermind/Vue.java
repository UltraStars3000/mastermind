package mastermind;

import java.awt.*;
import java.awt.event.*;

public class Vue extends Frame implements WindowListener {
	
	public Vue() {
		
		Modele modl = new Modele();
		Controleur ctrl = new Controleur(modl);
		
		this.setLayout(new BorderLayout());

		AWT_VueClavier VueClavier = new AWT_VueClavier(ctrl);
		this.add(VueClavier, BorderLayout.SOUTH);

		
		AWT_VuePropositions VuePropositions = new AWT_VuePropositions();
		this.add(VuePropositions, BorderLayout.NORTH);
		
		
		this.addWindowListener(this);
		this.setTitle("Mastermind");
		this.setSize(700, 900);
		this.setBackground(Color.lightGray);
	    this.setLocationRelativeTo(null);
	    this.pack();
		this.setVisible(true);
		
		}
	
	@Override
	public void windowClosing(WindowEvent arg0) {
		System.exit(0);
	}
	
	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
		
	public static void main(String[] args) {
		new Vue();
		
	}

}
