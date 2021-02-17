package mastermind;

import java.awt.Color;

public class Modele {
	
	static Color[] COULEURS = {Color.yellow, Color.green, Color.blue, Color.magenta, Color.red, Color.orange, Color.white, Color.black};
	static int N_TENTATIVES = 10;
	static int DIFFICULTE = 4;
	public enum Etat{EN_COURS,GAGNE,PERDU};
}
