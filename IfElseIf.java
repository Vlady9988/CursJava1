package curs1packet;

import java.util.Scanner;

public class IfElseIf {

	public static void main(String[] args) {
		//intrebam punctajul unui test si atribuim un calificativ
		
		//daca a obtinut <= 90 puncte ----> B
		//daca a optinut <= 80 ----> C
		//daca a obtinut <= 70 ----> D
		//daca a obtinu <= 60 ----> E
		//daca are mai mult decat 90 ---> A
		
		
		System.out.println("Ce punctaj ai obtinut? ");
		Scanner scan = new Scanner(System.in);
		int punctaj = scan.nextInt();
		
		char calificativ;
		
		if (punctaj <= 60) {
			calificativ = 'E';
		}
			
		else if(punctaj <= 70) {
			calificativ = 'D';
			
		}else if(punctaj <= 80) {
			calificativ = 'C';
			
		}else if(punctaj <= 90) {
			calificativ = 'B';
		}
		else {
			calificativ = 'A';
		}
		System.out.println("Calificativul obtinut este: " + calificativ);
		

	}

}
