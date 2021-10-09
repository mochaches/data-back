package io.github.mochachess.data.rest.gateway.api.domain.request;

import io.github.mochachess.data.rest.gateway.api.domain.dto.DataDto;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Schema(title = "Запрос данынх о dataset")
public class GetDataRequest extends BaseRequest{
    @NotNull
    @Schema(title = "id данных")
    String id;
    List<DataDto> data;
}
