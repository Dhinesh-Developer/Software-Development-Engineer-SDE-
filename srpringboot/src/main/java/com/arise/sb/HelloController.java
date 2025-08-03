package com.arise.sb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/api")
    public String sayHello(){
        return "This from API.";
    }

    @GetMapping("/about")
    public String about(){
        return "Discipline";
    }



}
