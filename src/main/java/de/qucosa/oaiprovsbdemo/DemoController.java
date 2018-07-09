package de.qucosa.oaiprovsbdemo;

import de.qucosa.oaiprovsbdemo.dao.DemoDao;
import de.qucosa.oaiprovsbdemo.model.DemoData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/demotest")
@RestController
public class DemoController {

    @Autowired
    private DemoDao demoDao;

    @Value("${db.type}")
    private String dbtype;

    @RequestMapping(value = "/db", method = RequestMethod.GET, produces = "text/plain")
    public String dbtype() {
        return dbtype;
    }

    @RequestMapping(method = RequestMethod.GET, produces = "text/plain")
    public String hello() {
        return demoDao.greet();
    }

    @RequestMapping(value = "{name}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public DemoData hello(@PathVariable String name) {
        DemoData data = demoDao.greetUser(name);
        System.out.println(data.getName());
        return data;
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public DemoData postData(@RequestBody DemoData input) {
        System.out.println(input);
        return input;
    }
}