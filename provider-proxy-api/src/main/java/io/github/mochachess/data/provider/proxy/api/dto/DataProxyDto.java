package io.github.mochachess.data.provider.proxy.api.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Schema(title = "Data info")
public class DataProxyDto {
    @Schema(title = "Data name")
    String name;
    @Schema(title = "Params")
    List<ParamProxyDto> params;
}
