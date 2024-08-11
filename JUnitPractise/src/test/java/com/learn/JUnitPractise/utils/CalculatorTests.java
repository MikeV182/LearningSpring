package com.learn.JUnitPractise.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTests {
    private Calculator calculator;

    @BeforeEach
    void setup() {
        calculator = new Calculator();
    }

    @Test
    void resultWithAction_sum() {
        Assertions.assertEquals(10, calculator.resultWithAction(5, 5, "+"));
    }

    @Test
    void resultWithAction_multiply() {
        Assertions.assertEquals(25, calculator.resultWithAction(5, 5, "*"));
    }

    @Test
    void resultWithAction_subtraction() {
        Assertions.assertEquals(0, calculator.resultWithAction(5, 5, "-"));
    }

    @Test
    void resultWithAction_division() {
        Assertions.assertEquals(1, calculator.resultWithAction(5, 5, "/"));
        Assertions.assertThrows(ArithmeticException.class, () -> calculator.resultWithAction(1, 0, "/"));
    }

    @Test
    void resultWithAction_throwsIllegalArgumentException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.resultWithAction(1, 2, "damn"));
    }

}
