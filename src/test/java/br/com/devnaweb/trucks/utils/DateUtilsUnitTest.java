package br.com.devnaweb.trucks.utils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class DateUtilsUnitTest {

    @Test
    @DisplayName("Should get today date")
    void shouldGetDateToday() {
        assertNotNull(DateUtils.getDateToday());
    }

    @Test
    @DisplayName("Should get first day of this week")
    void shouldGetFirstDayThisWeek() {
        assertNotNull(DateUtils.getDateFirstDayThisWeek());
    }

    @Test
    @DisplayName("Should get first hour of this day")
    void shouldGetFirstHourThisDay() {
        assertNotNull(DateUtils.getFirstHourThisDay());
    }

    @Test
    @DisplayName("Should get first gay of this month")
    void shouldGetFirstDayThisMonth() {
        assertNotNull(DateUtils.getDateFirstDayOfTheMonth());
    }
}
