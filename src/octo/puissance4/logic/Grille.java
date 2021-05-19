package octo.puissance4.logic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Grille {
	
	public static final int COLONNE = 7;
	public static final int LIGNE = 6;
	Map<Integer, List<Jeton>> grille = new HashMap<>();

	public Grille() {
	    for (int key = 0; key < COLONNE; key++) {
	        List<Jeton> colonne = new ArrayList<>();
	        for (int i = 0; i < LIGNE; i++) {
	            colonne.add(Jeton.VIDE);
	        }
	        this.grille.put(key, colonne);
	    }
	}

	public void ajouterJeton(Jeton jeton,int colonne) {
		
	}
	
	private boolean estPleine() {
		return true;
	}
	
	private boolean estColonneVide() {
		return true;
	}
	
	public String recupererCouleur(int ligne,int colonne) {
		return "";
	}

	public Map<Integer, List<Jeton>> getGrille() {
		return grille;
	}

	public void setGrille(Map<Integer, List<Jeton>> grille) {
		this.grille = grille;
	}
	
	
	
	
	
	
}
