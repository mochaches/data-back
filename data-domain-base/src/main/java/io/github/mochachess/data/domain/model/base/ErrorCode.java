package io.github.mochachess.data.domain.model.base;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(enumAsRef = true)
public enum ErrorCode {
    UNKNOWN(null),
    PROVIDER_UNAVAILABLE("Provider unavailable");

    private final String name;

    ErrorCode(String name) {
        this.name = name;
    }

    public static ErrorCode from(String str) {
        if (str == null)
            return ErrorCode.UNKNOWN;

        switch (str) {
            default:
                return ErrorCode.UNKNOWN;
            case "Provider unavailable":
                return ErrorCode.PROVIDER_UNAVAILABLE;
        }
    }
}
