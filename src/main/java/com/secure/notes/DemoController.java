package com.secure.notes;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class DemoController {

    @GetMapping("/user")
    public String sayUser() {
        String st = "";
        st = st+"sfsf";
        return new String("User");
    }
}
