package com.karasusoft.arenafitnessapi.bean;

import com.karasusoft.arenafitnessapi.populator.impl.UserAddressReversePopulator;
import com.karasusoft.arenafitnessapi.populator.impl.UserReversePopulator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConvertersAndPopulators {

    @Bean
    public UserReversePopulator getUserReversePopulator() {
        return new UserReversePopulator();
    }

    @Bean
    public UserAddressReversePopulator getUserAddresReverPopulator() {
        return new UserAddressReversePopulator();
    }
}
