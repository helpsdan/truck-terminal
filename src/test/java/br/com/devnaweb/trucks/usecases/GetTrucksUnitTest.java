package br.com.devnaweb.trucks.usecases;

import br.com.devnaweb.trucks.entities.TruckReport;
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
public class GetTrucksUnitTest {

    @InjectMocks
    private GetTrucks getTrucks;

    @Mock
    private DriverRepository driverRepository;

    @BeforeEach
    void setUp() {
        when(driverRepository.findAllByCreationDateBetween(any(), any())).thenReturn(DriverFixture.defaultListDrivers());
    }

    @Test
    @DisplayName("Deve ser possível retornar os caminhões agrupados por datas")
    void shouldGetTrucks() {
        final TruckReport truckReport = getTrucks.execute();

        assertThat(truckReport.getToday(), is(7));
        assertThat(truckReport.getWeek(), is(7));
        assertThat(truckReport.getMonth(), is(7));
    }
}
