package io.github.mochachess.data.back.app.domain.service.impl;

import io.github.mochachess.data.domain.model.response.base.BaseResponse;
import io.github.mochachess.data.domain.model.response.base.ResponseStatus;
import io.github.mochachess.data.provider.proxy.api.ProviderProxy;
import io.github.mochachess.data.provider.proxy.api.request.GetDataProxyRequest;
import io.github.mochachess.data.provider.proxy.client.utils.ProviderProxyResponseHandler;
import io.github.mochachess.data.rest.gateway.api.GatewayLogicException;
import io.github.mochachess.data.rest.gateway.api.GatewayRestApi;
import io.github.mochachess.data.rest.gateway.api.domain.request.GetDataRequest;
import io.github.mochachess.data.rest.gateway.api.domain.response.GetDataResponse;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j(topic = "DATA-SERVICE")
public class DataService implements GatewayRestApi {

    final ModelMapper mapper;
    final ProviderProxy provider;

    @SneakyThrows
    @Override
    public ResponseEntity<BaseResponse<GetDataResponse>> getData(GetDataRequest request) throws GatewayLogicException {
        var param = mapper.map(request, GetDataProxyRequest.class);
        var response = ProviderProxyResponseHandler.getResponse(provider.getData(param));
        var result = mapper.map(response, GetDataResponse.class);
        return ResponseEntity.ok(
            BaseResponse
                .<GetDataResponse>builder()
                .status(ResponseStatus.OK)
                .data(result)
                .build());
    }
}
