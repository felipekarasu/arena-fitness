package com.karasusoft.arenafitnessapi.bean;

import com.karasusoft.arenafitnessapi.facade.impl.DefaultUserFacade;
import com.karasusoft.arenafitnessapi.facade.UserFacade;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FacadeBeans {

    @Bean
    public UserFacade getUserFacade(){
        return new DefaultUserFacade();
    }
}
