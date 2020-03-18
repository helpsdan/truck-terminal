package br.com.devnaweb.trucks.usecases;

import br.com.devnaweb.trucks.entities.Locale;
import br.com.devnaweb.trucks.entities.Locales;
import br.com.devnaweb.trucks.repositories.LocaleRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class GetLocales {

    @Autowired
    private LocaleRepository localeRepository;

    public Locales execute() {
        return Locales.builder()
                .origin(localeRepository.findAll().stream().filter(Locale::isOrigin).collect(Collectors.toList()))
                .destiny(localeRepository.findAll().stream().filter(Locale::isDestiny).collect(Collectors.toList()))
                .build();
    }
}
