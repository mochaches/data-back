package io.github.mochachess.data.back.app.rest;


import io.github.mochachess.data.domain.model.response.base.BaseResponse;
import io.github.mochachess.data.rest.gateway.api.GatewayLogicException;
import io.github.mochachess.data.rest.gateway.api.GatewayRestApi;
import io.github.mochachess.data.rest.gateway.api.domain.request.GetGalleryByIdRequest;
import io.github.mochachess.data.rest.gateway.api.domain.response.GetGalleriesDataResponse;
import io.github.mochachess.data.rest.gateway.api.domain.response.GetGalleryByIdResponse;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.info.Info;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    @PostMapping("/getGalleriesData")
    @Operation(tags = "Galleries", summary = "GALLERIES_GET_REQUEST", description = "Получение данных")
    public ResponseEntity<BaseResponse<GetGalleriesDataResponse>> getGalleriesData() throws GatewayLogicException {
        return gatewayRestApi.getGalleriesData();
    }

    @Override
    @PostMapping("/getGalleryById")
    @Operation(tags = "Gallery", summary = "GALLERY_BY_ID_GET_REQUEST", description = "Получение данных одной галлереи")
    public ResponseEntity<BaseResponse<GetGalleryByIdResponse>> getGalleryByIdData(GetGalleryByIdRequest request) throws GatewayLogicException {
        return gatewayRestApi.getGalleryByIdData(request);
    }
}
