package tn.esprit;
//contient les methodes de l'application
public class service {
	public service()
	{}
	public void AfficherGenres()
	{
		int nb=1;
		Genre[] genres=Genre.values();
		 for (Genre genre : genres) {
			 System.out.println("Code de genre : "+ nb+" => Genre : "+genre);
			 nb++;
		}
	}
}
