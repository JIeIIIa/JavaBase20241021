package com.gmail.onishchenko.lectures.lecture16;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    void zero() {
        // give
        Calculator calculator = new Calculator();

        // when
        long result = calculator.factorial(1);

        // then
        Assertions.assertNotNull(calculator);
        Assertions.assertEquals(1, result);
    }

    @Test
    void one() {
        // give
        Calculator calculator = new Calculator();

        // when
        long result = calculator.factorial(1);

        // then
        Assertions.assertNotNull(calculator);
        Assertions.assertEquals(1, result);
    }

    @Test
    void three() {
        // give
        Calculator calculator = new Calculator();
        long expected = 6;

        // when
        long result = calculator.factorial(3);

        // then
        Assertions.assertNotNull(calculator);
        Assertions.assertEquals(expected, result);
    }
}
