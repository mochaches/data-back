package io.github.mochachess.data.provider.proxy.api;

import io.github.mochachess.data.domain.model.base.ErrorCode;
import lombok.Getter;

public class ProxyLogicException extends Exception {
    @Getter
    final ErrorCode code;

    public ProxyLogicException(String message) {
        super(message);
        this.code = ErrorCode.UNKNOWN;
    }

    public ProxyLogicException(String message, ErrorCode errorCode) {
        super(message);
        this.code = errorCode;
    }

}
