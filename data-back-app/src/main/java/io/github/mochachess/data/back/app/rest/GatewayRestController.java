package io.github.mochachess.data.back.app.rest;


import io.github.mochachess.data.domain.model.response.base.BaseResponse;
import io.github.mochachess.data.rest.gateway.api.GatewayLogicException;
import io.github.mochachess.data.rest.gateway.api.GatewayRestApi;
import io.github.mochachess.data.rest.gateway.api.domain.request.GetDataRequest;
import io.github.mochachess.data.rest.gateway.api.domain.response.GetDataResponse;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.info.Info;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@ConditionalOnProperty("server.enabled")
@RequiredArgsConstructor
@RequestMapping(
    value = "/v1/rest",
    consumes = MediaType.APPLICATION_JSON_VALUE,
    produces = MediaType.APPLICATION_JSON_VALUE
)
@OpenAPIDefinition(
    info = @Info(title = "${spring.application.name}", version = "${build.version}")
)
public class GatewayRestController implements GatewayRestApi {

    final GatewayRestApi gatewayRestApi;

    @Override
    @PostMapping("/getData")
    @Operation(tags = "Data", summary = "DATA_GET_REQUEST", description = "Получение данных")
    public ResponseEntity<BaseResponse<GetDataResponse>> getData(@Valid @RequestBody GetDataRequest request) throws GatewayLogicException {
        return gatewayRestApi.getData(request);
    }
}
