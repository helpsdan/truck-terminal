package br.com.devnaweb.trucks.fixtures;

import br.com.devnaweb.trucks.entities.Locale;
import br.com.devnaweb.trucks.entities.enums.LocaleType;

import java.util.Arrays;
import java.util.List;

public class LocaleFixture {
    public static List<Locale> defaultValues() {
        return Arrays.asList((Locale.builder()
                .localeType(LocaleType.ORIGIN)
                .longitude(12312321312L)
                .latitude(31321312321L)
                .driverId(1L)
                .build()), (Locale.builder()
                .localeType(LocaleType.DESTINY)
                .longitude(31321312321L)
                .latitude(12312321312L)
                .driverId(1L)
                .build()));
    }

    public static List<Locale> defaultListLocales() {
        return Arrays.asList((Locale.builder()
                .localeType(LocaleType.ORIGIN)
                .longitude(12312321312L)
                .latitude(31321312321L)
                .driverId(1L)
                .build()), (Locale.builder()
                .localeType(LocaleType.ORIGIN)
                .longitude(12312321312L)
                .latitude(31321312321L)
                .driverId(1L)
                .build()), (Locale.builder()
                .localeType(LocaleType.ORIGIN)
                .longitude(12312321312L)
                .latitude(31321312321L)
                .driverId(1L)
                .build()), (Locale.builder()
                .localeType(LocaleType.DESTINY)
                .longitude(31321312321L)
                .latitude(12312321312L)
                .driverId(1L)
                .build()), (Locale.builder()
                .localeType(LocaleType.DESTINY)
                .longitude(31321312321L)
                .latitude(12312321312L)
                .driverId(1L)
                .build()), (Locale.builder()
                .localeType(LocaleType.DESTINY)
                .longitude(31321312321L)
                .latitude(12312321312L)
                .driverId(1L)
                .build()));
    }
}
