package br.com.devnaweb.trucks.entities.enums;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum LocaleType {

    ORIGIN("ORIGIN"), DESTINY("DESTINY");
    private String value;

    LocaleType(final String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

    @JsonCreator
    public static LocaleType fromValue(final String text) {
        for (LocaleType g : LocaleType.values()) {
            if (String.valueOf(g.value).equalsIgnoreCase(text)) {
                return g;
            }
        }
        return null;
    }
}
