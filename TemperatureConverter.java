package mypackage;
import java.util.Scanner;

public class TemperatureConverter {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    // Display menu
    System.out.println("Select the input temperature unit:");
    System.out.println("1. Celsius");
    System.out.println("2. Fahrenheit");
    System.out.println("3. Kelvin");
    System.out.print("Enter your choice (1-3): ");
    
    int choice = scanner.nextInt();
    double inputTemp, celsius, fahrenheit, kelvin;
    
    switch (choice) {
        case 1: // Celsius to Fahrenheit & Kelvin
            System.out.print("Enter temperature in Celsius: ");
            inputTemp = scanner.nextDouble();
            fahrenheit = (inputTemp * 9 / 5) + 32;
            kelvin = inputTemp + 273.15;
            System.out.println("Fahrenheit: " + fahrenheit);
            System.out.println("Kelvin: " + kelvin);
            break;

        case 2: // Fahrenheit to Celsius & Kelvin
            System.out.print("Enter temperature in Fahrenheit: ");
            inputTemp = scanner.nextDouble();
            celsius = (inputTemp - 32) * 5 / 9;
            kelvin = celsius + 273.15;
            System.out.println("Celsius: " + celsius);
            System.out.println("Kelvin: " + kelvin);
            break;

        case 3: // Kelvin to Celsius & Fahrenheit
            System.out.print("Enter temperature in Kelvin: ");
            inputTemp = scanner.nextDouble();
            celsius = inputTemp - 273.15;
            fahrenheit = (celsius * 9 / 5) + 32;
            System.out.println("Celsius: " + celsius);
            System.out.println("Fahrenheit: " + fahrenheit);
            break;

        default:
            System.out.println("Invalid choice! Please enter 1, 2, or 3.");
    }

    scanner.close();
}
}