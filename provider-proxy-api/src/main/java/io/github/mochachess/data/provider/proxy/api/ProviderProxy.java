package io.github.mochachess.data.provider.proxy.api;

import io.github.mochachess.data.domain.model.response.base.BaseResponse;
import io.github.mochachess.data.provider.proxy.api.request.GetDataProxyRequest;
import io.github.mochachess.data.provider.proxy.api.response.GetDataProxyResponse;
import org.springframework.http.ResponseEntity;

public interface ProviderProxy {

    ResponseEntity<BaseResponse<GetDataProxyResponse>> getData(GetDataProxyRequest request) throws ProxyLogicException;
}
