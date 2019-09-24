package edu.bsu.cs495.binarycalculator.model;

import java.util.InputMismatchException;

public class Calculator {

    private StringBuilder stringBuilder = new StringBuilder();
    private String result;
    private Character operator;

    void add0() {
        stringBuilder.append("0");
    }

    void add1() {
        stringBuilder.append("1");
    }

    void addition() {
        stringBuilder.append(",");
        setOperator('+');
    }

    void subtraction() {
        stringBuilder.append(",");
        setOperator('-');
    }

    void multiplication() {
        stringBuilder.append(",");
        setOperator('*');
    }

    void division() {
        stringBuilder.append(",");
        setOperator('/');
    }

    void equals() {
        String[] inputStrings = stringBuilder.toString().split(",", 0);
        if (inputStrings.length != 2) {
            throw new InputMismatchException();
        } else {
            int operand1 = Integer.parseInt(inputStrings[0], 2);
            int operand2 = Integer.parseInt(inputStrings[1], 2);

            setResult(findResult(operand1, operand2));
        }
    }

    void square() {
        String binaryString = stringBuilder.toString();
        if (binaryString.contains(",")) {
            throw new InputMismatchException();
        } else {
            operator = '*';
            int operand = Integer.parseInt(binaryString, 2);
            setResult(findResult(operand, operand));
        }
    }

    void root() {
        String binaryString = stringBuilder.toString();
        if (binaryString.contains(",")) {
            throw new InputMismatchException();
        } else {
            operator = 'r';
            int operand = Integer.parseInt(binaryString, 2);
            setResult(findResult(operand, null));
        }
    }

    public String findResult(Integer operand1, Integer operand2) {
        switch (operator) {
            case '+':
                return Integer.toBinaryString(operand1 + operand2);
            case '-':
                return Integer.toBinaryString(operand1 - operand2);
            case '*':
                return Integer.toBinaryString(operand1 * operand2);
            case '/':
                return Integer.toBinaryString(operand1 / operand2);
            case 'r':
                int root = (int) Math.sqrt(operand1);
                return Integer.toBinaryString(root);
        }
        return null;
    }

    StringBuilder getStringBuilder() {
        return stringBuilder;
    }

    void setStringBuilder(StringBuilder stringBuilder) {
        this.stringBuilder = stringBuilder;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Character getOperator() {
        return operator;
    }

    void setOperator(Character operator) {
        this.operator = operator;
    }

}

