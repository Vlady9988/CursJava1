package curs1packet;

public class WageCalculator {
	
	int hoursWorked = 40;

	public static void main(String[] args) {
		
		Tester tester1 = new Tester();
		tester1.setName("Vlad");
		tester1.setRatePerHour(30);
		
		//System.out.println(tester1.getName());
		

		Tester tester2 = new Tester();
		tester2.setName("Alina");
		tester2.setRatePerHour(45);
		
		//System.out.println(tester2.getName());
		
		WageCalculator obiect = new WageCalculator();
		System.out.println("Salariu lui " + tester1.getName() + " este: " + obiect.calculateSalary(tester1.getRatePerHour()));
		System.out.println("Salariu lui " + tester2.getName() + " este: " + obiect.calculateSalary(tester2.getRatePerHour()));
		
	
	}

	public int calculateSalary(int plataPeOra) {
		int salary = plataPeOra * hoursWorked;
		return salary;
	
		
	}
	
}
