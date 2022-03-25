package tn.esprit;

public class Test {
	public void PrintingGenre() {
		System.out.println("\n\nListe des genres : ");
		for (Genre genre : Genre.values()) {
			System.out.print("   " +genre+ "   ");
		}
	}
}
