package br.com.devnaweb.trucks.fixtures;

import br.com.devnaweb.trucks.entities.Driver;
import br.com.devnaweb.trucks.entities.enums.DriversLicenseType;
import br.com.devnaweb.trucks.entities.enums.Gender;
import br.com.devnaweb.trucks.entities.enums.TruckType;
import br.com.devnaweb.trucks.utils.DateUtils;

import java.util.Arrays;
import java.util.List;

public class DriverFixture {
    public static Driver defaultValues() {
        return Driver.builder()
                .name("Daniel Aguiar")
                .age(22L)
                .truckType(TruckType.CHEST)
                .isLoaded(true)
                .gender(Gender.MALE)
                .hasOwnTruck(true)
                .driversLicenseType(DriversLicenseType.D)
                .lastUpdateDate(DateUtils.getDateToday())
                .creationDate(DateUtils.getDateToday())
                .locales(LocaleFixture.defaultValues())
                .id(1L)
                .build();
    }

    public static List<Driver> defaultListDrivers() {
        return Arrays.asList(
                defaultDriver(1L, true, true),
                (defaultDriver(2L, true, false)),
                (defaultDriver(3L, false, true)),
                (defaultDriver(4L, false, false)),
                (defaultDriver(5L, false, true)),
                (defaultDriver(6L, true, false)),
                (defaultDriver(7L, true, true)));
    }

    private static Driver defaultDriver(final long id, final boolean loaded, final boolean ownTruck) {
        return Driver.builder()
                .name("Daniel Aguiar")
                .age(22L)
                .truckType(TruckType.CHEST)
                .isLoaded(loaded)
                .gender(Gender.MALE)
                .hasOwnTruck(ownTruck)
                .driversLicenseType(DriversLicenseType.D)
                .lastUpdateDate(DateUtils.getDateToday())
                .creationDate(DateUtils.getDateToday())
                .locales(LocaleFixture.defaultValues())
                .id(id)
                .build();
    }
}
