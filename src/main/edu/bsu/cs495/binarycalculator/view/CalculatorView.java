package edu.bsu.cs495.binarycalculator.view;

import edu.bsu.cs495.binarycalculator.model.Calculator;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import java.awt.*;

public class CalculatorView {

    private static final String NAME = "Binary Calculator";
    private static final Dimension WINDOW_DIMENSION = new Dimension(416, 650);
    private static final Dimension DISPLAY_DIMENSION = new Dimension(400, 100);
    private static final Dimension NUMBER_BUTTON_ROW_DIMENSION = new Dimension(400, 200);
    private static final Dimension NUMBER_BUTTON_DIMENSION = new Dimension(300, 200);
    private static final Dimension OPERATION_BUTTON_DIMENSION = new Dimension(100, 100);
    private static final Dimension OPERATION_PANEL_DIMENSION = new Dimension(100, 200);
    private static final Dimension EQUAL_BUTTON_DIMENSION = new Dimension(100, 100);

    private Calculator calculator;

    private JFrame jframe = new JFrame();
    private RowPanel rowOnePanel = new RowPanel();
    private RowPanel rowZeroPanel = new RowPanel();
    private RowOperationPanel rowOneRightPanel = new RowOperationPanel();
    private RowOperationPanel rowZeroRightPanel = new RowOperationPanel();
    private EqualPanel equalPanel = new EqualPanel();
    private JTextPane displayTextPane = new JTextPane();
    private NumberButton oneButton = new NumberButton("1");
    private NumberButton zeroButton = new NumberButton("0");
    private OperationButton addButton = new OperationButton("+");
    private OperationButton subtractButton = new OperationButton("-");
    private OperationButton multiplyButton = new OperationButton("×");
    private OperationButton divideButton = new OperationButton("÷");
    private EqualButton equalButton = new EqualButton("=");
    private OperationButton squareButton = new OperationButton("x^2");
    private OperationButton rootButton = new OperationButton("√");
    private OperationButton clearButton = new OperationButton("C");

    private Font displayFont = new Font("Sans Serif", Font.PLAIN, 75);

    public CalculatorView(Calculator calculator) {
        this.calculator = calculator;
        createJFrame();
        createDisplayPanel();
        createRowOnePanel();
        createRowZeroPanel();
        createEqualButton();
        addEventsToButtons();
        jframe.setSize(WINDOW_DIMENSION);
        jframe.setVisible(true);
    }

    private void createJFrame() {
        jframe = new JFrame();
        jframe.setPreferredSize(WINDOW_DIMENSION);
        jframe.setTitle(NAME);
        BoxLayout layout = new BoxLayout(jframe.getContentPane(), BoxLayout.Y_AXIS);
        jframe.getContentPane().setLayout(layout);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setResizable(false);
    }

    private void createDisplayPanel() {
        displayTextPane.setPreferredSize(DISPLAY_DIMENSION);
        displayTextPane.setFont(displayFont);
        displayTextPane.setBackground(Color.BLACK);
        displayTextPane.setForeground(Color.WHITE);
        displayTextPane.setEditable(false);
        displayTextPane.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        jframe.add(displayTextPane);
    }

    private void createRowOnePanel() {
        rowOneRightPanel.add(addButton, BorderLayout.PAGE_START);
        rowOneRightPanel.add(subtractButton, BorderLayout.PAGE_END);
        rowOnePanel.add(oneButton);
        rowOnePanel.add(rowOneRightPanel);
        jframe.add(rowOnePanel);
    }

    private void createRowZeroPanel() {
        rowZeroRightPanel.add(multiplyButton, BorderLayout.PAGE_START);
        rowZeroRightPanel.add(divideButton, BorderLayout.PAGE_END);
        rowZeroPanel.add(zeroButton);
        rowZeroPanel.add(rowZeroRightPanel);
        jframe.add(rowZeroPanel);
    }

    private void createEqualButton() {
        equalPanel.add(equalButton, BorderLayout.LINE_START);
        equalPanel.add(clearButton, BorderLayout.CENTER);
        equalPanel.add(squareButton, BorderLayout.CENTER);
        equalPanel.add(rootButton, BorderLayout.LINE_END);
        jframe.add(equalPanel);
    }

    private void addEventsToButtons() {
        // TODO: Add button events
    }

    private class OperationButton extends JButton {

        OperationButton(String label) {
            super(label);
            this.setFont(displayFont);
            this.setBackground(Color.DARK_GRAY);
            this.setForeground(Color.WHITE);
        }

        @Override
        public Dimension getPreferredSize() {
            return new Dimension(OPERATION_BUTTON_DIMENSION);
        }

    }

    private class NumberButton extends JButton {

        NumberButton(String label) {
            super(label);
            this.setFont(displayFont);
            this.setBackground(Color.LIGHT_GRAY);
            this.setForeground(Color.WHITE);
        }

        @Override
        public Dimension getPreferredSize() {
            return new Dimension(NUMBER_BUTTON_DIMENSION);
        }

    }

    private class RowPanel extends JPanel {

        public RowPanel() {
            super();
            FlowLayout layout = new FlowLayout();
            layout.setHgap(0);
            layout.setVgap(0);
            this.setLayout(layout);
            this.setBorder(null);
        }

        @Override
        public Dimension getPreferredSize() {
            return NUMBER_BUTTON_ROW_DIMENSION;
        }

    }

    private class RowOperationPanel extends JPanel {

        public RowOperationPanel() {
            super();
            this.setLayout(new BorderLayout());
            this.setBorder(null);
        }

        @Override
        public Dimension getPreferredSize() {
            return OPERATION_PANEL_DIMENSION;
        }

    }

    private class EqualPanel extends JPanel {

        public EqualPanel() {
            super();
            FlowLayout layout = new FlowLayout();
            layout.setVgap(0);
            layout.setHgap(0);
            this.setLayout(layout);
        }

        @Override
        public Dimension getPreferredSize() {
            return EQUAL_BUTTON_DIMENSION;
        }

    }

    private class EqualButton extends JButton {

        public EqualButton(String label) {
            super(label);
            this.setBorder(null);
            this.setFont(displayFont);
            this.setBackground(Color.ORANGE);
            this.setForeground(Color.WHITE);
        }

        @Override
        public Dimension getPreferredSize() {
            return EQUAL_BUTTON_DIMENSION;
        }

    }

}
