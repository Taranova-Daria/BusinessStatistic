package ru.netology.stats;

public class Main {
    public static void main(String[] args) {
        ru.netology.stats.StatisticService service = new ru.netology.stats.StatisticService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        System.out.println("Общая сумма " + service.calculateTotalSales(sales));
        System.out.println("Средний показатель " + service.calculateAverageSales(sales));
        System.out.println("Максимальная сумма продажи " + service.findMaxSalesMonth(sales));
        System.out.println("Минимальная сумма продажи " + service.findMinSalesMonth(sales));
        System.out.println("Сумма  ниже среднего " + service.calculateBelowAverageSales(sales));
        System.out.println("Сумма  выше среднего " + service.calculateAboveAverageSales(sales));
    }
}