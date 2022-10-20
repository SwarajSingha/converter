package com.example.weatherapp;



import static com.example.weatherapp.Manager.celsius;
import static com.example.weatherapp.Manager.fahrenheit;
import static com.example.weatherapp.Manager.kelvin;
import static com.example.weatherapp.Manager.rankine;

public class TemperatureConvert {

    public static double convertTemperatureValue(double value, Unit from, Unit to) {
        double result = value;

        if (celsius.equals(to)) {
            result = toCelsius(from, value);
        } else if (fahrenheit.equals(to)) {
            result = toFahrenheit(from, value);
        } else if (kelvin.equals(to)) {
            result = toKelvin(from, value);
        } else if (rankine.equals(to)) {
            result = toRankine(from, value);
        }
        return result;
    }

    private static double toCelsius(Unit fromId, double value) {
        double result = value;

        if (fahrenheit.equals(fromId)) {    // F to C
            result = (value - 32) * 5 / 9;
        } else if (kelvin.equals(fromId)) {    // K to C
            result = value - 273.15;
        } else if (rankine.equals(fromId)) {    // R to C
            result = (value - 491.67) * 5 / 9;

        }

        return result;
    }
    private static double toFahrenheit(Unit fromId, double value) {
        double result = value;

        if (celsius.equals(fromId)) {    // C to F
            result = value * 9 / 5 + 32;
        } else if (kelvin.equals(fromId)) {    // K to F
            result = value * 9 / 5 - 459.67;
        } else if (rankine.equals(fromId)) {    // R to F
            result = value - 459.67;

        }

        return result;
    }
    private static double toKelvin(Unit fromId, double value) {
        double result = value;

        if (celsius.equals(fromId)) {    // C to K
            result = value + 273.15;
        } else if (fahrenheit.equals(fromId)) {    // F to K
            result = (value + 459.67) * 5 / 9;
        } else if (rankine.equals(fromId)) {    // R to K
            result = value * 5 / 9;

        }

        return result;
    }
    private static double toRankine(Unit fromId, double value) {
        double result = value;

        if (celsius.equals(fromId)) {    // C to R
            result = (value + 273.15) * 9 / 5;
        } else if (fahrenheit.equals(fromId)) {    // F to R
            result = value + 459.67;
        } else if (kelvin.equals(fromId)) {    // K to R
            result = value * 9 / 5;

        }

        return result;
    }

}
