package ru.converter;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestWeightConverter {
    private final Converter converter = new Converter();

    @Test
    public void converterWeightFromAmericanToRussian() {
        // 1 фунт = ~0.0278 пудов
        double expected = converter.getWeightFromAmerican(2, 1);
        double result = 0.02769100297;
        assertEquals(expected, result, Math.abs(expected - result));

        expected = converter.getWeightFromAmerican(2, 5);
        result = 0.13845501486;
        assertEquals(expected, result, Math.abs(expected - result));

        expected = converter.getWeightFromAmerican(2, 121);
        result = 3.35061135961;
        assertEquals(expected, result, Math.abs(expected - result));
    }

    @Test
    public void converterWeightFromAmericanToInternational() {
        // 1 фунт = 0.4536 кг
        double expected = converter.getWeightFromAmerican(3, 1);
        double result = 0.4535923745;
        assertEquals(expected, result, Math.abs(expected - result));

        expected = converter.getWeightFromAmerican(3, 5);
        result = 2.26796187248;
        assertEquals(expected, result, Math.abs(expected - result));

        expected = converter.getWeightFromAmerican(3, 121);
        result = 54.88467731393;
        assertEquals(expected, result, Math.abs(expected - result));
    }

    @Test
    public void converterWeightFromAmericanToSame() {
        assertEquals(converter.getWeightFromAmerican(1, 1), 1, 0);
        assertEquals(converter.getWeightFromAmerican(1, 5), 5, 0);
        assertEquals(converter.getWeightFromAmerican(1, 121), 121, 0);
    }

    @Test
    public void converterWeightFromRussianToAmerican() {
        // 1 пуд = ~36.11278 фунтов
        double expected = converter.getWeightFromRussian(1, 1);
        double result = 0.001326;
        assertEquals(expected, result, Math.abs(expected - result));

        expected = converter.getWeightFromRussian(1, 99);
        result = 3_575.1684437032;
        assertEquals(expected, result, Math.abs(expected - result));
    }

    @Test
    public void converterWeightFromRussianToInternational() {
        // 1 пуд = 13.38 кг
        double expected = converter.getWeightFromRussian(3, 1);
        double result = 16.3804964;
        assertEquals(expected, result, Math.abs(expected - result));

        expected = converter.getWeightFromRussian(3, 99);
        result = 218.2576374;
        assertEquals(expected, result, Math.abs(expected - result));
    }

    @Test
    public void converterWeightFromRussianToSame() {
        double value = 1;
        double expected = converter.getWeightFromRussian(2, value);
        assertEquals(expected, value, Math.abs(expected - value));

        value = 0.131278;
        expected = converter.getWeightFromRussian(2, value);
        assertEquals(expected, value, Math.abs(expected - value));
    }

    @Test
    public void converterWeightFromInternationalToAmerican() {
        // 1 кг = 2.2 фунта
        double expected = converter.getWeightFromInternational(1, 1);
        double result = 2.2046226;
        assertEquals(expected, result, Math.abs(expected - result));

        expected = converter.getWeightFromInternational(1, 99);
        result = 218.2576374;
        assertEquals(expected, result, Math.abs(expected - result));
    }

    @Test
    public void converterWeightFromInternationalToRussian() {
        // 1 кг = 0.061 пуда
        double expected = converter.getWeightFromInternational(2, 1);
        double result = 0.06104821097;
        assertEquals(expected, result, Math.abs(expected - result));

        expected = converter.getWeightFromInternational(2, 99);
        result = 6.04377288591;
        assertEquals(expected, result, Math.abs(expected - result));
    }

    @Test
    public void converterWeightFromInternationalToSame() {
        double value = 1;
        double expected = converter.getWeightFromInternational(3, value);
        assertEquals(expected, value, Math.abs(expected - value));

        value = 0.131278;
        expected = converter.getWeightFromInternational(3, value);
        assertEquals(expected, value, Math.abs(expected - value));
    }
}
