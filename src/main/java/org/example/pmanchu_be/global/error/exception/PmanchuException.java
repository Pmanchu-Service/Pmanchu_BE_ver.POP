package org.example.pmanchu_be.global.error.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class PmanchuException extends RuntimeException {
    private final ErrorCode errorCode;
}
