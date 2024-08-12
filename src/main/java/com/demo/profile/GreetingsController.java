package com.demo.profile;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {

    @GetMapping("/greet")
    public String greet() {
        return "Konichiwa! in Japanese";
    }


    @GetMapping("/greetbyname/{kname}")
    public String greetByName(@PathVariable("kname") String name) {
        return "Konichiwa, " + name + "!";
    }

}
