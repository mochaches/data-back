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
@Schema(title = "Param info")
public class ParamProxyDto {
    @Schema(title = "Data id")
    String id;
    @Schema(title = "Params")
    List<ParamProxyDto> params;
}
