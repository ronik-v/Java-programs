package com.company;

import java.util.Scanner;

class TemperatureConversion {
    public double some_temperature;

    TemperatureConversion(double some_temperature) {
        this.some_temperature = some_temperature;
    }

    public double FahrenheitToCelsius (double some_temperature) {
        return (some_temperature - 32) / 1.8;
    }

    public double CelsiusToFahrenheit (double some_temperature) {
        return (some_temperature * 1.8) + 32;
    }

}

public class Main {
    public static void Choice (String temp_choice, Double tmp) {
        com.company.TemperatureConversion temperatureConversion = new com.company.TemperatureConversion(tmp);
        if (temp_choice.equals("C")) {
            System.out.println("FahrenheitToCelsius = " + temperatureConversion.FahrenheitToCelsius(tmp));
        }
        if (temp_choice.equals("F")) {
            System.out.println("CelsiusToFahrenheit = " + temperatureConversion.CelsiusToFahrenheit(tmp));
        } else {
            System.out.println("You enter not Celsius/Fahrenheit type...");
        }
    }
    public static void main(String[] args) {
        System.out.println("If you want translate Fahrenheit temperature to Celsius enter (\"C\")\n" +
                "If you want translate Celsius temperature to Fahrenheit enter (\"F\") ");
        System.out.print("Enter Some Temperature: ");
        Scanner scan = new Scanner(System.in);
        Double tmp = scan.nextDouble();
        System.out.print("Enter type of temperature: ");
        String temp_choice = scan.next();
        Choice(temp_choice, tmp);
        scan.close();
    }
}
