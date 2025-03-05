import it.utils.converter.*;

import java.util.Scanner;

public class TestConversion {
    public static void main(String[] args) {
        TemperatureConversion tc = new TemperatureConversion();
        double celsius;
        double fahrenheit;
        double kevin;
        System.out.print("celsius: ");
        celsius = new Scanner(System.in).nextDouble();
        System.out.println("Celsius to Fahrenheit: " +tc.celsiusToFahrenheit(celsius));
        System.out.println("Celsius to Kevin: " +tc.celsiusToKelvin(celsius));

        System.out.print("fahrenheit: ");
        fahrenheit = new Scanner(System.in).nextDouble();
        System.out.println("Fahrenheit to Celsius: " +tc.fahrenheitToCelsius(fahrenheit));
        System.out.println("Fahrenheit to Kelvin: " +tc.fahrenheitToKevin(fahrenheit));

        System.out.print("kevin: ");
        kevin = new Scanner(System.in).nextDouble();
        System.out.println("Kelvin to Celsius: " +tc.kevinToCelsius(kevin));
        System.out.println("Kelvin to Fahrenheit: " +tc.kevinToFahrenheit(kevin));


    }
}