package br.com.devnaweb.trucks.exceptions;

import org.springframework.http.HttpStatus;

public class DriverNotFoundException extends BaseBusinessException {

    public DriverNotFoundException() {
        super(HttpStatus.NOT_FOUND, "Driver not found", false);
    }
}
