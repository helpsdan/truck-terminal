package br.com.devnaweb.trucks.utils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class DateUtilsUnitTest {

    @Test
    @DisplayName("Deve ser possível retornar a data de hoje.")
    void shouldGetDateToday() {
        assertNotNull(DateUtils.getDateToday());
    }

    @Test
    @DisplayName("Deve ser possível retornar o primeiro dia dessa semana.")
    void shouldGetFirstDayThisWeek() {
        assertNotNull(DateUtils.getDateFirstDayThisWeek());
    }

    @Test
    @DisplayName("Deve ser possível retornar o primeiro dia desse mês.")
    void shouldGetFirstDayThisMonth() {
        assertNotNull(DateUtils.getDateFirstDayOfTheMonth());
    }
}
