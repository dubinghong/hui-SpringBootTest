package com.api.web;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TextException extends RuntimeException {
    private Integer code;
    private String message;
}
