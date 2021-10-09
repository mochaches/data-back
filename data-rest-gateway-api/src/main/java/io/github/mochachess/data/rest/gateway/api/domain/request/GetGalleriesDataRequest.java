package io.github.mochachess.data.rest.gateway.api.domain.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
//@NoArgsConstructor
//@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Schema(title = "Запрос данынх о dataset")
public class GetGalleriesDataRequest extends BaseRequest {
}
