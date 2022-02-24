package curs1packet;

public class ExampleVariables {

	String prenume = "Oana"; //instance variable - am nevoie de un obiect al clasei pentru a o accesa
	// void inseamna ca nu returneaza nimic valoarea mea
	
	static String greetings = "numele meu este: "; //variabila statica, adica poate fi chemata fara o instanta a clasei
	
	//metoda principala de executie
    public static void main(String[] args) {    
		
    	//obiectul clasei care imi permite sa accesez variabele si metodele din clasa respectiva
    	ExampleVariables numeObiect = new ExampleVariables();
    	
    	//System.out.println("Angajatul este " + numeObiect.prenume);
    	
    	//numeObiect.printNume();
    	
    	//System.out.println(greetings);
    	
    	System.out.println(greetings + numeObiect.printNume());
	}
	
    // void inseamna ca nu returneaza nimic valoarea mea
    public String printNume()	{
    	String nume ="Ion ";  //local variable
    	return nume + prenume;
    }
}
