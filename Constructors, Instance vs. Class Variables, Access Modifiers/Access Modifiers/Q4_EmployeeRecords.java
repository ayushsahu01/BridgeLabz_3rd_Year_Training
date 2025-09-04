public class Q4_EmployeeRecords {
    public static void main(String[] args) {
        // Create an Employee
        Employee emp1 = new Employee(101, "Finance", 50000);
        emp1.displayEmployeeDetails();

        // Update salary
        emp1.updateSalary(55000);
        System.out.println("Updated Salary: " + emp1.getSalary());
        System.out.println();

        // Create a Manager
        Manager mgr1 = new Manager(201, "IT", 80000, 10);
        mgr1.displayManagerDetails();

        // Manager updating salary
        mgr1.updateSalary(90000);
        System.out.println("Manager's New Salary: " + mgr1.getSalary());
    }
}

// Base class
class Employee {
    public int employeeID;         // public → accessible everywhere
    protected String department;   // protected → accessible in subclasses
    private double salary;         // private → accessible only via public methods

    // Constructor
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public method to update salary
    public void updateSalary(double newSalary) {
        if (newSalary > 0) {
            this.salary = newSalary;
            System.out.println("Salary updated to: " + salary);
        } else {
            System.out.println("Invalid salary amount.");
        }
    }

    // Public getter for salary
    public double getSalary() {
        return salary;
    }

    // Display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID : " + employeeID);
        System.out.println("Department  : " + department);
        System.out.println("Salary      : " + salary);
        System.out.println("-----------------------------");
    }
}

// Subclass
class Manager extends Employee {
    private int teamSize;

    // Constructor
    public Manager(int employeeID, String department, double salary, int teamSize) {
        super(employeeID, department, salary);
        this.teamSize = teamSize;
    }

    // Demonstrates access to public & protected members
    public void displayManagerDetails() {
        System.out.println("Manager ID       : " + employeeID);   // public
        System.out.println("Department       : " + department);   // protected
        System.out.println("Salary (via getter): " + getSalary()); // private via getter
        System.out.println("Team Size        : " + teamSize);
        System.out.println("=============================");
    }
}