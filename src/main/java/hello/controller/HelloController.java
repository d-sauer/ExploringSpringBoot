package hello.controller;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private static final Logger log = LoggerFactory.getLogger(HelloController.class);
    
    @RequestMapping("/")
    public String index() {
        log.trace("Accessing INDEX");
        
        Date date = new Date();
        return "Hello on " + date;
    }
    
}
