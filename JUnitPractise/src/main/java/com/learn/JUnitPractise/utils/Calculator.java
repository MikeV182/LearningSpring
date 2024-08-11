package com.learn.JUnitPractise.utils;

public class Calculator {

    public int resultWithAction(int a, int b, String action) {
        if (b == 0 && action.equals("/")) throw new ArithmeticException("division by zero");
        return switch (action) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> a / b;
            default -> throw new IllegalArgumentException("action is not entered correctly");
        };
    }

}
