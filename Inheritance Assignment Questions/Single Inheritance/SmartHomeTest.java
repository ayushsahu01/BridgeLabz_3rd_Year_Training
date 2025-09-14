// Superclass Device
class Device {
    String deviceId;
    String status; // e.g., "ON", "OFF"

    // Constructor
    Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    // Method to display general device status
    void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
    }
}

// Subclass Thermostat
class Thermostat extends Device {
    double temperatureSetting; // in Celsius

    // Constructor
    Thermostat(String deviceId, String status, double temperatureSetting) {
        super(deviceId, status); // Call parent constructor
        this.temperatureSetting = temperatureSetting;
    }

    @Override
    void displayStatus() {
        super.displayStatus(); // Show general device info
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
        System.out.println("-------------------------");
    }
}

public class SmartHomeTest {
    public static void main(String[] args) {
        // Create Thermostat devices
        Thermostat t1 = new Thermostat("T1001", "ON", 22.5);
        Thermostat t2 = new Thermostat("T1002", "OFF", 18.0);

        // Display their status
        t1.displayStatus();
        t2.displayStatus();
    }
}
