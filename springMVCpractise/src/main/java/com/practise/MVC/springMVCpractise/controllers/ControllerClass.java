package com.practise.MVC.springMVCpractise.controllers;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/messages")
public class ControllerClass {

    @GetMapping("/hello")
    public String helloPage(@RequestParam(value = "name", defaultValue = "User!") String name, Model model) {
        model.addAttribute("name", name);
        return "helloPage";
    }

    @GetMapping("/goodbye")
    public String goodbyePage(HttpServletRequest request, Model model) {
        String name = request.getParameter("name");
        model.addAttribute("name", name);
        return "goodbyePage";
    }
}
