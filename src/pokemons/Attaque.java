package pokemons;

public class Attaque {
	private int pp;
	private int degat;
	private String nom;
	
	public Attaque(String nom, int pp, int degat ) {
		this.nom = nom;
		this.pp = pp;
		this.degat = degat;
	}
	
	public boolean estUtilisable() {
		if (this.pp <= 0) {
			return false;
		} else {
			return true;
		}
	}

}
