package mastermind;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.Panel;

public class AWT_VueClavier extends Panel {
	
	public AWT_VueClavier(Controleur ctrl) {
		this.setPreferredSize(new Dimension(700, 100));
		for (int i = 0;i<Modele.COULEURS.length;i++) {
			Button bouton = new Button(null);
			bouton.setName(Integer.toString(i));
			bouton.setPreferredSize(new Dimension(80, 80));
			bouton.setBackground(Modele.COULEURS[i]);
			this.add(bouton);
			bouton.addActionListener(ctrl);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
