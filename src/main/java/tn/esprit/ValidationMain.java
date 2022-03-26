package tn.esprit;

import java.util.Map;
import java.util.Scanner;

public class ValidationMain {

	public final Genre genre = null;

	public static void main(String[] args) {

		System.out.println("Partie de Validation");

		//afficher la liste des genres
		service service_app=new service();
		System.out.println("** Liste des genre avec leurs codes : ");
		service_app.AfficherGenres();
		
		System.out.println("\n\nPartie de Validation");
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisir le code de genre");
		int code = sc.nextInt();
		if(code==1)
		{
			System.out.println("Genre : "+Genre.MASCULIN);
		}
		else
		{
			System.out.println(" ==> Nous n'acceptons que les codes suivants !!!");
			//afficher la liste des genres avec la methode de test
			service_app.AfficherGenres();
		}
		
	}

}
