package io.github.mochachess.data.rest.gateway.api;

import io.github.mochachess.data.domain.model.base.ErrorCode;
import lombok.Getter;

public class GatewayLogicException extends Exception {
    @Getter
    private final ErrorCode code;

    public GatewayLogicException(String message) {
        super(message);
        this.code = ErrorCode.UNKNOWN;
    }

    public GatewayLogicException(String message, ErrorCode errorCode) {
        super(message);
        this.code = errorCode;
    }
}
