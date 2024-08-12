package com.demo.profile;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FoodController {

        @GetMapping("/food")
        public String foodController() {
            return "foods";
        }

}
