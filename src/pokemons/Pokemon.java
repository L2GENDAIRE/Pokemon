package pokemons;

public abstract class Pokemon {
	private final int id;
	private static int cpt;
	private String nom;
	private double taille;
	private double poids;
	private int pv;
	private int vitesse;
	private PokType type;
	private Attaque[] attaque;
	private int nbAttaque = 0;

	// Contructeur
	public Pokemon(String nom, double taille, double poids, int pv, int vitesse) {
		this.nom = nom;
		this.taille = taille;
		this.poids = poids;
		this.pv = pv;
		this.vitesse = vitesse;
		this.attaque = new Attaque[4];
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

	public int getVitesse() {
		return vitesse;
	}

	public PokType getType() {
		return type;
	}

	public Attaque getAttaque(int i) {
		return attaque[i];
	}

	// Setters

	public void setPv(int pv) {
		this.pv = pv;
	}

	public void setType(PokType type) {
		this.type = type;
	}

	// Méthodes
	public boolean estVivant() {
		if (this.pv <= 0) {
			return false;
		} else {
			return true;
		}
	}

	public void apprendre(Attaque a) {
		if (this.nbAttaque >= 4) {
			System.out.println("Erreure Max 4 attaques!");
		} else {
			this.attaque[this.nbAttaque] = a;
			this.nbAttaque++;
		}
	}

	public boolean estAppris(Attaque a) {
		for (int i = 0; i < 4; i++) {
			if (a == this.attaque[i]) {
				return true;
			}
		}
		return false;
	}

	public abstract void attaquer(Pokemon p, Attaque a);

	public String toString() {
		return this.getClass().getSimpleName() + " " + this.nom + " n° " + this.id + " taille : " + this.taille
				+ " poids : " + this.poids + " pv : " + this.pv + " type : " + this.type + " vitesse : " + this.vitesse;
	}

}
