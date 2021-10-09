package io.github.mochachess.data.provider.proxy.client.config;

import io.github.mochachess.data.back.utils.rest.BaseRestClientProperties;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class ProviderProxyProperties extends BaseRestClientProperties {
    String schema;
    String host;
    Integer port;
    String basePath;
    ServicePath paths;

    @Getter
    @Setter
    public static class ServicePath {
        @NotNull
        String data;
    }
}
