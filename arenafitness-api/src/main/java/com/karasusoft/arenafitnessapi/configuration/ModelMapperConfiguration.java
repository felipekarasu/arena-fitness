package com.karasusoft.arenafitnessapi.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfiguration {

    public ModelMapper getDefaultModelMapper() {

        ModelMapper modelMapper = new ModelMapper();

        return modelMapper;
    }
}
