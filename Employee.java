// Employee.java
public class Employee extends Person {
    // Fields for employeeId and salary
    private String employeeId;
    private double salary;

    // Parameterized constructor to initialize employeeId and salary
    // This constructor also calls the constructor of the Person class to initialize name and age
    public Employee(String name, int age, String employeeId, double salary) {
        // Call the constructor of the superclass (Person) to initialize name and age
        super(name, age);
        this.employeeId = employeeId;
        this.salary = salary;
    }

    // Getter methods for employeeId and salary
    public String getEmployeeId() {
        return employeeId;
    }

    public double getSalary() {
        return salary;
    }

    // Method to display employee details (including person info)
    public void displayEmployeeInfo() {
        // Call the method from Person class to display name and age
        displayPersonInfo();
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: " + salary);
    }
}
