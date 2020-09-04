package com.example.demo8.cuntrooler;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@EnableAutoConfiguration
public class IdexCuntroller {

    @RequestMapping(value = "index")
    public String idex() {
        return "index";
    }
}
