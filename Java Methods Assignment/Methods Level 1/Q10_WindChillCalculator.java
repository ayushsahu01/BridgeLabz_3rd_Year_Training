import java.util.*;

public class Q10_WindChillCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the temperature in Fahrenheit: ");
        double temperature = sc.nextDouble();

        System.out.print("Enter the wind speed in miles per hour: ");
        double windSpeed = sc.nextDouble();

        if (temperature <= 50 && windSpeed >= 3) {
            double windChill = calculateWindChill(temperature, windSpeed);
            System.out.println("The wind chill temperature is: " + windChill);
        } else {
            System.out.println("Formula is valid only if temperature <= 50°F and wind speed >= 3 mph.");
        }
        sc.close();
    }

    public static double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature
                + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }
}
