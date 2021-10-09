package io.github.mochachess.data.back.app.domain.service.impl;

import io.github.mochachess.data.domain.model.response.base.BaseResponse;
import io.github.mochachess.data.domain.model.response.base.ResponseStatus;
import io.github.mochachess.data.provider.proxy.api.ProviderProxy;
import io.github.mochachess.data.rest.gateway.api.GatewayLogicException;
import io.github.mochachess.data.rest.gateway.api.GatewayRestApi;
import io.github.mochachess.data.rest.gateway.api.domain.request.GetDataRequest;
import io.github.mochachess.data.rest.gateway.api.domain.response.GetDataResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j(topic = "DATA-SERVICE")
public class DataService implements GatewayRestApi {

    final ProviderProxy provider;

    @Override
    public ResponseEntity<BaseResponse<GetDataResponse>> getData(GetDataRequest request) throws GatewayLogicException {
        return ResponseEntity.ok(
            BaseResponse
                .<GetDataResponse>builder()
                .status(ResponseStatus.OK)
                .data(GetDataResponse.builder()
                    .dataSetDto(null)
                    .build())
                .build());
    }
}
