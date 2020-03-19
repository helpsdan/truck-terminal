package br.com.devnaweb.trucks.usecases;

import br.com.devnaweb.trucks.entities.Driver;
import br.com.devnaweb.trucks.exceptions.DriverNotFoundException;
import br.com.devnaweb.trucks.repositories.DriverRepository;
import br.com.devnaweb.trucks.utils.DateUtils;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UpdateDriver {

    @Autowired
    private CreateLocale createLocale;

    @Autowired
    private DriverRepository driverRepository;

    public Driver execute(final Long id, final Driver driver) {
        return driverRepository.save(updateDriver(id, driver));
    }

    private Driver updateDriver(final Long id, final Driver driver) {
        final Driver driverFromDatabase = driverRepository.findById(id).orElseThrow(DriverNotFoundException::new);
        driverFromDatabase.setName(driver.getName());
        driverFromDatabase.setAge(driver.getAge());
        driverFromDatabase.setLastUpdateDate(DateUtils.getDateToday());
        driverFromDatabase.setDriversLicenseType(driver.getDriversLicenseType());
        driverFromDatabase.setGender(driver.getGender());
        driverFromDatabase.setHasOwnTruck(driver.isHasOwnTruck());
        driverFromDatabase.setTruckType(driver.getTruckType());
        driverFromDatabase.setLoaded(driver.isLoaded());
        driverFromDatabase.setLocales(driver.getLocales());
        if (!driver.getLocales().isEmpty()) {
            createLocale.execute(driver.getLocales(), driverFromDatabase.getId());
        }
        return driverFromDatabase;
    }
}
