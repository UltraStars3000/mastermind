package mastermind;

import java.awt.Color;
import java.util.Observable;

public class Modele extends Observable {
	
	static Color[] COULEURS = {Color.yellow, Color.green, Color.blue, Color.magenta, Color.red, Color.orange, Color.white, Color.black};
	static int N_TENTATIVES = 10;
	static int DIFFICULTE = 4;
	static public enum Etat{EN_COURS,GAGNE,PERDU};
	
	Etat etat;
	Rangee combinaison;
	Rangee[] propositions = new Rangee[N_TENTATIVES];
	int tentative;
	
	
	public Modele() {
		this.etat = Etat.EN_COURS;
		for(int i=0;i<Modele.DIFFICULTE;i++) {
			this.combinaison.jetons[i] = Modele.COULEURS[(int)(Math.random()*(Modele.COULEURS.length+1))];
		}
		tentative = 0;
	}
}
