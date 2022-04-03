package ru.converter;

import java.util.List;

public class Converter {
    private static final List<String> systems =
            List.of("Американская система", "Старорусская система", "Международная система");

    private static final List<String> units =
            List.of("Единица длины", "Единица массы");

    public List<String> getSystems() {
        return systems;
    }

    public List<String> getUnits() {
        return units;
    }

    public double getLengthFromAmerican(int toSystem, double value) {
        if (toSystem == 1)
            return value;

        if (toSystem == 2)
            return value * 1609.34 / 2.1336;
        else if (toSystem == 3)
            return value * 1609.34;
        else
            throw new RuntimeException("System doesn't exist for toSystem parameter");
    }

    public double getLengthFromRussian(int toSystem, double value) {
        if (toSystem == 2)
            return value;

        if (toSystem == 1)
            return value * 2.1336 / 1609;
        else if (toSystem == 3)
            return value * 2.1336;
        else
            throw new RuntimeException("System doesn't exist for toSystem parameter");
    }

    public double getLengthFromInternational(int toSystem, double value) {
        if (toSystem == 3)
            return value;

        if (toSystem == 1)
            return value / 1609.34;
        else if (toSystem == 2)
            return value / 2.1336;
        else
            throw new RuntimeException("System doesn't exist for toSystem parameter");
    }

    public double getWeightFromAmerican(int toSystem, double value) {
        if (toSystem == 1)
            return value;

        if (toSystem == 2)
            return value / 36.11278;
        else if (toSystem == 3)
            return value / 0.4536;
        else
            throw new RuntimeException("System doesn't exist for toSystem parameter");
    }

    public double getWeightFromRussian(int toSystem, double value) {
        if (toSystem == 2)
            return value;

        if (toSystem == 1)
            return value * 36.11278;
        else if (toSystem == 3)
            return value * 16.38;
        else
            throw new RuntimeException("System doesn't exist for toSystem parameter");
    }

    public double getWeightFromInternational(int toSystem, double value) {
        if (toSystem == 3)
            return value;

        if (toSystem == 1)
            return value / 0.4536;
        else if (toSystem == 2)
            return value / 16.38;
        else
            throw new RuntimeException("System doesn't exist for toSystem parameter");
    }
}
