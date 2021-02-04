package br.com.devnaweb.trucks.usecases;

import br.com.devnaweb.trucks.entities.Driver;
import br.com.devnaweb.trucks.fixtures.DriverFixture;
import br.com.devnaweb.trucks.repositories.DriverRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@SpringBootTest
public class CreateDriverUnitTest {

    @InjectMocks
    private CreateDriver createDriver;

    @Mock
    private CreateLocale createLocale;

    @Mock
    private DriverRepository driverRepository;

    private Driver driver;

    @BeforeEach
    void setUp() {
        driver = DriverFixture.defaultValues();

        when(driverRepository.save(any())).thenReturn(driver);
    }

    @Test
    @DisplayName("Should create a truck driver")
    void shouldCreateDriver() {
        final Driver savedDriver = createDriver.execute(driver);

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
}
