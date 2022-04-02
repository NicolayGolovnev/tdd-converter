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
}
