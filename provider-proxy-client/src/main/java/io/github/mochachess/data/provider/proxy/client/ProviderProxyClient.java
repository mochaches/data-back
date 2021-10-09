package io.github.mochachess.data.provider.proxy.client;

import io.github.mochachess.data.domain.model.response.base.BaseResponse;
import io.github.mochachess.data.provider.proxy.api.ProviderProxy;
import io.github.mochachess.data.provider.proxy.api.ProxyLogicException;
import io.github.mochachess.data.provider.proxy.api.response.GetGalleriesDataProxyResponse;
import io.github.mochachess.data.provider.proxy.client.config.ProviderProxyProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriBuilderFactory;

@RequiredArgsConstructor
public class ProviderProxyClient implements ProviderProxy {
    static final String PARTNER_OPTION = "partner";

    final UriBuilderFactory uriBuilderFactory;
    final ProviderProxyProperties properties;
    final RestTemplate restTemplate;
    final String partnerName;

    @Override
    public ResponseEntity<BaseResponse<GetGalleriesDataProxyResponse>> getGalleriesData() throws ProxyLogicException {
        var parameterizedTypeReference = new ParameterizedTypeReference<BaseResponse<GetGalleriesDataProxyResponse>>() {
        };

        var headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

//        var exchange = restTemplate.exchange(
//            uriBuilderFactory
//                .builder()
//                .path(properties.getPaths().getData())
//                .build(Map.of(PARTNER_OPTION, partnerName.toLowerCase())),
//            HttpMethod.POST,
//            new HttpEntity<>(request, headers),
//            parameterizedTypeReference
//        );
//        return exchange;
        return null;
    }
}
