package io.github.mochachess.data.back.app.mapper.config;

import io.github.mochachess.data.provider.proxy.api.dto.DataProxyDto;
import io.github.mochachess.data.provider.proxy.api.request.GetDataProxyRequest;
import io.github.mochachess.data.provider.proxy.api.response.GetDataProxyResponse;
import io.github.mochachess.data.rest.gateway.api.domain.dto.DataDto;
import io.github.mochachess.data.rest.gateway.api.domain.request.GetDataRequest;
import io.github.mochachess.data.rest.gateway.api.domain.response.GetDataResponse;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfig {

    @Bean
    public ModelMapper createMapper() {
        var mapper = new ModelMapper();
        mapper
            .getConfiguration()
            .setMatchingStrategy(MatchingStrategies.STRICT)
            .setFieldMatchingEnabled(true)
            .setSkipNullEnabled(true)
            .setFieldAccessLevel(org.modelmapper.config.Configuration.AccessLevel.PRIVATE);

        mapper
            .typeMap(GetDataRequest.class, GetDataProxyRequest.class)
            .addMappings(m -> m.map(GetDataRequest::getId, GetDataProxyRequest::setId))
            .addMappings(m -> m.map(GetDataRequest::getData, GetDataProxyRequest::setData));
        mapper
            .typeMap(DataDto.class, DataProxyDto.class)
            .addMappings(m -> m.map(DataDto::getId, DataProxyDto::setId));
//            .addMappings(m -> m.map(GetDataRequest::getData, GetDataProxyRequest::setData));
        mapper
            .typeMap(GetDataProxyResponse.class, GetDataResponse.class)
            .addMappings(m->m.map(GetDataProxyResponse::getId,GetDataResponse::setId))
            .addMappings(m->m.map(GetDataProxyResponse::getData,GetDataResponse::setData));

          mapper
            .typeMap(DataProxyDto.class, DataDto.class)
            .addMappings(m->m.map(DataProxyDto::getId,DataDto::setId));

        return mapper;
    }
}
