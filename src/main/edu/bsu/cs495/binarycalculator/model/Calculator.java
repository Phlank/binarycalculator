package edu.bsu.cs495.binarycalculator.model;

public class Calculator {

    private StringBuilder stringBuilder = new StringBuilder();
    private String result;
    private Character operator;

    public void add0() {
        stringBuilder.append("0");
    }

    public void add1() {
        stringBuilder.append("1");
    }

    public void clear() {
        stringBuilder = new StringBuilder();
        result = "";
        operator = null;
    }

    public void addition() {
        stringBuilder.append(",");
        setOperator('+');
    }

    public void subtraction() {
        stringBuilder.append(",");
        setOperator('-');
    }

    public void multiplication() {
        stringBuilder.append(",");
        setOperator('*');
    }

    public void division() {
        stringBuilder.append(",");
        setOperator('/');
    }

    public void equal() {
        String binaryString = stringBuilder.toString();
        if (binaryString.contains(",") || !binaryString.isEmpty()) {
            String[] inputStrings = stringBuilder.toString().split(",", 0);

            if (inputStrings.length != 2 || inputStrings[0].isEmpty() || inputStrings[1].isEmpty()) {
                clear();
                setResult("ERR");
            } else {
                int operand1 = Integer.parseInt(inputStrings[0], 2);
                int operand2 = Integer.parseInt(inputStrings[1], 2);

                setResult(findResult(operand1, operand2));
            }
        } else {
            clear();
            setResult("ERR");
        }
    }

    public void square() {
        String binaryString = stringBuilder.toString();
        if (binaryString.contains(",") || binaryString.isEmpty()) {
            clear();
            setResult("ERR");
        } else {
            operator = '*';
            int operand = Integer.parseInt(binaryString, 2);
            setResult(findResult(operand, operand));
        }
    }

    public void root() {
        String binaryString = stringBuilder.toString();
        if (binaryString.contains(",") || binaryString.isEmpty()) {
            clear();
            setResult("ERR");
        } else {
            operator = 'r';
            int operand = Integer.parseInt(binaryString, 2);
            setResult(findResult(operand, null));
        }
    }

    private String findResult(Integer operand1, Integer operand2) {
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

    public String getDisplayString() {
        String[] diplayStrings = getStringBuilder().toString().split(",");
        return diplayStrings[diplayStrings.length - 1];
    }

    public String getResult() {
        return result;
    }

    private void setResult(String result) {
        this.result = result;
    }

    public Character getOperator() {
        return operator;
    }

    void setOperator(Character operator) {
        this.operator = operator;
    }

}

