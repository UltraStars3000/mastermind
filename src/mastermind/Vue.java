package mastermind;

import java.awt.*;
import java.awt.event.*;

public class Vue extends Frame implements WindowListener{
	
	public Vue() {

		Modele modl = new Modele();
		Controleur ctrl = new Controleur(modl);
		
		this.setLayout(new BorderLayout());

		VuePropositions panneauHaut = new VuePropositions(ctrl, modl);
		this.add(panneauHaut, BorderLayout.NORTH);

		VueClavier panneauBas = new VueClavier(ctrl, modl);
		this.add(panneauBas, BorderLayout.SOUTH);

		this.addWindowListener(this);
		this.setTitle("Mastermind");
		this.setSize(400, 800);
	    this.setLocationRelativeTo(null);
		this.pack();
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Vue();
	}
	
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

}
