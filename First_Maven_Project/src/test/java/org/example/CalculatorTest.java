package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class CalculatorTest {

    @Test
    void canAddTwoNumbers() {
        Calculator underTest = new Calculator();
        int number1 = 10;
        int number2 = 15;
        int result = underTest.add(number1, number2);
        assertEquals(25, result);
    }
    @Test
    void canAcceptZeroAsNumbers() {
        Calculator underTest = new Calculator();
        int result = underTest.add(0);
        assertEquals(0, result);
    }
    @Test
    void canAddNumbersFromAGivenArray() {
        Calculator underTest = new Calculator();
        var numbers = new int[]{1, 2, 3};
        int result = underTest.add(numbers);
        assertEquals(6, result);
    }
}
