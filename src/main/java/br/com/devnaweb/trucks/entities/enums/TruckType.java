package br.com.devnaweb.trucks.entities.enums;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum TruckType {

    CHEST("CHEST"), //Caminhão 3/4
    STUMP("STUMP"), //Caminhão Toco
    TRUCK("TRUCK"), //Caminhão Truck
    SIMPLE("SIMPLE"), //Carreta Simples
    EXTENDED_SHAFT("EXTENDED_SHAFT"); //Carreta Eixo Extendido

    private String value;

    TruckType(final String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

    @JsonCreator
    public static TruckType fromValue(final String text) {
        for (TruckType tt : TruckType.values()) {
            if (String.valueOf(tt.value).equalsIgnoreCase(text)) {
                return tt;
            }
        }
        return null;
    }
}
