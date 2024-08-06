package com.practise.MVC.springMVCpractise.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/messages")
public class ControllerClass {

    @GetMapping("/hello")
    public String helloPage() {
        return "helloPage";
    }

    @GetMapping("/goodbye")
    public String goodbyePage() {
        return "goodbyePage";
    }
}
