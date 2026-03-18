package pokemons;

public abstract class Pokemon {
	private final int id;
	private static int cpt;
	private String nom;
	private double taille;
	private double poids;
	private int pv;
	private PokType type;

	// Contructeur
	public Pokemon(String nom, double taille, double poids, int pv) {
		this.nom = nom;
		this.taille = taille;
		this.poids = poids;
		this.pv = pv;
		cpt++;
		id = cpt;
	}

	// Getters
	
	public int getId() {
		return id;
	}

	public String getNom() {
		return nom;
	}

	public double getTaille() {
		return taille;
	}

	public double getPoids() {
		return poids;
	}

	public int getPv() {
		return pv;
	}

	public PokType getType() {
		return type;
	}
	
	// Setters
	
	// Méthodes
	public boolean estVivant() {
		if (this.pv <= 0) {
			return false;
		} else {
			return true;
		}
	}

	

	public abstract void attaquer(Pokemon p, Attaque a);

	public String toString() {
		return this.getClass().getSimpleName() + " " + this.nom + " n° " + this.id + " taille : " + this.taille
				+ " poids : " + this.poids + " pv : " + this.pv + " type : " + this.type;
	}

}
