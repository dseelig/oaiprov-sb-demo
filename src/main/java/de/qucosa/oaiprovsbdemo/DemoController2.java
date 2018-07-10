package de.qucosa.oaiprovsbdemo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RequestMapping("/surnames")
@RestController
public class DemoController2 {
    private Map<String, String> surnames = new HashMap() {
        {
            put("max", "musterman");
            put("kevin", "jeder braucht einen");
            put("hans", "dampf");
        }
    };

    @RequestMapping(value = "{name}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public String surName(@PathVariable String name) {
        String surname = "kein passenden vornamen gefunden";

        if (surnames.containsKey(name)) {
            surname = surnames.get(name);
        }

        return surname;
    }
}
