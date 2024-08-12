package com.demo.profile;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ProfileController {

    @RequestMapping( "/" )
    public String profileController() {
        return "Hello World Spring Foot ";
    }





}
