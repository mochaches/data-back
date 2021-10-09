package io.github.mochachess.data.rest.gateway.api;


import io.github.mochachess.data.domain.model.response.base.BaseResponse;
import io.github.mochachess.data.rest.gateway.api.domain.request.GetDataRequest;
import io.github.mochachess.data.rest.gateway.api.domain.response.GetDataResponse;
import org.springframework.http.ResponseEntity;

public interface GatewayRestApi {

    ResponseEntity<BaseResponse<GetDataResponse>> getData(GetDataRequest request) throws GatewayLogicException;
}
