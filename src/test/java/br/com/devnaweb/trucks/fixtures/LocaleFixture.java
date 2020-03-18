package br.com.devnaweb.trucks.fixtures;

import br.com.devnaweb.trucks.entities.Locale;

import java.util.Arrays;
import java.util.List;

public class LocaleFixture {
    public static List<Locale> defaultValues() {
        return Arrays.asList((Locale.builder()
                .origin(true)
                .destiny(false)
                .longitude(12312321312L)
                .latitude(31321312321L)
                .driverId(1L)
                .build()), (Locale.builder()
                .origin(false)
                .destiny(true)
                .longitude(31321312321L)
                .latitude(12312321312L)
                .driverId(1L)
                .build()));
    }

    public static List<Locale> defaultListLocales() {
        return Arrays.asList((Locale.builder()
                .origin(true)
                .destiny(false)
                .longitude(12312321312L)
                .latitude(31321312321L)
                .driverId(1L)
                .build()), (Locale.builder()
                .origin(true)
                .destiny(false)
                .longitude(12312321312L)
                .latitude(31321312321L)
                .driverId(1L)
                .build()), (Locale.builder()
                .origin(true)
                .destiny(false)
                .longitude(12312321312L)
                .latitude(31321312321L)
                .driverId(1L)
                .build()), (Locale.builder()
                .origin(false)
                .destiny(true)
                .longitude(31321312321L)
                .latitude(12312321312L)
                .driverId(1L)
                .build()), (Locale.builder()
                .origin(false)
                .destiny(true)
                .longitude(31321312321L)
                .latitude(12312321312L)
                .driverId(1L)
                .build()), (Locale.builder()
                .origin(false)
                .destiny(true)
                .longitude(31321312321L)
                .latitude(12312321312L)
                .driverId(1L)
                .build()));
    }
}
