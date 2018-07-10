package de.qucosa.oaiprovsbdemo.configs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConf {

    @Autowired
    private Environment environment;

    @Bean
    public DissTermsConf dissTermsConf() {
        return new DissTermsConf(environment.getProperty("db.type"));
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
