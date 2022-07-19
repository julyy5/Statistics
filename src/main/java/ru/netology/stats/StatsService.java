package ru.netology.stats;

public class StatsService {
    public long sumOfSales(long[] sales) {
        int sum=0;
        for (long sale:sales
             ) {
            sum += sale;

        }
        return sum;
    }

    public long mediumSaleOfMonth(long[] sales) {
        return sumOfSales(sales)/12;
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
        int count = 0;
        for (long sale : sales) {
            if (sale < mediumSaleOfMonth(sales)) {
                count++;
            }
        }
        return count;
    }

    public int maxOfMedium(long[] sales) {
        int count = 0;
        for (long sale : sales) {
            if (sale > mediumSaleOfMonth(sales)) {
                count++;
            }
        }
        return count;
    }

}

