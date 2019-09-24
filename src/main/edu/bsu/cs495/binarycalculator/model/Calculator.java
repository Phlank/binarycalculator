package edu.bsu.cs495.binarycalculator.model;

import java.util.InputMismatchException;

public class Calculator {
    String binaryString = "";
    String result;
    Character operator;

    void add0(){
        binaryString+="0";
    }

    void add1(){
        binaryString+="1";
    }

    void addition(){
        binaryString+=',';
        operator = '+';
    }

    void subtraction(){
        binaryString+=',';
        operator = '-';
    }

    void multiplication(){
        binaryString+=',';
        operator = '*';
    }

    void division(){
        binaryString+=',';
        operator = '/';
    }

    void equals() {
        String[] inputStrings = binaryString.split(",",0);
        if (inputStrings.length != 2){
            throw new InputMismatchException();
        }
        Integer operand1 = Integer.parseInt(inputStrings[0],2);
        Integer operand2 = Integer.parseInt(inputStrings[1],2);

        result = findResult(operand1, operand2);
    }

    private String findResult(Integer operand1, Integer operand2){
        switch (operator){
            case '+':
                return Integer.toBinaryString(operand1 + operand2);
            case '-':
                return Integer.toBinaryString(operand1 - operand2);
            case '*':
                return Integer.toBinaryString(operand1 * operand2);
            case '/':
                return Integer.toBinaryString(operand1 / operand2);
        }
        return null;
    }
}

