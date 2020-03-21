package br.com.devnaweb.trucks.utils;

import java.sql.Timestamp;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DateUtils {

    public static Timestamp getDateToday() {
        return Timestamp.valueOf(getLocalDateTimeNow());
    }

    public static Timestamp getFirstHourThisDay() {
        return Timestamp.valueOf(getLocalDateTimeNow().minus(getLocalDateTimeNow().getHour(), ChronoUnit.HOURS));
    }

    public static Timestamp getDateFirstDayThisWeek() {
        return Timestamp.valueOf(getDayOfWeek(getLocalDateTimeNow().getDayOfWeek()));
    }

    public static Timestamp getDateFirstDayOfTheMonth() {
        return Timestamp.valueOf(getLocalDateTimeNow().minus(getLocalDateTimeNow().getDayOfMonth() - 1, ChronoUnit.DAYS));
    }

    private static LocalDateTime getDayOfWeek(final DayOfWeek dayOfWeek) {
        if (DayOfWeek.MONDAY.equals(dayOfWeek)) {
            return getDay(0);
        } else if (DayOfWeek.TUESDAY.equals(dayOfWeek)) {
            return getDay(1);
        } else if (DayOfWeek.WEDNESDAY.equals(dayOfWeek)) {
            return getDay(2);
        } else if (DayOfWeek.THURSDAY.equals(dayOfWeek)) {
            return getDay(3);
        } else if (DayOfWeek.FRIDAY.equals(dayOfWeek)) {
            return getDay(4);
        } else if (DayOfWeek.SATURDAY.equals(dayOfWeek)) {
            return getDay(5);
        } else {
            return getDay(6);
        }
    }

    private static LocalDateTime getDay(final int lessDays) {
        return getLocalDateTimeNow().minus(lessDays, ChronoUnit.DAYS);
    }

    private static LocalDateTime getLocalDateTimeNow() {
        return LocalDateTime.now();
    }
}
