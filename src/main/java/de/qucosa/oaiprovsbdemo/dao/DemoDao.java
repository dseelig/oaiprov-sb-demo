package de.qucosa.oaiprovsbdemo.dao;

import de.qucosa.oaiprovsbdemo.model.DemoData;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class DemoDao {

    private Set<DemoData> dataSet = new HashSet() {
        {
            DemoData hans = new DemoData();
            hans.setName("hans");
            DemoData kevin = new DemoData();
            kevin.setName("kevin");
            DemoData max = new DemoData();
            max.setName("max");
            add(hans);
            add(kevin);
            add(max);
        }
    };

    public String greet() {
        return "Hello";
    }

    public DemoData greetUser(String name) {

        for (DemoData user : dataSet) {

            if (user.getName().equals(name)) {
                return user;
            }
        }

        return null;
    }
}
