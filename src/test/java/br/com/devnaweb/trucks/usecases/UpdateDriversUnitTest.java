package br.com.devnaweb.trucks.usecases;

import br.com.devnaweb.trucks.entities.Driver;
import br.com.devnaweb.trucks.exceptions.DriverNotFoundException;
import br.com.devnaweb.trucks.fixtures.DriverFixture;
import br.com.devnaweb.trucks.repositories.DriverRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;

@SpringBootTest
public class UpdateDriversUnitTest {

    @InjectMocks
    private UpdateDrivers updateDrivers;

    @Mock
    private DriverRepository driverRepository;

    @Mock
    private CreateLocale createLocale;

    private Driver driver;

    @BeforeEach
    void setUp() {
        driver = DriverFixture.defaultValues();

        Optional<Driver> driver1 = Optional.ofNullable(driver);

        when(driverRepository.save(any())).thenReturn(driver);
        when(driverRepository.findById(anyLong())).thenReturn(driver1);
    }

    @Test
    @DisplayName("Deve ser possível atualizar os dados do caminhoneiro.")
    void shouldUpdateDriver() {
        final Driver savedDriver = updateDrivers.execute(1L, driver);

        assertThat(savedDriver.getName(), is(driver.getName()));
        assertThat(savedDriver.getAge(), is(driver.getAge()));
        assertThat(savedDriver.getDriversLicenseType(), is(driver.getDriversLicenseType()));
        assertThat(savedDriver.getGender(), is(driver.getGender()));
        assertThat(savedDriver.getTruckType(), is(driver.getTruckType()));
        assertThat(savedDriver.getCreationDate(), is(driver.getCreationDate()));
        assertThat(savedDriver.getLastUpdateDate(), is(driver.getLastUpdateDate()));
        assertThat(savedDriver.isHasOwnTruck(), is(driver.isHasOwnTruck()));
        assertThat(savedDriver.isLoaded(), is(driver.isHasOwnTruck()));
    }

    @Test
    @DisplayName("Deve ser lançada uma excessão quando não for encontrado um motorista ao atualizar.")
    void shouldFailWhenDriverNotFound() {
        when(driverRepository.findById(anyLong())).thenThrow(new DriverNotFoundException());
        assertThrows(DriverNotFoundException.class, () -> {
            updateDrivers.execute(2L, driver);
        });
    }
}
