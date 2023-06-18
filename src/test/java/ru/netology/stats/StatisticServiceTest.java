package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatisticServiceTest {
    @Test
    void shouldCalculateTotalSales() {
        StatisticService service = new StatisticService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.calculateTotalSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateAverageSales() {
        StatisticService service = new StatisticService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double expected = 15;
        double actual = service.calculateAverageSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMaxSalesMonth() {
        StatisticService service = new StatisticService();
        long[] sales = {8, 15, 13, 15, 17, 20, 7, 14, 14, 18};
        int expected = 6;
        int actual = service.findMaxSalesMonth(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMinSalesMonth() {
        StatisticService service = new StatisticService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.findMinSalesMonth(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateBelowAverageSales() {
        StatisticService service = new StatisticService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.calculateBelowAverageSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateAboveAverageSales() {
        StatisticService service = new StatisticService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.calculateAboveAverageSales(sales);
        assertEquals(expected, actual);
    }
}