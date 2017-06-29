package com.orange.kermit.greeting;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.lang.invoke.MethodHandles;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class DemoController {

    private Logger log = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @RequestMapping(method = GET)
    public String greetingController(@RequestParam(value = "user", required = false, defaultValue = "Developer") String user){
        log.info("Returning greeting for: {}", user);

        return "Hello, Dear " + user + "!";
    }
}
