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
        displayPanel.setSize(400,100);
        displayTextPane = new JTextPane();
        displayPanel.add(displayTextPane);
        displayTextPane.setSize(400,100);
        displayTextPane.setMinimumSize(new Dimension(400,100));
        jframe.add(displayPanel);
    }

}
