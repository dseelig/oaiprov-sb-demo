package de.qucosa.oaiprovsbdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/oai")
@RestController
public class DemoController {

    private Logger logger = LoggerFactory.getLogger(DemoController.class);

    @GetMapping
    public ResponseEntity find() {
        return new ResponseEntity(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    @ResponseBody
    public ResponseEntity save(@RequestBody String input) {

        if (input == null || input.equals("")) {
            return new ResponseEntity("data is corrupt.", HttpStatus.BAD_REQUEST);
        }

        return new ResponseEntity("record data is saved.", HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity delete(@RequestHeader(value = "uid") String uid, @RequestHeader(value = "undo", required = false) String undo) {
        return new ResponseEntity("record data is deleted.", HttpStatus.OK);
    }
}
