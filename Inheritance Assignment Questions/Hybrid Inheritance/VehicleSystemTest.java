// Superclass
class Vehicle {
    String model;
    int maxSpeed;

    Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    void displayInfo() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}

// Interface
interface Refuelable {
    void refuel(); // abstract method
}

// Subclass ElectricVehicle
class ElectricVehicle extends Vehicle {
    int batteryCapacity; // in kWh

    ElectricVehicle(String model, int maxSpeed, int batteryCapacity) {
        super(model, maxSpeed);
        this.batteryCapacity = batteryCapacity;
    }

    void charge() {
        System.out.println("Charging " + model + " with " + batteryCapacity + " kWh battery.");
    }

    @Override
    void displayInfo() {
        System.out.println("Electric Vehicle:");
        super.displayInfo();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
        System.out.println("-------------------------");
    }
}

// Subclass PetrolVehicle
class PetrolVehicle extends Vehicle implements Refuelable {
    int fuelTankCapacity; // in liters

    PetrolVehicle(String model, int maxSpeed, int fuelTankCapacity) {
        super(model, maxSpeed);
        this.fuelTankCapacity = fuelTankCapacity;
    }

    @Override
    public void refuel() {
        System.out.println("Refueling " + model + " with " + fuelTankCapacity + " liters tank.");
    }

    @Override
    void displayInfo() {
        System.out.println("Petrol Vehicle:");
        super.displayInfo();
        System.out.println("Fuel Tank Capacity: " + fuelTankCapacity + " liters");
        System.out.println("-------------------------");
    }
}

public class VehicleSystemTest {
    public static void main(String[] args) {
        ElectricVehicle tesla = new ElectricVehicle("Tesla Model 3", 250, 75);
        PetrolVehicle honda = new PetrolVehicle("Honda Civic", 220, 40);

        // Displaying details
        tesla.displayInfo();
        tesla.charge();

        honda.displayInfo();
        honda.refuel();

        // Polymorphism with superclass reference
        Vehicle[] vehicles = {tesla, honda};
        for (Vehicle v : vehicles) {
            v.displayInfo();
        }

        // Interface polymorphism
        Refuelable refuelableCar = honda;
        refuelableCar.refuel();
    }
}
