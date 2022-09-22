package com.karasusoft.arenafitnessapi.bean;

import org.springframework.context.annotation.Bean;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

public class ApplicationBeans {

    @Bean
    public ClassLoaderTemplateResolver templateResolver() {
        ClassLoaderTemplateResolver applicationCustomFolderTemplateResolver = new ClassLoaderTemplateResolver();
        applicationCustomFolderTemplateResolver.setPrefix("pages/");
        applicationCustomFolderTemplateResolver.setSuffix(".html");
        applicationCustomFolderTemplateResolver.setTemplateMode(TemplateMode.HTML);
        applicationCustomFolderTemplateResolver.setCharacterEncoding("UTF-8");
        applicationCustomFolderTemplateResolver.setOrder(1);
        applicationCustomFolderTemplateResolver.setCheckExistence(true);

        return applicationCustomFolderTemplateResolver;
    }
}
