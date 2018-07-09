package de.qucosa.oaiprovsbdemo.configs;

import org.springframework.stereotype.Component;

@Component
public class DissTermsConf {

    private String arg;

    public DissTermsConf(String arg) {
        this.arg = arg;
    }

    public String blabla() {
        return arg;
    }
}
