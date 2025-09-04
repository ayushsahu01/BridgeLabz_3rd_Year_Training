public class Q1_Employee {
    // non-static variables
    String name;
    int id;
    double salary;

    // Constructor
    Q1_Employee(String name, int id,double salary){
		this.name=name;
		this.id=id;
		this.salary=salary;
	}

    // creating method to display employee details
    public void displayEmployee() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee id: " + id);
        System.out.println("Employee Salary: " + salary);
    }

    public static void main(String[] args) {
        Q1_Employee emp = new Q1_Employee("Ayush", 1, 1000000);// calling constructor
        emp.displayEmployee();// calling the display method
    }

}
