package br.com.devnaweb.trucks.controllers;

import br.com.devnaweb.trucks.entities.Driver;
import br.com.devnaweb.trucks.entities.Locales;
import br.com.devnaweb.trucks.entities.TruckReport;
import br.com.devnaweb.trucks.fixtures.DriverFixture;
import br.com.devnaweb.trucks.fixtures.LocaleFixture;
import br.com.devnaweb.trucks.usecases.CreateDriver;
import br.com.devnaweb.trucks.usecases.CreateLocale;
import br.com.devnaweb.trucks.usecases.GetDriversNoCharge;
import br.com.devnaweb.trucks.usecases.GetDriversWithHisOwnTruck;
import br.com.devnaweb.trucks.usecases.GetLocales;
import br.com.devnaweb.trucks.usecases.GetTrucks;
import br.com.devnaweb.trucks.usecases.UpdateDriver;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;

import java.util.List;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
public class TruckControllerUnitTest extends AbstractControllerTest {

    @InjectMocks
    private TruckController truckController;

    @Mock
    private CreateDriver createDriver;

    @Mock
    private CreateLocale createLocale;

    @Mock
    private GetDriversNoCharge getDriversNoCharge;

    @Mock
    private GetDriversWithHisOwnTruck getDriversWithHisOwnTruck;

    @Mock
    private GetLocales getLocales;

    @Mock
    private GetTrucks getTrucks;

    @Mock
    private UpdateDriver updateDriver;

    @BeforeEach
    void setUp() {
        this.setUp(truckController);
    }

    @Test
    @DisplayName("Should create a truck driver")
    void shouldCreateDriver() throws Exception {
        final Driver driver = DriverFixture.defaultValues();
        when(createDriver.execute(any())).thenReturn(driver);

        mockMvc.perform(post("/api/truck/create")
                .contentType(MediaType.APPLICATION_JSON)
                .content(mapToJson(driver)))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.name").value("Daniel Aguiar"))
                .andExpect(jsonPath("$.age").value(22L))
                .andExpect(jsonPath("$.truckType").value("CHEST"))
                .andExpect(jsonPath("$.gender").value("MALE"))
                .andExpect(jsonPath("$.hasOwnTruck").value(true))
                .andExpect(jsonPath("$.driversLicenseType").value("D"))
                .andReturn();

        verify(createDriver, times(1)).execute(any());
    }

    @Test
    @DisplayName("Should get drivers without charge")
    void shouldGetDriversNoCharge() throws Exception {
        final List<Driver> drivers = DriverFixture.defaultListDriversNoCharge();
        when(getDriversNoCharge.execute()).thenReturn(drivers);
        mockMvc.perform(get("/api/truck/get-drivers-no-charge")
                .contentType(MediaType.APPLICATION_JSON)
                .content(mapToJson(drivers)))
                .andExpect(status().isOk())
                .andReturn();
        verify(getDriversNoCharge, times(1)).execute();
    }

    @Test
    @DisplayName("Should get drivers with his own truck")
    void shouldGetDriversWithHisOwnTruck() throws Exception {
        final List<Driver> drivers = DriverFixture.defaultListDriversWithHisOwnTruck();
        when(getDriversNoCharge.execute()).thenReturn(drivers);
        mockMvc.perform(get("/api/truck/get-driver-own-truck")
                .contentType(MediaType.APPLICATION_JSON)
                .content(mapToJson(drivers)))
                .andExpect(status().isOk())
                .andReturn();
        verify(getDriversWithHisOwnTruck, times(1)).execute();
    }

    @Test
    @DisplayName("Should get locales grouped by truck type")
    void shouldGetLocales() throws Exception {
        final Locales locales = Locales.builder()
                .destiny(LocaleFixture.defaultListLocales())
                .origin(LocaleFixture.defaultValues())
                .build();
        when(getLocales.execute()).thenReturn(locales);

        mockMvc.perform(get("/api/truck/get-locales-grouped")
                .contentType(MediaType.APPLICATION_JSON)
                .content(mapToJson(locales)))
                .andExpect(status().isOk())
                .andReturn();
        verify(getLocales, times(1)).execute();
    }

    @Test
    @DisplayName("Should get trucks")
    void shouldGetTrucks() throws Exception {
        final TruckReport truckReport = TruckReport.builder().today(10).week(234).month(1233).build();
        when(getTrucks.execute()).thenReturn(truckReport);
        mockMvc.perform(get("/api/truck/get-trucks-report")
                .contentType(MediaType.APPLICATION_JSON)
                .content(mapToJson(truckReport)))
                .andExpect(status().isOk())
                .andReturn();
        verify(getTrucks, times(1)).execute();

    }

    @Test
    @DisplayName("Should update truckss")
    void shouldUpdateDriver() throws Exception {
        final Driver driver = DriverFixture.defaultValues();
        when(updateDriver.execute(anyLong(), any())).thenReturn(driver);

        mockMvc.perform(put("/api/truck/update/" + 1L)
                .contentType(MediaType.APPLICATION_JSON)
                .content(mapToJson(driver)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name").value("Daniel Aguiar"))
                .andExpect(jsonPath("$.age").value(22L))
                .andExpect(jsonPath("$.truckType").value("CHEST"))
                .andExpect(jsonPath("$.gender").value("MALE"))
                .andExpect(jsonPath("$.hasOwnTruck").value(true))
                .andExpect(jsonPath("$.driversLicenseType").value("D"))
                .andReturn();

        verify(updateDriver, times(1)).execute(anyLong(), any());
    }
}
