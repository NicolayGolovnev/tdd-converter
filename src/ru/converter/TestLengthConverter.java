package ru.converter;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestLengthConverter {
    private final Converter converter = new Converter();

    @Test
    public void converterLengthFromAmericanToRussian() {
        // 1 миля = 754,2857142857 сажень
        double expected = converter.getLengthFromRussian(2, 1);
        double result = 754.2857142857;
        assertEquals(expected, result, Math.abs(expected - result));

        // 5 миль = 3771,4285714286 сажень
        expected = converter.getLengthFromRussian(3, 5);
        result = 3_771.4285714286;
        assertEquals(expected, result, Math.abs(expected - result));

        // 121 миля = 91268,5714285714 сажень
        expected = converter.getLengthFromRussian(3, 121);
        result = 91_268.5714285714;
        assertEquals(expected, result, Math.abs(expected - result));
    }

    @Test
    public void converterLengthFromAmericanToInternational() {
        // 1 миля = 1_609.34м
        double expected = converter.getLengthFromRussian(3, 1);
        double result = 1_609.34;
        assertEquals(expected, result, Math.abs(expected - result));

        // 5 миль = 8_046.7м
        expected = converter.getLengthFromRussian(3, 5);
        result = 8_046.7;
        assertEquals(expected, result, Math.abs(expected - result));

        // 121 миля = 194_730.14м
        expected = converter.getLengthFromRussian(3, 121);
        result = 194_730.14;
        assertEquals(expected, result, Math.abs(expected - result));
    }

    @Test
    public void converterLengthFromAmericanToSame() {
        assertEquals(converter.getLengthFromAmerican(1, 1), 1, 0);
        assertEquals(converter.getLengthFromAmerican(1, 5), 5, 0);
        assertEquals(converter.getLengthFromAmerican(1, 121), 121, 0);
    }

    @Test
    public void converterLengthFromRussianToAmerican() {
        double expected = converter.getLengthFromRussian(1, 1);
        double result = 0.001326;
        assertEquals(expected, result, Math.abs(expected - result));

        expected = converter.getLengthFromRussian(1, 99);
        result = 0.131278;
        assertEquals(expected, result, Math.abs(expected - result));
    }

    @Test
    public void converterLengthFromRussianToInternational() {
        double expected = converter.getLengthFromAmerican(3, 1);
        double result = 2.1336;
        assertEquals(expected, result, Math.abs(expected - result));

        expected = converter.getLengthFromAmerican(3, 99);
        result = 211.2264;
        assertEquals(expected, result, Math.abs(expected - result));
    }

    @Test
    public void converterLengthFromRussianToSame() {
        double value = 1;
        double expected = converter.getLengthFromRussian(2, value);
        assertEquals(expected, value, Math.abs(expected - value));

        value = 0.131278;
        expected = converter.getLengthFromRussian(2, value);
        assertEquals(expected, value, Math.abs(expected - value));
    }

    @Test
    public void converterLengthFromInternationalToAmerican() {
        double expected = converter.getLengthFromInternational(1, 1);
        double result = 0.00062137119;
        assertEquals(expected, result, Math.abs(expected - result));

        expected = converter.getLengthFromInternational(1, 99);
        result = 0.06151574803;
        assertEquals(expected, result, Math.abs(expected - result));
    }

    @Test
    public void converterLengthFromInternationalToRussian() {
        double expected = converter.getLengthFromInternational(2, 1);
        double result = 0.46869141357;
        assertEquals(expected, result, Math.abs(expected - result));

        expected = converter.getLengthFromInternational(2, 99);
        result = 46.40044994376;
        assertEquals(expected, result, Math.abs(expected - result));
    }

    @Test
    public void converterLengthFromInternationalToSame() {
        double value = 1;
        double expected = converter.getLengthFromInternational(3, value);
        assertEquals(expected, value, Math.abs(expected - value));

        value = 0.131278;
        expected = converter.getLengthFromInternational(3, value);
        assertEquals(expected, value, Math.abs(expected - value));
    }
}
