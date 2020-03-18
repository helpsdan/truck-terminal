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
public class GetDriversNoChargeUnitTest {

    @InjectMocks
    private GetDriversNoCharge getDriversNoCharge;

    @Mock
    private DriverRepository driverRepository;

    @BeforeEach
    void setUp() {
        when(driverRepository.findAll()).thenReturn(DriverFixture.defaultListDrivers());
    }

    @Test
    @DisplayName("Deve ser possível retornar os caminhoneiros que estão sem carga.")
    void shouldGetDriversNoCharge() {
        List<Driver> driversNoCharge = getDriversNoCharge.execute();

        assertThat(driversNoCharge.size(), is(3));
    }
}
