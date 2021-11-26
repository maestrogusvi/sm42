package com.ut.sm42.exception;

import org.springframework.http.HttpStatus;

public class BusinessException extends Throwable {
    public BusinessException(String s, HttpStatus unauthorized, int i) {
    }
}
