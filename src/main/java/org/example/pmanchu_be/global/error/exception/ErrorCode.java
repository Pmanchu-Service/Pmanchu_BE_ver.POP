package org.example.pmanchu_be.global.error.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ErrorCode {
    USER_NOT_FOUND(400,"USER-400-1","일치하는 유저를 찾을 수 없습니다.");

    private final int httpStatus;
    private final String code;
    private final String message;
}
