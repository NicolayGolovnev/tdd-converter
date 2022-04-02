package ru.converter;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Тестирование класса {@code Converter}
 * Для тестирования использовался следующий сайт: https://bbf.ru/converter/
 */
public class TestConverter {
    private final Converter converter = new Converter();

    @Test
    public void converterCreationTest() {
        assertNotNull(converter);
    }

    @Test
    public void converterCheckAllSystems() {
        assertEquals(3, converter.getSystems().size());
    }

    @Test
    public void converterCheckAllUnits() {
        assertEquals(2, converter.getUnits().size());
    }
}
