import java.util.Scanner;

// Base class
class Employee {
    protected double salary;

    // Constructor
    public Employee(double salary) {
        this.salary = salary;
    }

    // Method to display salary
    public void displaySalary() {
        System.out.println("Salary after hike: " + salary);
    }
}

// Derived class 1
class FullTimeEmployee extends Employee {

    public FullTimeEmployee(double salary) {
        super(salary);
    }

    // Calculate salary with 50% hike
    public void calculateSalary() {
        System.out.println("Full Time Employee");
        System.out.println("Salary before hike: " + salary);
        salary = salary + (salary * 0.50);
        displaySalary();
    }
}

// Derived class 2
class InternEmployee extends Employee {

    public InternEmployee(double salary) {
        super(salary);
    }

    // Calculate salary with 25% hike
    public void calculateSalary() {
        System.out.println("Intern Employee");
        System.out.println("Salary before hike: " + salary);
        salary = salary + (salary * 0.25);
        displaySalary();
    }
}

// Main class
public class HierarchicalInheritanceDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Full Time Employee Salary: ");
        double fullSalary = sc.nextDouble();

        System.out.print("Enter Intern Employee Salary: ");
        double internSalary = sc.nextDouble();

        FullTimeEmployee fte = new FullTimeEmployee(fullSalary);
        InternEmployee intern = new InternEmployee(internSalary);

        System.out.println();
        fte.calculateSalary();

        System.out.println();
        intern.calculateSalary();

        sc.close();
    }
}
