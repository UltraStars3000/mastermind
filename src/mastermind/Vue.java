package mastermind;

import java.awt.*;
import java.awt.event.*;

public class Vue extends Frame implements WindowListener{
	
	public Vue() {

		Modele modl = new Modele();
		Controleur ctrl = new Controleur(modl);
		
		this.setLayout(new BorderLayout());

		Panel VueClavier = new Panel();
		int x = 50;
		for (int i = 0;i<Modele.COULEURS.length;i++) {
			Button bouton = new Button("Bouton "+i);
			bouton.setBounds(x, 50, 50, 50);
			bouton.setBackground(Modele.COULEURS[i]);
			
		}
		this.add(VueClavier, BorderLayout.NORTH);

		Canvas VuePropositions = new Canvas();
		this.add(VuePropositions, BorderLayout.SOUTH);

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
		System.exit(0); 
		
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
