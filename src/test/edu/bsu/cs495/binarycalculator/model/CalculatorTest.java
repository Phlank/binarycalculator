package edu.bsu.cs495.binarycalculator.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @Test
    void add0Test() {
        Calculator calculator = new Calculator();
        calculator.setStringBuilder(new StringBuilder("10"));
        calculator.add0();
        assertEquals("100", calculator.getStringBuilder().toString());
    }

    @Test
    void add1Test() {
        Calculator calculator = new Calculator();
        calculator.setStringBuilder(new StringBuilder("10"));
        calculator.add1();
        assertEquals("101", calculator.getStringBuilder().toString());
    }

    @Test
    void additionTest() {
        Calculator calculator = new Calculator();

        calculator.add1();
        calculator.add0();
        calculator.addition();
        calculator.add1();
        calculator.equals();

        assertEquals("11", calculator.getResult());

    }

    @Test
    void subtractionTest() {
        Calculator calculator = new Calculator();

        calculator.add1();
        calculator.add0();
        calculator.subtraction();
        calculator.add1();
        calculator.equals();

        assertEquals("1", calculator.getResult());
    }

    @Test
    void multiplicationTest() {
        Calculator calculator = new Calculator();

        calculator.add1();
        calculator.add0();
        calculator.multiplication();
        calculator.add1();
        calculator.add1();
        calculator.equals();

        assertEquals("110", calculator.getResult());
    }

    @Test
    void divisionTest() {
        Calculator calculator = new Calculator();

        calculator.add1();
        calculator.add0();
        calculator.add0();
        calculator.division();
        calculator.add1();
        calculator.add0();
        calculator.equals();

        assertEquals("10", calculator.getResult());
    }

    @Test
    void equalsTest() {
        Calculator calculator = new Calculator();

        calculator.setStringBuilder(new StringBuilder("10110,10111"));
        calculator.setOperator('+');

        calculator.equals();

        assertEquals("101101", calculator.getResult());
    }

    @Test
    void squareTest() {
        Calculator calculator = new Calculator();

        calculator.add1();
        calculator.add1();
        calculator.add0();
        calculator.square();

        assertEquals("100100", calculator.getResult());
    }

    @Test
    void rootTest() {
        Calculator calculator = new Calculator();

        calculator.setStringBuilder(new StringBuilder("100100"));
        calculator.root();

        assertEquals("110", calculator.getResult());
    }

}