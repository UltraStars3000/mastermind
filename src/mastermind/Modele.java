package mastermind;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Observable;

public class Modele extends Observable {
	
	static Color[] COULEURS = {Color.yellow, Color.green, Color.blue, Color.magenta, Color.red, Color.orange, Color.white, Color.black};
	static int N_TENTATIVES = 10;
	static int DIFFICULTE = 4;
	static public enum Etat{EN_COURS,GAGNE,PERDU};
	
	Etat etat;
	Rangee combinaison = new Rangee();
	Rangee[] propositions = new Rangee[N_TENTATIVES];
	int tentative;
	
	
	public Modele() {
		this.etat = Etat.EN_COURS;
		for(int i=0;i<Modele.DIFFICULTE;i++) {
			this.combinaison.jetons[i] = Modele.COULEURS[(int)(Math.random()*(Modele.COULEURS.length))];
		}
		this.tentative = 0;
	}
	
	public void evaluerProposition() {
		ArrayList<Color> temp_usr = new ArrayList<Color>();
		ArrayList<Color> temp_sol = new ArrayList<Color>();
		int temp_noi = 0;
		int temp_bla = 0;
		
		for(int i=0;i<Modele.DIFFICULTE;i++) {
			temp_usr.add(this.propositions[this.tentative].jetons[i]);
			temp_sol.add(this.combinaison.jetons[i]);
		}
		
		for(int i=0;i<Modele.DIFFICULTE;i++) {
			if(temp_usr.get(i) == temp_sol.get(i)) {
				temp_noi++;
				temp_usr.set(i, null); //DummyValue
				temp_sol.set(i, null); //DummyValue
			}
			for(int j=0;j<Modele.DIFFICULTE;j++) {
				if(temp_usr.get(i) == temp_sol.get(j)) {
					temp_bla++;
					temp_usr.set(i, null); //DummyValue
					temp_sol.set(j, null); //DummyValue
				}
			}
		}
		this.propositions[this.tentative].noirs = temp_noi;
		this.propositions[this.tentative].blancs = temp_bla;
		
		if(temp_noi == DIFFICULTE) {
			this.etat = Etat.GAGNE;
		}
	}
	
	public void nouvelleProposition() {
		if(this.tentative == N_TENTATIVES) {
			this.etat = Etat.PERDU;
		}else {
			this.tentative++;
		}
	}
	
	public void archiverProposition() {
		
	}
	
	public void afficherPropositions() {
		
	}
	
	public void afficherEncours() {
		
	}
}
