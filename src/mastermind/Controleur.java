package mastermind;


import java.awt.*;
import java.awt.event.*;

public class Controleur implements ActionListener  {
	
	public Controleur(Modele modl) {
		System.out.print("Salut");

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		Button bouton = (Button) arg0.getSource();	
	}
	
}
