package com.api.web;

import lombok.Data;

@Data
public class TestBadRequestException extends RuntimeException {
    private String message;

    public TestBadRequestException(String message) {
        this.message = message;
    }

}
