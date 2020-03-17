package br.com.devnaweb.trucks.entities.enums;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum DriversLicenseType {

    A("A"), B("B"), C("C"), D("D"), E("E");

    private String value;

    DriversLicenseType(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

    @JsonCreator
    public static DriversLicenseType fromValue(String text) {
        for (DriversLicenseType dl : DriversLicenseType.values()) {
            if (String.valueOf(dl.value).equalsIgnoreCase(text)) {
                return dl;
            }
        }
        return null;
    }
}
