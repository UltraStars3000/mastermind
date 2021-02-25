package mastermind;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

public class AWT_VuePropositions extends Canvas {
	
	int x,y;
	
	public AWT_VuePropositions() {
		this.setPreferredSize(new Dimension(600, 50*Modele.N_TENTATIVES));
		this.setBackground(Color.blue);
		
		}
	
	public void paint(Graphics g) {
		for(int i =0; i<Modele.DIFFICULTE;i++) {
			g.setColor(Color.white);
			g.fillOval(x, y, 50, 50);
			x+=50;
		}
		x+=50;
		for(int j =0; j<Modele.DIFFICULTE;j++) {
			g.setColor(Color.white);
			g.fillOval(x, y, 25, 25);
			x+=25;
			if (j==Modele.DIFFICULTE/2-1) {
				y+=25;
				x-=25*Modele.DIFFICULTE/2;
			}
		}
		x=0;
		y=0;
	}
}

