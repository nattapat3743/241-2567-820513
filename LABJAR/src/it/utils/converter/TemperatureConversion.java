package it.utils.converter;

import java.util.Scanner;

public class TemperatureConversion implements Temperature{

    @Override
    public double celsiusToFahrenheit(double celsius) {
        return (celsius*1.8)+32;
    }

    @Override
    public double celsiusToKelvin(double celsius) {
        return (celsius + 273.15);
    }

    @Override
    public double fahrenheitToCelsius(double fahrenheit) {
        return ((fahrenheit-32)*5/9);
    }

    @Override
    public double fahrenheitToKevin(double fahrenheit) {
        return ((fahrenheit - 32) / 1.8) + 273.15;
    }

    @Override
    public double kevinToCelsius(double kelvin) {
        return (kelvin - 273.15);
    }

    @Override
    public double kevinToFahrenheit(double kelvin) {
        return ((kelvin - 273.15) * 1.8) + 32;
    }
}