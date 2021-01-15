package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StatsServiceTest {
    int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    StatsService service = new StatsService();

    @Test
    void shouldSum() {
        assertEquals(180, service.sum(purchases));

    }
    @Test
    void shouldAverage() {
        assertEquals(15, service.average(purchases));
    }

    @Test
    void shouldPeakMonth() {
        assertEquals(8, service.peakMonth(purchases));
    }

    @Test
    void shouldMinMonth() {
        assertEquals(9, service.minMonth(purchases));
    }

    @Test
    void shouldBelowAverage() {
         assertEquals(5, service.shouldBelowAverage(purchases));
    }
    @Test
    void shouldAboveAverage() {
        int expected=5;
        int actual=service.shouldAboveAverage(purchases);
        assertEquals(5, service.shouldAboveAverage(purchases));
    }
}
