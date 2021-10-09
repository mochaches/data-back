package io.github.mochachess.data.provider.proxy.api.request;

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
@Schema(title = "Get data info")
public class GetDataProxyRequest {
    @NotNull
    @Schema(title = "Data id", required = true)
    String id;
    List<DataDto> data;
}
