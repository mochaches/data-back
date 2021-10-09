package io.github.mochachess.data.provider.proxy.client.config;

import io.github.mochachess.data.back.utils.rest.HttpClientConfigurer;
import io.github.mochachess.data.provider.proxy.api.ProviderProxy;
import io.github.mochachess.data.provider.proxy.client.ProviderProxyClient;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpResponseInterceptor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.BufferingClientHttpRequestFactory;
import org.springframework.retry.annotation.EnableRetry;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.DefaultUriBuilderFactory;
import org.springframework.web.util.UriBuilderFactory;
import org.springframework.web.util.UriComponentsBuilder;

@Configuration
@EnableRetry
public class DataProxyClientConfig extends HttpClientConfigurer {

    @Bean("data.proxy.client")
    public UriBuilderFactory createUriBuilderFactory(@Qualifier("createDataProxyProperties") ProviderProxyProperties properties) {
        return new DefaultUriBuilderFactory(
            UriComponentsBuilder
                .newInstance()
                .scheme(properties.getSchema())
                .host(properties.getHost())
                .port(properties.getPort())
                .path(properties.getBasePath())
        );
    }

    @Bean("data.proxy.client.rest.template")
    public RestTemplate createRestTemplate(
        @Qualifier("createDataProxyProperties") ProviderProxyProperties properties,
        HttpRequestInterceptor requestInterceptor,
        HttpResponseInterceptor responseInterceptor,
        RestTemplateBuilder restTemplateBuilder
    ) {
        return restTemplateBuilder
            .requestFactory(
                () -> new BufferingClientHttpRequestFactory(
                    super.createRequestFactory(
                        properties,
                        requestInterceptor,
                        responseInterceptor
                    )
                )
            )
            .build();
    }

    @Bean
    public ProviderProxy data(
        @Qualifier("data.proxy.client") UriBuilderFactory uriBuilderFactory,
        @Qualifier("createDataProxyProperties") ProviderProxyProperties properties,
        @Qualifier("data.proxy.client.rest.template") RestTemplate restClient) {
        return new ProviderProxyClient(uriBuilderFactory, properties, restClient, "data");
    }
}
