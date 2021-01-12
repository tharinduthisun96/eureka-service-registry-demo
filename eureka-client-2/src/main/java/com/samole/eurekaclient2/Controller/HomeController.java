package com.samole.eurekaclient2.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/student")
    public String index(){
        return "STUDENT";
    }
}
