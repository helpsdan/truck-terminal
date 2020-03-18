package br.com.devnaweb.trucks.usecases;

import br.com.devnaweb.trucks.entities.TruckReport;
import br.com.devnaweb.trucks.repositories.DriverRepository;
import br.com.devnaweb.trucks.utils.DateUtils;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class GetTrucks {

    @Autowired
    private DriverRepository driverRepository;

    public TruckReport execute() {
        return TruckReport.builder()
                .today(driverRepository.findAllByCreationDateBetween(DateUtils.getDateToday(),
                        DateUtils.getDateToday()).size())
                .week(driverRepository.findAllByCreationDateBetween(DateUtils.getDateFirstDayThisWeek(),
                        DateUtils.getDateToday()).size())
                .month(driverRepository.findAllByCreationDateBetween(DateUtils.getDateFirstDayOfTheMonth(),
                        DateUtils.getDateToday()).size())
                .build();
    }
}
