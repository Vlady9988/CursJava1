package curs1packet;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		
		String username = "test";
		String password = "test123";
		
		System.out.println("Introdu username: ");
		Scanner obiectscan = new Scanner(System.in);
		String user = obiectscan.next();
		
		System.out.println("Introdu parola: ");
		String pass = obiectscan.next();
		
		
		// && --and operator
		// || --or operator
		
		if(username.equals(user) && password.equals(pass))  {
			System.out.println("Login Succesfull");
			
		}
		else {
			System.out.println("Login UNSUCCESFULL");
		}

	}

}
