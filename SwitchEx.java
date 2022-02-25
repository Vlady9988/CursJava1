package curs1packet;

import java.util.Scanner;

public class SwitchEx {

	public static void main(String[] args) {
		
		System.out.println("Introdu calificativul primit: ");
		Scanner scan = new Scanner(System.in);
		String calificativ = scan.next();
		
		//in paranteze la switch punem comanda cara va fi comparata
		switch(calificativ.toLowerCase()) {
		
		case "A":
			System.out.println("Great Job!");
			break;
		case "B":
			System.out.println("Not that good!");
			break;
		case "C":
			System.out.println("Kind of bad!");
			break;
			//default e ca else, daca nu mai sunt conditii
		default:
			System.out.println("Te rog introdu un calificativ dintre A, B si C");
		
		}

	}

}
