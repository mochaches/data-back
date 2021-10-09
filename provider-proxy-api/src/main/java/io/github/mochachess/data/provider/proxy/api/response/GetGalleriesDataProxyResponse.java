package io.github.mochachess.data.provider.proxy.api.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Schema(title = "Get data info")
public class GetGalleriesDataProxyResponse {
    @NotNull
    @Schema(title = "id данных")
    String urn;
    @NotNull
    @Schema(title = "name")//todo добавить описание
    String name;
    @NotNull
    @Schema(title = "label")//todo добавить описание
    String label;
}
