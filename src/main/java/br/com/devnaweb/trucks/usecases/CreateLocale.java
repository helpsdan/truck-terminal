package br.com.devnaweb.trucks.usecases;

import br.com.devnaweb.trucks.entities.Locale;
import br.com.devnaweb.trucks.repositories.LocaleRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CreateLocale {

    @Autowired
    private LocaleRepository localeRepository;

    public void execute(final List<Locale> locales, final Long driverId) {
        locales.forEach(locale -> {
            locale.setDriverId(driverId);
            localeRepository.save(locale);
        });
    }
}

