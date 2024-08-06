package com.practise.MVC.springMVCpractise.controllers;

import com.practise.MVC.springMVCpractise.Calculator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/calculator")
public class ControllerClass {

    @GetMapping("/")
    public String helloPage(@RequestParam(value = "a", required = false) String a,
                            @RequestParam(value = "b", required = false) String b,
                            @RequestParam(value = "action", required = false) String action,
                            Model model) {
        int result = Calculator.calculate(
                Integer.parseInt(a),
                Integer.parseInt(b),
                action
        );
        model.addAttribute("a", a);
        model.addAttribute("b", b);
        model.addAttribute("action", action);
        model.addAttribute("result", Integer.toString(result));
        return "resultPage";
    }

}
