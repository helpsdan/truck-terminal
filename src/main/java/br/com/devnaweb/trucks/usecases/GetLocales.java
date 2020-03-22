package br.com.devnaweb.trucks.usecases;

import br.com.devnaweb.trucks.entities.Locales;
import br.com.devnaweb.trucks.entities.enums.LocaleType;
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
                .origin(localeRepository.findAll().stream().filter(locale -> LocaleType.ORIGIN.equals(locale.getLocaleType())).collect(Collectors.toList()))
                .destiny(localeRepository.findAll().stream().filter(locale -> LocaleType.DESTINY.equals(locale.getLocaleType())).collect(Collectors.toList()))
                .build();
    }
}
