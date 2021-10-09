package io.github.mochachess.data.back.app.mapper.config;

import io.github.mochachess.data.provider.proxy.api.dto.DataProxyDto;
import io.github.mochachess.data.provider.proxy.api.response.GetGalleriesDataProxyResponse;
import io.github.mochachess.data.rest.gateway.api.domain.dto.DataDto;
import io.github.mochachess.data.rest.gateway.api.domain.response.GetGalleriesDataResponse;
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

//        mapper
//            .typeMap(GetGalleriesDataRequest.class, GetDataProxyRequest.class)
//            .addMappings(m -> m.map(GetGalleriesDataRequest::getId, GetDataProxyRequest::setId))
//            .addMappings(m -> m.map(GetGalleriesDataRequest::getData, GetDataProxyRequest::setData));
        mapper
            .typeMap(DataDto.class, DataProxyDto.class)
            .addMappings(m -> m.map(DataDto::getId, DataProxyDto::setId));
//            .addMappings(m -> m.map(GetDataRequest::getData, GetDataProxyRequest::setData));
        mapper
            .typeMap(GetGalleriesDataProxyResponse.class, GetGalleriesDataResponse.class)
            .addMappings(m->m.map(GetGalleriesDataProxyResponse::getUrn, GetGalleriesDataResponse::setUrn))
            .addMappings(m->m.map(GetGalleriesDataProxyResponse::getName, GetGalleriesDataResponse::setName))
            .addMappings(m->m.map(GetGalleriesDataProxyResponse::getLabel, GetGalleriesDataResponse::setLabel));

          mapper
            .typeMap(DataProxyDto.class, DataDto.class)
            .addMappings(m->m.map(DataProxyDto::getId,DataDto::setId));

        return mapper;
    }
}
