package pokemons;

public class PokemonFeu extends Pokemon {

	public PokemonFeu(String nom, double taille, double poids, int pv, int vitesse) {
		super(nom, taille, poids, pv, vitesse);
		this.setType(getType().FEU);
	}

	@Override
	public void attaquer(Pokemon p, Attaque a) {
		if (a.estUtilisable() && this.estAppris(a)) {
			switch (p.getType()) {
			case FEU:
				p.setPv(-(a.getDegat()*0.5));
			}
			
		}
		
	}

}
