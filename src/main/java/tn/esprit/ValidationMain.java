package tn.esprit;

import java.util.Scanner;
//chercher si un code existe ou non 
public class ValidationMain {

	public final Genre genre = null;
	
	public static void main(String[] args) {
		//afficher la liste des genres (validation test)
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
			//afficher la liste des genres (validation test)
			service_app.AfficherGenres();
			
		}
		
	}

}
