package edu.bsu.cs495.binarycalculator.view;

import javax.swing.*;
import java.awt.*;

public class CalculatorView {

    private static final String NAME = "Binary Calculator";

    private JFrame jframe;
    private JPanel displayPanel;
    private JPanel numberButtonPanel;
    private JPanel operationButtonPanel;
    private JTextPane displayTextPane;
    private JButton zeroButton;
    private JButton oneButton;
    private JButton addButton;
    private JButton subtractButton;
    private JButton multiplyButton;
    private JButton divideButton;
    private JButton equalsButton;

    public CalculatorView() {
        createJFrame();
        createDisplayPanel();
        createNumberButtonPanel();
        createOperationButtonPanel();
        jframe.pack();
        jframe.setVisible(true);
    }

    private void createJFrame() {
        jframe = new JFrame();
        jframe.setTitle(NAME);
        jframe.getContentPane().setLayout(new BoxLayout(jframe.getContentPane(), BoxLayout.PAGE_AXIS));

    }

    private void createDisplayPanel() {
        displayPanel = new JPanel();
        displayPanel.setSize(400, 100);
        displayTextPane = new JTextPane();
        displayPanel.add(displayTextPane);
        displayTextPane.setSize(400, 100);
        displayTextPane.setMinimumSize(new Dimension(400, 100));
        jframe.add(displayPanel);
    }

    private void createNumberButtonPanel() {
        createNumberButtons();
        numberButtonPanel = new JPanel();
        numberButtonPanel.setLayout(new BoxLayout(numberButtonPanel, BoxLayout.LINE_AXIS));
        numberButtonPanel.add(zeroButton);
        numberButtonPanel.add(oneButton);
        jframe.add(numberButtonPanel);
    }

    private void createNumberButtons() {
        zeroButton = new JButton("0");
        zeroButton.setSize(200, 100);
        oneButton = new JButton("1");
        oneButton.setSize(200, 100);
    }

    private void createOperationButtonPanel() {
        createOperationButtons();
        operationButtonPanel = new JPanel();
        operationButtonPanel.add(addButton);
        operationButtonPanel.add(subtractButton);
        operationButtonPanel.add(multiplyButton);
        operationButtonPanel.add(divideButton);
        jframe.add(operationButtonPanel);
    }

    private void createOperationButtons() {
        addButton = new JButton("+");
        addButton.setSize(200,100);
        subtractButton = new JButton("-");
        subtractButton.setSize(200,100);
        multiplyButton = new JButton("*");
        multiplyButton.setSize(200,100);
        divideButton = new JButton("/");
        divideButton.setSize(200,100);
    }

}
