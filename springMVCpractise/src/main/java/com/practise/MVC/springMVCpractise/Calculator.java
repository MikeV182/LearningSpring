package com.practise.MVC.springMVCpractise;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("calculator")
@Scope("singleton")
public class Calculator {

    public static int calculate(int a, int b, String action) {
        return switch (action) {
            case "multiplication" -> a * b;
            case "addition" -> a + b;
            case "subtraction" -> a - b;
            case "division" -> a / b;
            default -> throw new IllegalStateException("Unexpected value: " + action);
        };
    }

}
