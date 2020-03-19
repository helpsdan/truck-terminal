package br.com.devnaweb.trucks.controllers;

import br.com.devnaweb.trucks.entities.Driver;
import br.com.devnaweb.trucks.entities.Locales;
import br.com.devnaweb.trucks.entities.TruckReport;
import br.com.devnaweb.trucks.usecases.CreateDriver;
import br.com.devnaweb.trucks.usecases.CreateLocale;
import br.com.devnaweb.trucks.usecases.GetDriversNoCharge;
import br.com.devnaweb.trucks.usecases.GetDriversWithHisOwnTruck;
import br.com.devnaweb.trucks.usecases.GetLocales;
import br.com.devnaweb.trucks.usecases.GetTrucks;
import br.com.devnaweb.trucks.usecases.UpdateDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/truck")
@Validated
public class TruckController {

    @Autowired
    private CreateDriver createDriver;

    @Autowired
    private CreateLocale createLocale;

    @Autowired
    private GetDriversNoCharge getDriversNoCharge;

    @Autowired
    private GetDriversWithHisOwnTruck getDriversWithHisOwnTruck;

    @Autowired
    private GetLocales getLocales;

    @Autowired
    private GetTrucks getTrucks;

    @Autowired
    private UpdateDriver updateDriver;

    @PostMapping("/create")
    public ResponseEntity<Driver> createDriver(@RequestBody final Driver driver) {
        return ResponseEntity.status(HttpStatus.CREATED).body(createDriver.execute(driver));
    }

    @GetMapping("/get-drivers-no-charge")
    public ResponseEntity<List<Driver>> getDriversNoCharge() {
        return ResponseEntity.status(HttpStatus.OK).body(getDriversNoCharge.execute());
    }

    @GetMapping("/get-driver-own-truck")
    public ResponseEntity<List<Driver>> getDriversWithHisOwnTruck() {
        return ResponseEntity.status(HttpStatus.OK).body(getDriversWithHisOwnTruck.execute());
    }

    @GetMapping("/get-locales-grouped")
    public ResponseEntity<Locales> getLocales() {
        return ResponseEntity.ok(getLocales.execute());
    }

    @GetMapping("/get-trucks-report")
    public ResponseEntity<TruckReport> getTrucks() {
        return ResponseEntity.ok(getTrucks.execute());
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Driver> updateDriver(@PathVariable final long id,
                                               @RequestBody final Driver driver) {
        return ResponseEntity.ok(updateDriver.execute(id, driver));
    }
}
