package br.com.devnaweb.trucks.usecases;

import br.com.devnaweb.trucks.entities.Driver;
import br.com.devnaweb.trucks.repositories.DriverRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class GetDriversNoCharge {

    @Autowired
    private DriverRepository driverRepository;

    public List<Driver> execute() {
        return driverRepository.findAll().stream().filter(driver -> !driver.isLoaded()).collect(Collectors.toList());
    }
}
