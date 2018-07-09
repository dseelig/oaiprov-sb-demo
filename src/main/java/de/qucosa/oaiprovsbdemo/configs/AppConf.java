package de.qucosa.oaiprovsbdemo.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConf {

    @Bean
    public DissTermsConf dissTermsConf() {
        return new DissTermsConf("blub blub");
    }
}
