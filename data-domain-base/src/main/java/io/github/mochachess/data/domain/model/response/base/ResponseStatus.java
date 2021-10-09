package io.github.mochachess.data.domain.model.response.base;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(enumAsRef = true)
public enum ResponseStatus {
    OK,
    ERROR,
    WARNING
}
