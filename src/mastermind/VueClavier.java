package mastermind;

import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class VueClavier extends Panel implements Observer {
	
public VueClavier(ItemListener l, Modele m) {
		
		this.setLayout(new FlowLayout());

		for (int i=0; i<COULEURS.length(); i++) {
			for (int x=20; x<400; x++) {
				Button bouton=new Button("Button "+i);
				bouton.setBounds(x, 50, 50, 50);
				bouton.setBackground(COULEURS[i]);
				bouton.addItemListener(l);
				x=x+50;
			}
		}
		m.addObserver(this);
	}
	
	
	
}
