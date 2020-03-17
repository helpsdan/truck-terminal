package br.com.devnaweb.trucks.entities.enums;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum Gender {

    MALE("MALE"), FEMALE("FEMALE");
    private String value;

    Gender(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

    @JsonCreator
    public static Gender fromValue(String text) {
        for (Gender g : Gender.values()) {
            if (String.valueOf(g.value).equalsIgnoreCase(text)) {
                return g;
            }
        }
        return null;
    }
}
