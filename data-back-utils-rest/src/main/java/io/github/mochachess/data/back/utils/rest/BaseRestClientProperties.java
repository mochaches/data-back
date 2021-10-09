package io.github.mochachess.data.back.utils.rest;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.web.server.Ssl;

@Getter
@Setter
public class BaseRestClientProperties {
    Ssl ssl;
    Integer maxTotalConnections;
    Integer maxDefaultPerRouteConnections;
    Integer connectionTimeout;
    Integer readTimeout;
}
