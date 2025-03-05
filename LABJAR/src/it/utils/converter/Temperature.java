package it.utils.converter;

public interface Temperature {
    public double celsiusToFahrenheit(double celsius);
    public double celsiusToKelvin(double celsius);
    public double fahrenheitToCelsius(double fahrenheit);
    public double fahrenheitToKevin(double fahrenheit);
    public double kevinToCelsius(double kelvin);
    public double kevinToFahrenheit(double kelvin);
}