package pokemons;

public class Attaque {
	private int pp;
	private int degat;
	private String nom;

	// Constructeurs
	public Attaque(String nom, int pp, int degat) {
		this.nom = nom;
		this.pp = pp;
		this.degat = degat;
	}

	// Getters
	public int getPp() {
		return pp;
	}

	public int getDegat() {
		return degat;
	}

	public String getNom() {
		return nom;
	}

	// Setters
	public void setPp(int pp) {
		this.pp = pp;
	}

	public void setDegat(int degat) {
		this.degat = degat;
	}

	// Méthodes
	public boolean estUtilisable() {
		if (this.pp <= 0) {
			return false;
		} else {
			return true;
		}
	}


	

}
