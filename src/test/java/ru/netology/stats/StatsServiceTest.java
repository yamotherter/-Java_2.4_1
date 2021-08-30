package ru.netology.stats;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    // Входные данные для тестмрования
    long[] salesTest = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};


    @Test
     void salesSum() {
        StatsService service = new StatsService();
        // Ожидаемый результат
        long expected = Arrays.stream(salesTest).sum();
        // Вызываемый целевой метод
        long actual = service.salesSum(salesTest);
        //Производим проверку (сравнение ожиданий и факта)
        assertEquals(expected, actual);
    }

    @Test
    void averageMonth() {
        StatsService service = new StatsService();
        // Ожидаемый результат
        double expected = Arrays.stream(salesTest).sum() / salesTest.length;
        // Вызываемый целевой метод
        double actual = service.averageMonth(salesTest);
        //Производим проверку (сравнение ожиданий и факта)
        assertEquals(expected, actual);
    }

    @Test
    void minSales() {
        StatsService service = new StatsService();
        // Ожидаемый результат
        int expected = 9;
        // Вызываемый целевой метод
        int actual = service.minSales(salesTest);
        //Производим проверку (сравнение ожиданий и факта)
        assertEquals(expected, actual);
    }

    @Test
    void maxSales() {
        StatsService service = new StatsService();
        // Ожидаемый результат
        int expected = 8;
        // Вызываемый целевой метод
        int actual = service.maxSales(salesTest);
        //Производим проверку (сравнение ожиданий и факта)
        assertEquals(expected, actual);
    }

    @Test
    void lessAverageCount() {
        StatsService service = new StatsService();
        // Ожидаемый результат
        int expected = 5;
        // Вызываемый целевой метод
        int actual = service.lessAverageCount(salesTest);
        //Производим проверку (сравнение ожиданий и факта)
        assertEquals(expected, actual);
    }

    @Test
    void overThanAverage() {
        StatsService service = new StatsService();
        // Ожидаемый результат
        int expected = 5;
        // Вызываемый целевой метод
        int actual = service.overThanAverage(salesTest);
        //Производим проверку (сравнение ожиданий и факта)
        assertEquals(expected, actual);
    }
}
