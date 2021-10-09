package io.github.mochachess.data.back.app;

import io.github.mochachess.data.provider.proxy.client.config.DataProxyClientConfig;
import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({
    DataProxyClientConfig.class
})
public class DataBackApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(DataBackApplication.class)
            .bannerMode(Banner.Mode.OFF)
            .logStartupInfo(false)
            .registerShutdownHook(true)
            .run();
    }
}
