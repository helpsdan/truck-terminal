package br.com.devnaweb.trucks.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Getter
@Builder
public class TruckReport {

    private int today;
    private int week;
    private int month;
}
