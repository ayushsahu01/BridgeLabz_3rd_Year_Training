// Abstract class Employee
abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    // Constructor
    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Encapsulation: Getters and Setters
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    // Abstract method
    public abstract double calculateSalary();

    // Concrete method
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Final Salary: " + calculateSalary());
    }
}

// Interface Department
interface Department {
    void assignDepartment(String deptName);
    String getDepartmentDetails();
}

// Subclass FullTimeEmployee
class FullTimeEmployee extends Employee implements Department {
    private String department;
    private double allowance;

    public FullTimeEmployee(int employeeId, String name, double baseSalary, double allowance) {
        super(employeeId, name, baseSalary);
        this.allowance = allowance;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + allowance;
    }

    @Override
    public void assignDepartment(String deptName) {
        this.department = deptName;
    }

    @Override
    public String getDepartmentDetails() {
        return "Department: " + department;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println(getDepartmentDetails());
        System.out.println("-------------------------");
    }
}

// Subclass PartTimeEmployee
class PartTimeEmployee extends Employee implements Department {
    private String department;
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(int employeeId, String name, double baseSalary, int hoursWorked, double hourlyRate) {
        super(employeeId, name, baseSalary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + (hoursWorked * hourlyRate);
    }

    @Override
    public void assignDepartment(String deptName) {
        this.department = deptName;
    }

    @Override
    public String getDepartmentDetails() {
        return "Department: " + department;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.println(getDepartmentDetails());
        System.out.println("-------------------------");
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Creating employees
        FullTimeEmployee emp1 = new FullTimeEmployee(101, "Alice", 30000, 5000);
        emp1.assignDepartment("IT");

        PartTimeEmployee emp2 = new PartTimeEmployee(102, "Bob", 10000, 80, 200);
        emp2.assignDepartment("Support");

        // Polymorphism: list of employees
        Employee[] employees = {emp1, emp2};

        for (Employee e : employees) {
            e.displayDetails();
        }
    }
}
