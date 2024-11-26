//Main.java
public class MainClass {
 public static void main(String[] args) {
//     // Create an Employee object
//     Employees employee = new Employees("netaji", 30, 101, 75000.00);
//
//     // Display the details of the employee
//     employee.displayEmployeeDetails();
	 
	 
	 
	 
	 
	 
	 
	 
	// Create instances of each hill station
     HillStations manali = new Manali();
     HillStations mussoorie = new Mussoorie();
     HillStations gulmarg = new Gulmarg();

     // Call location() and famousFor() methods on each instance
     System.out.println("Manali:");
     manali.location();
     manali.famousFor();

     System.out.println("\nMussoorie:");
     mussoorie.location();
     mussoorie.famousFor();

     System.out.println("\nGulmarg:");
     gulmarg.location();
     gulmarg.famousFor();
 }
}
