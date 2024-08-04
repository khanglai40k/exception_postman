package com.devteria.identify_service.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
//@NoArgsConstructor
@AllArgsConstructor
public enum ErrorCode {

    USER_EXISTED(1001, "User existed");

    private final int code;
    private final String message;


}
