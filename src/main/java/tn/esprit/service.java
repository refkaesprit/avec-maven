package tn.esprit;

import java.util.Map;

public class service {
	public service()
	{
		
	}
	public void RemplissageTableau()
	{
		int nb=1;
		Genre[] genres=Genre.values();
		 for (Genre genre : genres) {
			 System.out.println("Code de genre : "+ nb+" => Genre : "+genre);
			 nb++;
		}
	}
}
