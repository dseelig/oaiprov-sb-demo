package de.qucosa.oaiprovsbdemo.configs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class AppConf {

    @Autowired
    private Environment environment;

    @Bean
    public DissTermsConf dissTermsConf() {
        return new DissTermsConf(environment.getProperty("db.type"));
    }
}
