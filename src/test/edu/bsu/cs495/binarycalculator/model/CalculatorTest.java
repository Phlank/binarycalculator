package edu.bsu.cs495.binarycalculator.model;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutionException;

class CalculatorTest {

    @Test
    void add0Test(){
        Calculator calculator = new Calculator();
        calculator.binaryString = "10";
        calculator.add0();
        assertEquals("100",calculator.binaryString);
    }

    @Test
    void add1Test(){
        Calculator calculator = new Calculator();
        calculator.binaryString = "10";
        calculator.add1();
        assertEquals("101",calculator.binaryString);
    }

    @Test
    void additionTest() {
        Calculator calculator = new Calculator();

        calculator.add1();
        calculator.add0();
        calculator.addition();
        calculator.add1();
        calculator.equals();

        assertEquals("11",calculator.result);

    }

    @Test
    void subtractionTest(){
        Calculator calculator = new Calculator();

        calculator.add1();
        calculator.add0();
        calculator.subtraction();
        calculator.add1();
        calculator.equals();

        assertEquals("1",calculator.result);
    }

    @Test
    void multiplicationTest(){
        Calculator calculator = new Calculator();

        calculator.add1();
        calculator.add0();
        calculator.multiplication();
        calculator.add1();
        calculator.add1();
        calculator.equals();

        assertEquals("110",calculator.result);
    }

    @Test
    void divisionTest(){
        Calculator calculator = new Calculator();

        calculator.add1();
        calculator.add0();
        calculator.add0();
        calculator.division();
        calculator.add1();
        calculator.add0();
        calculator.equals();

        assertEquals("10",calculator.result);
    }

    @Test
    void equalsTest(){
        Calculator calculator = new Calculator();

        calculator.binaryString = "10110,10111";
        calculator.operator = '+';

        calculator.equals();

        assertEquals("101101",calculator.result);
    }
}