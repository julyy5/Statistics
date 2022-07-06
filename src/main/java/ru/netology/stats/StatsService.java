package ru.netology.stats;

public class StatsService {
    public long sumOfSales(long[] sales) {
        long sum = sales[0] + sales[1] + sales[2] + sales[3] + sales[4] + sales[5] + sales[6] + sales[7] + sales[8] + sales[9] + sales[10] + sales[11];
        return sum;
    }

    public long mediumSaleOfMonth(long[] sales) {
        long sum = (sales[0] + sales[1] + sales[2] + sales[3] + sales[4] + sales[5] + sales[6] + sales[7] + sales[8] + sales[9] + sales[10] + sales[11]) / 12;
        return sum;
    }

    public long maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public long minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public long minOfMedium(long[] sales) {
        long sum = (sales[0] + sales[1] + sales[2] + sales[3] + sales[4] + sales[5] + sales[6] + sales[7] + sales[8] + sales[9] + sales[10] + sales[11]) / 12;
        int count = 0;
        for (long sale : sales) {
            if (sale < sum) {
                count++;
            }
        }
        return count;
    }

    public int maxOfMedium(long[] sales) {
        long sum = (sales[0] + sales[1] + sales[2] + sales[3] + sales[4] + sales[5] + sales[6] + sales[7] + sales[8] + sales[9] + sales[10] + sales[11]) / 12;
        int count = 0;
        for (long sale : sales) {
            if (sale > sum) {
                count++;
            }
        }
        return count;
    }

}

