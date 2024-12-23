package com.gmail.onishchenko.lectures.lecture16;

import org.junit.jupiter.api.*;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
        System.out.println("before each");
    }

    @AfterEach
    void tearDown() {
        System.out.println("after each");
    }

    @BeforeAll
    static void beforeAll() {
        System.out.println("before all");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("after all");
    }

    @Test
    void zero() {
        System.out.println("zero");
        // give

        // when
        long result = calculator.factorial(1);

        // then
        Assertions.assertNotNull(calculator);
        Assertions.assertEquals(1, result);
    }

    @Test
    @DisplayName("new display name")
    @Disabled(value = "temporary disable")
    void one() {
        System.out.println("one");
        // give

        // when
        long result = calculator.factorial(1);

        // then
        Assertions.assertNotNull(calculator);
        Assertions.assertEquals(1, result);
    }

    @Test
    void three() {
        System.out.println("three");
        // give
        long expected = 6;

        // when
        long result = calculator.factorial(3);

        // then
        Assertions.assertNotNull(calculator);
        Assertions.assertEquals(expected, result);
    }
}
