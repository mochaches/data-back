package io.github.mochachess.data.back.app.domain.config;

import io.github.mochachess.data.provider.proxy.client.config.ProviderProxyProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ClientPropertiesConfig {

    @Bean
    @ConfigurationProperties(prefix = "data.proxy")
    public ProviderProxyProperties createDataProxyProperties(){
        return new ProviderProxyProperties();
    }
}
