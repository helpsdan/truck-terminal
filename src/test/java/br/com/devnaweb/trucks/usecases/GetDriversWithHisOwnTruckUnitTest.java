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

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;

@SpringBootTest
public class GetDriversWithHisOwnTruckUnitTest {

    @InjectMocks
    private GetDriversWithHisOwnTruck getDriversWithHisOwnTruck;

    @Mock
    private DriverRepository driverRepository;

    @BeforeEach
    void setUp() {
        when(driverRepository.findAll()).thenReturn(DriverFixture.defaultListDrivers());
    }

    @Test
    @DisplayName("Should ger drivers with his own truck")
    void shouldGetDriverWithHisOwnTruck() {
        List<Driver> driversWithOwnTruck = getDriversWithHisOwnTruck.execute();

        assertThat(driversWithOwnTruck.size(), is(4));
    }
}
