package com.uni.countries;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountriesController {

    @RequestMapping("/")
    public String index() {
        return "Hello World!";
    }

}
