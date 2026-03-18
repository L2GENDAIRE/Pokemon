package pokemons;

public class Main {

	public static void main(String[] args) {
		Pokemon p1 = new PokemonFeu("Salamèche", 0.7, 6.9, 50, 30);
		Pokemon p2 = new PokemonFeu("Salamèche", 0.7, 6.9, 50, 30);
		
		Attaque a1 = new Attaque("Nitrocharge", 30, 100);
		
		p1.apprendre(a1);
		
		System.out.println(p1.toString());
		
		p1.attaquer(p2, a1);
		
		System.out.println(p2.toString());
		System.out.println(p1.toString());


	}

}
