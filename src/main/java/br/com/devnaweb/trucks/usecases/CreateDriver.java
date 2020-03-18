package br.com.devnaweb.trucks.usecases;

import br.com.devnaweb.trucks.entities.Driver;
import br.com.devnaweb.trucks.repositories.DriverRepository;
import br.com.devnaweb.trucks.utils.DateUtils;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CreateDriver {

    @Autowired
    private CreateLocale createLocale;

    @Autowired
    private DriverRepository driverRepository;

    public Driver execute(final Driver driver) {
        final Driver savedDriver = driverRepository.save(createDriver(driver));

        createLocale.execute(driver.getLocales(), savedDriver.getId());

        return savedDriver;
    }

    private Driver createDriver(final Driver driver) {
        return Driver.builder()
                .name(driver.getName())
                .age(driver.getAge())
                .driversLicenseType(driver.getDriversLicenseType())
                .hasOwnTruck(driver.isHasOwnTruck())
                .gender(driver.getGender())
                .isLoaded(driver.isLoaded())
                .truckType(driver.getTruckType())
                .lastUpdateDate(DateUtils.getDateToday())
                .creationDate(DateUtils.getDateToday())
                .build();
    }
}
