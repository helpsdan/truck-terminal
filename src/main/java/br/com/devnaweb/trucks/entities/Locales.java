package br.com.devnaweb.trucks.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
@Builder
public class Locales {

    private List<Locale> origin;
    private List<Locale> destiny;
}
