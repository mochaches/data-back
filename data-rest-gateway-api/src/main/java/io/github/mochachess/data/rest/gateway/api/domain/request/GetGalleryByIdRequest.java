package io.github.mochachess.data.rest.gateway.api.domain.request;

import io.swagger.v3.oas.annotations.media.Schema;

import javax.validation.constraints.NotNull;

public class GetGalleryByIdRequest {
    @NotNull
    @Schema(title = "id данных")
    String id;
}
