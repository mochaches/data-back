package io.github.mochachess.data.provider.proxy.api.response;

import io.github.mochachess.data.provider.proxy.api.dto.DataProxyDto;
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
@Schema(title = "Get data info")
public class GetDataProxyResponse {
    @NotNull
    @Schema(title = "id данных")
    String id;
    @NotNull
    @Schema(title = "Data list", required = true)
    List<DataProxyDto> data;
}
