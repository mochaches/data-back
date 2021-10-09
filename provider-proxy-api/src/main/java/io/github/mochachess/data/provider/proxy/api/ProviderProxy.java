package io.github.mochachess.data.provider.proxy.api;

import io.github.mochachess.data.domain.model.response.base.BaseResponse;
import io.github.mochachess.data.provider.proxy.api.response.GetDataProxyResponse;
import io.github.mochachess.data.rest.gateway.api.domain.request.GetDataRequest;
import org.springframework.http.ResponseEntity;

public interface ProviderProxy {

    ResponseEntity<BaseResponse<GetDataProxyResponse>> getData(GetDataRequest request) throws ProxyLogicException;
}
