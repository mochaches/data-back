package io.github.mochachess.data.rest.gateway.api.domain.response;

import io.github.mochachess.data.rest.gateway.api.domain.dto.DataDto;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Schema(title = "Информация о датасетах")
public class GetGalleriesDataResponse {
    @NotNull
    @Schema(title = "id данных")
    String urn;
    String name;
    String label;
}
