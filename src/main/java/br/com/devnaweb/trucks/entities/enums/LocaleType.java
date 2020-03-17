package br.com.devnaweb.trucks.entities.enums;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum LocaleType {

    ORIGIN("ORIGIN"), DESTINY("DESTINY");

    private String value;

    LocaleType(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

    @JsonCreator
    public static LocaleType fromValue(String text) {
        for (LocaleType lt : LocaleType.values()) {
            if (String.valueOf(lt.value).equalsIgnoreCase(text)) {
                return lt;
            }
        }
        return null;
    }
}
