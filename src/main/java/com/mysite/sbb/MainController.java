package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/")
    public void index() {
        System.out.println("index() method called!");
    }

    @GetMapping("/hello")
    public void hello() {
        System.out.println("hello() method called!");
    }
}