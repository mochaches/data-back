package io.github.mochachess.data.rest.gateway.api.domain.response;

import io.swagger.v3.oas.annotations.media.Schema;

import javax.validation.constraints.NotNull;

public class GetGalleryByIdResponse {
    @NotNull
    @Schema(title = "филд")//todo описание добавить
    String fieldPath;
    @Schema(title = "описание")//todo описание добавить
    String description;
}
