package tn.esprit;

import java.util.Scanner;

public class ValidationMain {

	public final Genre genre = null;
	
	public static void main(String[] args) {
		
		System.out.println("Partie de Validation");
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisir le code de genre");
		int code = sc.nextInt();
		if(code==1)
		{
			System.out.println("Genre : "+Genre.MASCULIN);
		}
		else
		{
			System.out.println("On accepte le code numero 1 !!!");
		}
		
		


	}

}
