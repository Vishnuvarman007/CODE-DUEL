package com.codeduel.codeduel_backend.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class CodeController {


    @GetMapping("/student")
    public String fun(@RequestParam String name){
        return "hi "+name;
    }
}
