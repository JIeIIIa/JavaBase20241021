package com.gmail.onishchenko.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {
    private static final double PRECISION = 0.0001;
    private SimpleCalculator simpleCalculator;

    @BeforeEach
    void setUp() {
        this.simpleCalculator = new SimpleCalculator();
    }

    @Test
    void sum() {
        // when
        double result = simpleCalculator.sum(123.43, 32.2);

        // then
        assertEquals(155.63, result, PRECISION);
    }

    @Test
    void sumNegatives() {
        // when
        double result = simpleCalculator.sum(-123.43, -32.2);

        // then
        assertEquals(-155.63, result, PRECISION);
    }

    @Test
    void subtract() {
        // when
        double result = simpleCalculator.subtract(123.43, 32.2);

        // then
        assertEquals(91.23, result, PRECISION);
    }

    @Test
    void subtractNegatives() {
        // when
        double result = simpleCalculator.subtract(-123.43, -32.2);

        // then
        assertEquals(-91.23, result, PRECISION);
    }

    @Test
    void divide() {
        // when
        double result = simpleCalculator.divide(10, 3);

        // then
        assertEquals(3.3333, result, PRECISION);
    }

    @Test
    void divideByZero() {
        // when
        double result = simpleCalculator.divide(10, 0);

        // then
        assertEquals(Double.POSITIVE_INFINITY, result);
    }

    @Test
    void divideNegativeByZero() {
        // when
        double result = simpleCalculator.divide(-42, 0);

        // then
        assertEquals(Double.NEGATIVE_INFINITY, result);
    }

    @Test
    void multiply() {
        // when
        double result = simpleCalculator.multiply(-42.123, 2);

        // then
        assertEquals(-84.246, result, PRECISION);
    }

    @Test
    void multiplyNegatives() {
        // when
        double result = simpleCalculator.multiply(-42.123, -2);

        // then
        assertEquals(84.246, result, PRECISION);
    }


}