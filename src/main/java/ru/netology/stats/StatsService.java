package ru.netology.stats;

public class StatsService {
    public int sum(int[] purchases) {
        int sum = 0;
        for (int purchase : purchases) {
            sum += purchase;
        }
        return sum;
    }

    public int average(int[] purchases) {
        int sum = sum(purchases);
        int average = sum / purchases.length;
        return average;
    }

    public int peakMonth(int[] purchases) {
        int peak = purchases[0];
        for (int purchase : purchases) {
            if (purchase > peak) {
                peak = purchase;
            }
        }
        int count = 0;
        int monthCount = 0;
        for (int purchase : purchases) {
            monthCount++;
            if (peak == purchase) {
                count = monthCount;
            }
        }
        return count;
    }

    public int minMonth(int[] purchases) {
        int min = purchases[0];
        for (int purchase : purchases) {
            if (purchase < min) {
                min = purchase;
            }
        }
        int count = 0;
        int monthCount = 0;
        for (int purchase : purchases) {
            monthCount++;
            if (min == purchase) {
                count = monthCount;
            }
        }
        return count;
    }


    public int shouldBelowAverage(int[] purchases) {
        int monthCount = 0;
        int average = average(purchases);
        for (int purchase : purchases) {
            if (average > purchase) {
                monthCount++;
            }
        }
        return monthCount;
    }

    public int shouldAboveAverage(int[] purchases) {
        int monthCount = 0;
        int average = average(purchases);
        for (int purchase : purchases) {
            if (average < purchase) {
                monthCount++;
            }
        }
        return monthCount;
    }
}

