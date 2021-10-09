package io.github.mochachess.data.rest.gateway.api;


import io.github.mochachess.data.domain.model.response.base.BaseResponse;
import io.github.mochachess.data.rest.gateway.api.domain.request.GetGalleryByIdRequest;
import io.github.mochachess.data.rest.gateway.api.domain.response.GetGalleriesDataResponse;
import io.github.mochachess.data.rest.gateway.api.domain.response.GetGalleryByIdResponse;
import org.springframework.http.ResponseEntity;

public interface GatewayRestApi {

    ResponseEntity<BaseResponse<GetGalleriesDataResponse>> getGalleriesData() throws GatewayLogicException;
    ResponseEntity<BaseResponse<GetGalleryByIdResponse>> getGalleryByIdData(GetGalleryByIdRequest request) throws GatewayLogicException;
}
