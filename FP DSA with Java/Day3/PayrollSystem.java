// Step 1: Abstract class Employee
abstract class Employee {
    String name;
    int id;

    // Constructor
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Abstract method (must be implemented by subclasses)
    public abstract double calculateSalary();

    // Concrete method
    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
    }
}

// Step 2: Subclass FullTimeEmployee
class FullTimeEmployee extends Employee {
    double monthlySalary;

    public FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id); // call parent constructor
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}

// Step 3: Subclass ContractEmployee
class ContractEmployee extends Employee {
    double hourlyRate;
    int hoursWorked;

    public ContractEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

// Step 4: Main Class
public class PayrollSystem {
    public static void main(String[] args) {
        // Full-time employee
        FullTimeEmployee fte = new FullTimeEmployee("Alice", 101, 50000);
        fte.displayDetails();
        System.out.println("Salary: " + fte.calculateSalary());
        System.out.println();

        // Contract employee
        ContractEmployee ce = new ContractEmployee("Bob", 102, 500, 40);
        ce.displayDetails();
        System.out.println("Salary: " + ce.calculateSalary());
    }
}