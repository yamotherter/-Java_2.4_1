package ru.netology.stats;
import static java.util.Arrays.stream;

public class StatsService {

    // Сумма всех продаж
    public long salesSum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    // Средние продажи в месяц
    public double averageMonth(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return (double) sum / sales.length;
    }

    // Номер месяца, в котором был минимум продаж (осуществлены продажи на минимальную сумму)*
    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month += 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }


    // Номер месяца, в котором был пик продаж (осуществлены продажи на максимальную сумму)*
    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[maxMonth] - продажи в месяце maxMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month += 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    // Кол-во месяцев, в которых продажи были ниже среднего (см. п.2)
    public int lessAverageCount(long[] sales) {
        int lessAverageMonth = 0;
        double average = stream(sales).sum() / sales.length;
        for (long sale : sales) {
            if (sale < average) {
                lessAverageMonth += 1; }}
        return lessAverageMonth;
    }

    // Кол-во месяцев, в которых продажи были выше среднего (см. п.2)
    public int overThanAverage(long[] sales) {
         int overAverageMonth = 0;
         double average = stream(sales).sum() / sales.length;
         for (long sale : sales) {
             if (sale > average) {
            overAverageMonth += 1; }}
        return overAverageMonth;
   }
}














