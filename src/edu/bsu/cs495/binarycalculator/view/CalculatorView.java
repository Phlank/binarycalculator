package edu.bsu.cs495.binarycalculator.view;

import edu.bsu.cs495.binarycalculator.model.Calculator;

import javax.swing.*;
import java.awt.*;

public class CalculatorView {

    private static final String NAME = "Binary Calculator";
    private static final Dimension WINDOW_DIMENSION = new Dimension(400, 650);
    private static final Dimension DISPLAY_DIMENSION = new Dimension(400, 150);
    private static final Dimension NUMBER_BUTTON_ROW_DIMENSION = new Dimension(400, 200);
    private static final Dimension NUMBER_BUTTON_DIMENSION = new Dimension(300, 200);
    private static final Dimension OPERATION_BUTTON_DIMENSION = new Dimension(100, 100);
    private static final Dimension OPERATION_PANEL_DIMENSION = new Dimension(100, 200);
    private static final Dimension EQUAL_BUTTON_DIMENSION = new Dimension(400, 100);

    private Calculator calculator;

    private JFrame jframe;
    private JPanel displayPanel;
    private JPanel rowOnePanel;
    private JPanel rowOneRightPanel;
    private JPanel rowZeroPanel;
    private JPanel rowZeroRightPanel;
    private JPanel equalsPanel;
    private JTextPane displayTextPane;
    private JButton zeroButton;
    private JButton oneButton;
    private JButton addButton;
    private JButton subtractButton;
    private JButton multiplyButton;
    private JButton divideButton;
    private JButton equalsButton;

    public CalculatorView(Calculator calculator) {
        this.calculator = calculator;
        createJFrame();
        createDisplayPanel();
        createRowOnePanel();
        createRowZeroPanel();
        createEqualsPanel();
        jframe.pack();
        jframe.setVisible(true);
    }

    private void createJFrame() {
        jframe = new JFrame();
        jframe.setTitle(NAME);
        jframe.getContentPane().setLayout(new BoxLayout(jframe.getContentPane(), BoxLayout.PAGE_AXIS));
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void createDisplayPanel() {
        displayPanel = new JPanel();
        displayPanel.setPreferredSize(DISPLAY_DIMENSION);
        displayTextPane = new JTextPane();
        displayPanel.add(displayTextPane);
        displayTextPane.setPreferredSize(DISPLAY_DIMENSION);
        jframe.add(displayPanel);
    }

    private void createRowOnePanel() {
        rowOnePanel = new JPanel();
        rowOnePanel.setLayout(new FlowLayout());
        rowOnePanel.setPreferredSize(new Dimension(400, 200));
        rowOneRightPanel = new JPanel();
        rowOneRightPanel.setLayout(new BoxLayout(rowOneRightPanel, BoxLayout.Y_AXIS));
        rowOneRightPanel.setSize(100, 200);
        oneButton = new JButton("1");
        oneButton.setSize(NUMBER_BUTTON_DIMENSION);
        addButton = new JButton("+");
        addButton.setSize(OPERATION_BUTTON_DIMENSION);
        subtractButton = new JButton("-");
        subtractButton.setSize(OPERATION_BUTTON_DIMENSION);
        rowOneRightPanel.add(addButton);
        rowOneRightPanel.add(subtractButton);
        rowOnePanel.add(oneButton);
        rowOnePanel.add(rowOneRightPanel);
        jframe.add(rowOnePanel);
    }

    private void createRowZeroPanel() {
        rowZeroPanel = new JPanel();
        rowZeroPanel.setLayout(new FlowLayout());
        rowZeroPanel.setPreferredSize(NUMBER_BUTTON_ROW_DIMENSION);
        rowZeroRightPanel = new JPanel();
        rowZeroRightPanel.setLayout(new BoxLayout(rowZeroRightPanel, BoxLayout.Y_AXIS));
        rowZeroRightPanel.setSize(rowOneRightPanel.getSize());
        zeroButton = new JButton("0");
        zeroButton.setSize(NUMBER_BUTTON_DIMENSION);
        multiplyButton = new JButton("×");
        multiplyButton.setSize(OPERATION_BUTTON_DIMENSION);
        divideButton = new JButton("÷");
        divideButton.setSize(OPERATION_BUTTON_DIMENSION);
        rowZeroPanel.add(zeroButton);
        rowZeroRightPanel.add(multiplyButton);
        rowZeroRightPanel.add(divideButton);
        rowZeroPanel.add(rowZeroRightPanel);
        jframe.add(rowZeroPanel);
    }

    private void createEqualsPanel() {
        equalsButton = new JButton("=");
        equalsButton.setPreferredSize(NUMBER_BUTTON_ROW_DIMENSION);
        jframe.add(equalsButton);
    }

}
