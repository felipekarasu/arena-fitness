package com.karasusoft.arenafitnessapi.bean;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import org.thymeleaf.templatemode.TemplateMode;
//import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

@Configuration
public class Mappers {

    @Bean
    public ModelMapper getDefaultModelMapper() {

        /*ModelMapper modelMapper = new ModelMapper();
        modelMapper.createTypeMap(CreateUserRequestDto.class, UserModel.class).addMapping(src -> src.getFirstName(),
                (dest, value) -> dest.setFirstName("teste"));*/

        return new ModelMapper();
    }

   /* @Bean
    public ClassLoaderTemplateResolver templateResolver() {
        ClassLoaderTemplateResolver applicationCustomFolderTemplateResolver = new ClassLoaderTemplateResolver();
        applicationCustomFolderTemplateResolver.setPrefix("pages/");
        applicationCustomFolderTemplateResolver.setSuffix(".html");
        applicationCustomFolderTemplateResolver.setTemplateMode(TemplateMode.HTML);
        applicationCustomFolderTemplateResolver.setCharacterEncoding("UTF-8");
        applicationCustomFolderTemplateResolver.setOrder(1);
        applicationCustomFolderTemplateResolver.setCheckExistence(true);

        return applicationCustomFolderTemplateResolver;
    }*/


}
