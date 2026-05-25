package com.codeduel.codeduel_backend.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class CodeController {

    @GetMapping
    public String home(){
        return "welcome to code duel";
    }
}
