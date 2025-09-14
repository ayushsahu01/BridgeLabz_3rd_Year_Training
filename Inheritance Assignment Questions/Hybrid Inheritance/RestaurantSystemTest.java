// Superclass
class Person {
    String name;
    int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

// Interface
interface Worker {
    void performDuties(); // abstract method
}

// Subclass Chef
class Chef extends Person implements Worker {
    String specialty;

    Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    @Override
    public void performDuties() {
        System.out.println("Role: Chef");
        displayInfo();
        System.out.println("Specialty: " + specialty);
        System.out.println("Duties: Cooking delicious meals.");
        System.out.println("-------------------------");
    }
}

// Subclass Waiter
class Waiter extends Person implements Worker {
    int tablesAssigned;

    Waiter(String name, int id, int tablesAssigned) {
        super(name, id);
        this.tablesAssigned = tablesAssigned;
    }

    @Override
    public void performDuties() {
        System.out.println("Role: Waiter");
        displayInfo();
        System.out.println("Tables Assigned: " + tablesAssigned);
        System.out.println("Duties: Serving customers and taking orders.");
        System.out.println("-------------------------");
    }
}


public class RestaurantSystemTest {
    public static void main(String[] args) {
        Worker chef = new Chef("Alice Johnson", 101, "Italian Cuisine");
        Worker waiter = new Waiter("Bob Smith", 202, 5);

        // Demonstrating hybrid inheritance
        Worker[] workers = {chef, waiter};

        for (Worker w : workers) {
            w.performDuties();
        }
    }
}
