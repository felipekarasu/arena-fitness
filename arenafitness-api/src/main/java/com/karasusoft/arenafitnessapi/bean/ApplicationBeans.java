package com.karasusoft.arenafitnessapi.bean;

import com.karasusoft.arenafitnessapi.facade.DefaultUserFacade;
import com.karasusoft.arenafitnessapi.facade.UserFacade;
import com.karasusoft.arenafitnessapi.populator.UserReversePopulator;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import org.thymeleaf.templatemode.TemplateMode;
//import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

@Configuration
public class ApplicationBeans {

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

    @Bean
    public UserFacade getUserFacade(){
        return new DefaultUserFacade();
    }

    //TODO refactor to user interface populator
    @Bean
    public UserReversePopulator getUserReversePopulator() {
        return new UserReversePopulator();
    }

    @Bean
    public ModelMapper getDefaultModelMapper() {

        /*ModelMapper modelMapper = new ModelMapper();
        modelMapper.createTypeMap(CreateUserRequestDto.class, UserModel.class).addMapping(src -> src.getFirstName(),
                (dest, value) -> dest.setFirstName("teste"));*/

        return new ModelMapper();
    }
}
