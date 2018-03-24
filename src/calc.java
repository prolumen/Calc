import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calc extends JFrame {
    private double firstNum = 0;
    private double secondNum = 0;
    private String operation;
    private double res = 0;
    private String displayCondition;

    private JPanel calculator;
    private JTextField aTextField;
    private JButton buttonAC;
    private JButton buttonSign;
    private JButton buttonPerсent;
    private JButton buttonDivision;
    private JButton button0;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton buttonMinuse;
    private JButton buttonMulti;
    private JButton buttonPlus;
    private JButton buttonEqual;
    private JButton buttonSeparate;


    private calc() {
        JFrame frame = new JFrame();
        $$$setupUI$$$();
        frame.add(calculator);
        frame.setVisible(true);
        frame.setSize(400, 600);
        displayCondition = String.valueOf(aTextField.getText());
        aTextField.setEditable(false);

        //Symbol buttons

        button0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayCondition = String.valueOf(aTextField.getText());
                if (displayCondition.equals("X")) {
                    aTextField.setText("");
                } else if (displayCondition.equals("/")) {
                    aTextField.setText("");
                } else if (displayCondition.equals("+")) {
                    aTextField.setText("");
                } else if (displayCondition.equals("+")) {
                    aTextField.setText("");
                } else if (displayCondition.equals("-")) {
                    aTextField.setText("");
                } else if (displayCondition.equals("%")) {
                    aTextField.setText("");
                } else if (displayCondition.equals("0")) {
                    aTextField.setText("");
                }
                aTextField.setText(aTextField.getText() + 0);
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayCondition = String.valueOf(aTextField.getText());
                if (displayCondition.equals("X")) {
                    aTextField.setText("");
                } else if (displayCondition.equals("/")) {
                    aTextField.setText("");
                } else if (displayCondition.equals("+")) {
                    aTextField.setText("");
                } else if (displayCondition.equals("+")) {
                    aTextField.setText("");
                } else if (displayCondition.equals("-")) {
                    aTextField.setText("");
                } else if (displayCondition.equals("%")) {
                    aTextField.setText("");
                } else if (displayCondition.equals("0")) {
                    aTextField.setText("");
                }
                aTextField.setText(aTextField.getText() + 1);
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayCondition = String.valueOf(aTextField.getText());
                if (displayCondition.equals("X")) {
                    aTextField.setText("");
                } else if (displayCondition.equals("/")) {
                    aTextField.setText("");
                } else if (displayCondition.equals("+")) {
                    aTextField.setText("");
                } else if (displayCondition.equals("+")) {
                    aTextField.setText("");
                } else if (displayCondition.equals("-")) {
                    aTextField.setText("");
                } else if (displayCondition.equals("%")) {
                    aTextField.setText("");
                } else if (displayCondition.equals("0")) {
                    aTextField.setText("");
                }
                aTextField.setText(aTextField.getText() + 2);
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayCondition = String.valueOf(aTextField.getText());
                if (displayCondition.equals("X")) {
                    aTextField.setText("");
                } else if (displayCondition.equals("/")) {
                    aTextField.setText("");
                } else if (displayCondition.equals("+")) {
                    aTextField.setText("");
                } else if (displayCondition.equals("+")) {
                    aTextField.setText("");
                } else if (displayCondition.equals("-")) {
                    aTextField.setText("");
                } else if (displayCondition.equals("%")) {
                    aTextField.setText("");
                } else if (displayCondition.equals("0")) {
                    aTextField.setText("");
                }
                aTextField.setText(aTextField.getText() + 3);
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayCondition = String.valueOf(aTextField.getText());
                if (displayCondition.equals("X")) {
                    aTextField.setText("");
                } else if (displayCondition.equals("/")) {
                    aTextField.setText("");
                } else if (displayCondition.equals("+")) {
                    aTextField.setText("");
                } else if (displayCondition.equals("+")) {
                    aTextField.setText("");
                } else if (displayCondition.equals("-")) {
                    aTextField.setText("");
                } else if (displayCondition.equals("%")) {
                    aTextField.setText("");
                } else if (displayCondition.equals("0")) {
                    aTextField.setText("");
                }
                aTextField.setText(aTextField.getText() + 4);
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayCondition = String.valueOf(aTextField.getText());
                if (displayCondition.equals("X")) {
                    aTextField.setText("");
                } else if (displayCondition.equals("/")) {
                    aTextField.setText("");
                } else if (displayCondition.equals("+")) {
                    aTextField.setText("");
                } else if (displayCondition.equals("+")) {
                    aTextField.setText("");
                } else if (displayCondition.equals("-")) {
                    aTextField.setText("");
                } else if (displayCondition.equals("%")) {
                    aTextField.setText("");
                } else if (displayCondition.equals("0")) {
                    aTextField.setText("");
                }
                aTextField.setText(aTextField.getText() + 5);
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayCondition = String.valueOf(aTextField.getText());
                if (displayCondition.equals("X")) {
                    aTextField.setText("");
                } else if (displayCondition.equals("/")) {
                    aTextField.setText("");
                } else if (displayCondition.equals("+")) {
                    aTextField.setText("");
                } else if (displayCondition.equals("+")) {
                    aTextField.setText("");
                } else if (displayCondition.equals("-")) {
                    aTextField.setText("");
                } else if (displayCondition.equals("%")) {
                    aTextField.setText("");
                } else if (displayCondition.equals("0")) {
                    aTextField.setText("");
                }
                aTextField.setText(aTextField.getText() + 6);
            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayCondition = String.valueOf(aTextField.getText());
                if (displayCondition.equals("X")) {
                    aTextField.setText("");
                } else if (displayCondition.equals("/")) {
                    aTextField.setText("");
                } else if (displayCondition.equals("+")) {
                    aTextField.setText("");
                } else if (displayCondition.equals("+")) {
                    aTextField.setText("");
                } else if (displayCondition.equals("-")) {
                    aTextField.setText("");
                } else if (displayCondition.equals("%")) {
                    aTextField.setText("");
                } else if (displayCondition.equals("0")) {
                    aTextField.setText("");
                }
                aTextField.setText(aTextField.getText() + 7);
            }
        });
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayCondition = String.valueOf(aTextField.getText());
                if (displayCondition.equals("X")) {
                    aTextField.setText("");
                } else if (displayCondition.equals("/")) {
                    aTextField.setText("");
                } else if (displayCondition.equals("+")) {
                    aTextField.setText("");
                } else if (displayCondition.equals("+")) {
                    aTextField.setText("");
                } else if (displayCondition.equals("-")) {
                    aTextField.setText("");
                } else if (displayCondition.equals("%")) {
                    aTextField.setText("");
                } else if (displayCondition.equals("0")) {
                    aTextField.setText("");
                }
                aTextField.setText(aTextField.getText() + 8);
            }
        });
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayCondition = String.valueOf(aTextField.getText());
                if (displayCondition.equals("X")) {
                    aTextField.setText("");
                } else if (displayCondition.equals("/")) {
                    aTextField.setText("");
                } else if (displayCondition.equals("+")) {
                    aTextField.setText("");
                } else if (displayCondition.equals("+")) {
                    aTextField.setText("");
                } else if (displayCondition.equals("-")) {
                    aTextField.setText("");
                } else if (displayCondition.equals("%")) {
                    aTextField.setText("");
                } else if (displayCondition.equals("0")) {
                    aTextField.setText("");
                }
                aTextField.setText(aTextField.getText() + 9);
            }
        });
        buttonSeparate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayCondition = String.valueOf(aTextField.getText());
                if (displayCondition.equals("X")) {
                    aTextField.setText("");
                } else if (displayCondition.equals("/")) {
                    aTextField.setText("");
                } else if (displayCondition.equals("+")) {
                    aTextField.setText("");
                } else if (displayCondition.equals("+")) {
                    aTextField.setText("");
                } else if (displayCondition.equals("-")) {
                    aTextField.setText("");
                } else if (displayCondition.equals("%")) {
                    aTextField.setText("");
                } else if (displayCondition.equals("0")) {
                    aTextField.setText("");
                }
                aTextField.setText(aTextField.getText() + ".");
            }
        });
        buttonAC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tmp = aTextField.getText();
                if (tmp.equals("Error")) {
                    aTextField.setText("0");
                    res = 0;
                    firstNum = 0;
                } else if (tmp.length() == 1) {
                    if ((tmp.equals("0")) || (tmp.equals("0.0"))) {
                        firstNum = 0;
                        res = 0;
                    }
                    aTextField.setText("0");
                } else if (secondNum != 0) {
                    aTextField.setText("0");
                } else if (tmp.length() > 1) {
                    aTextField.setText(tmp.substring(0, tmp.length() - 1));
                }
            }
        });
        buttonSign.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                char array[] = aTextField.getText().toCharArray();
                int i;
                if (array[0] == '-') {
                    array[0] = ' ';
                    String tmp = aTextField.getText().replace('-', ' ');
                    aTextField.setText(tmp.trim());
                } else {
                    aTextField.setText("-" + aTextField.getText());
                }
            }
        });

        //Action buttons


        buttonPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstNum = Double.parseDouble(aTextField.getText());
                operation = "+";
                aTextField.setText("+");
            }
        });
        buttonMinuse.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstNum = Double.valueOf(aTextField.getText());
                operation = "-";
                aTextField.setText("-");
            }
        });
        buttonMulti.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstNum = Double.valueOf(aTextField.getText());
                operation = "X";
                aTextField.setText("X");
            }
        });
        buttonDivision.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstNum = Double.valueOf(aTextField.getText());
                operation = "/";
                aTextField.setText("/");
            }
        });
        buttonPerсent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstNum = Double.valueOf(aTextField.getText());
                operation = "%";
                aTextField.setText("%");
            }
        });
        buttonEqual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                secondNum = Double.valueOf(aTextField.getText());
                if (operation.equals("+")) {
                    res = firstNum + secondNum;
                    aTextField.setText(res + "");
                } else if (operation.equals("-")) {
                    res = firstNum - secondNum;
                    aTextField.setText(res + "");
                } else if (operation.equals("X")) {
                    res = firstNum * secondNum;
                    aTextField.setText(res + "");
                } else if (operation.equals("/")) {
                    if (secondNum != 0) {
                        res = firstNum / secondNum;
                        aTextField.setText(res + "");
                    }
                    aTextField.setText("Error");
                } else if (operation.equals("%")) {
                    res = firstNum / 100 * secondNum;
                    aTextField.setText(res + "");
                }
                firstNum = res;
                res = 0;
            }
        });
    }

    public static void main(String[] args) {
        new calc();
    }


    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        calculator = new JPanel();
        calculator.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(6, 4, new Insets(0, 0, 0, 0), -1, -1));
        calculator.setVisible(true);
        calculator.putClientProperty("html.disable", Boolean.FALSE);
        aTextField = new JTextField();
        aTextField.setDoubleBuffered(false);
        Font aTextFieldFont = this.$$$getFont$$$(null, -1, 48, aTextField.getFont());
        if (aTextFieldFont != null) aTextField.setFont(aTextFieldFont);
        aTextField.setHorizontalAlignment(4);
        aTextField.setMargin(new Insets(0, 0, 0, 0));
        aTextField.setText("0");
        calculator.add(aTextField, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 4, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        buttonAC = new JButton();
        buttonAC.setBorderPainted(true);
        Font buttonACFont = this.$$$getFont$$$(null, -1, 22, buttonAC.getFont());
        if (buttonACFont != null) buttonAC.setFont(buttonACFont);
        buttonAC.setForeground(new Color(-65495));
        buttonAC.setText("AC");
        calculator.add(buttonAC, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, new Dimension(-1, 10), null, null, 0, false));
        buttonSign = new JButton();
        Font buttonSignFont = this.$$$getFont$$$(null, -1, 22, buttonSign.getFont());
        if (buttonSignFont != null) buttonSign.setFont(buttonSignFont);
        buttonSign.setText("+/-");
        calculator.add(buttonSign, new com.intellij.uiDesigner.core.GridConstraints(1, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        buttonPerсent = new JButton();
        Font buttonPerсentFont = this.$$$getFont$$$(null, -1, 22, buttonPerсent.getFont());
        if (buttonPerсentFont != null) buttonPerсent.setFont(buttonPerсentFont);
        buttonPerсent.setText("%");
        calculator.add(buttonPerсent, new com.intellij.uiDesigner.core.GridConstraints(1, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        buttonDivision = new JButton();
        buttonDivision.setBackground(new Color(-7254770));
        buttonDivision.setBorderPainted(true);
        buttonDivision.setContentAreaFilled(false);
        Font buttonDivisionFont = this.$$$getFont$$$(null, -1, 22, buttonDivision.getFont());
        if (buttonDivisionFont != null) buttonDivision.setFont(buttonDivisionFont);
        buttonDivision.setIconTextGap(4);
        buttonDivision.setOpaque(false);
        buttonDivision.setText("/");
        calculator.add(buttonDivision, new com.intellij.uiDesigner.core.GridConstraints(1, 3, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        button7 = new JButton();
        Font button7Font = this.$$$getFont$$$(null, -1, 22, button7.getFont());
        if (button7Font != null) button7.setFont(button7Font);
        button7.setText("7");
        calculator.add(button7, new com.intellij.uiDesigner.core.GridConstraints(2, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        button8 = new JButton();
        Font button8Font = this.$$$getFont$$$(null, -1, 22, button8.getFont());
        if (button8Font != null) button8.setFont(button8Font);
        button8.setText("8");
        calculator.add(button8, new com.intellij.uiDesigner.core.GridConstraints(2, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        button9 = new JButton();
        Font button9Font = this.$$$getFont$$$(null, -1, 22, button9.getFont());
        if (button9Font != null) button9.setFont(button9Font);
        button9.setText("9");
        calculator.add(button9, new com.intellij.uiDesigner.core.GridConstraints(2, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        buttonMulti = new JButton();
        buttonMulti.setBackground(new Color(-7254770));
        Font buttonMultiFont = this.$$$getFont$$$(null, -1, 22, buttonMulti.getFont());
        if (buttonMultiFont != null) buttonMulti.setFont(buttonMultiFont);
        buttonMulti.setForeground(new Color(-4473925));
        buttonMulti.setHideActionText(true);
        buttonMulti.setText("X");
        buttonMulti.setVisible(true);
        calculator.add(buttonMulti, new com.intellij.uiDesigner.core.GridConstraints(2, 3, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        button4 = new JButton();
        Font button4Font = this.$$$getFont$$$(null, -1, 22, button4.getFont());
        if (button4Font != null) button4.setFont(button4Font);
        button4.setText("4");
        calculator.add(button4, new com.intellij.uiDesigner.core.GridConstraints(3, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        button5 = new JButton();
        Font button5Font = this.$$$getFont$$$(null, -1, 22, button5.getFont());
        if (button5Font != null) button5.setFont(button5Font);
        button5.setText("5");
        calculator.add(button5, new com.intellij.uiDesigner.core.GridConstraints(3, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        button6 = new JButton();
        Font button6Font = this.$$$getFont$$$(null, -1, 22, button6.getFont());
        if (button6Font != null) button6.setFont(button6Font);
        button6.setText("6");
        calculator.add(button6, new com.intellij.uiDesigner.core.GridConstraints(3, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        buttonMinuse = new JButton();
        buttonMinuse.setAutoscrolls(false);
        buttonMinuse.setBackground(new Color(-7254770));
        buttonMinuse.setContentAreaFilled(true);
        Font buttonMinuseFont = this.$$$getFont$$$(null, -1, 22, buttonMinuse.getFont());
        if (buttonMinuseFont != null) buttonMinuse.setFont(buttonMinuseFont);
        buttonMinuse.setText("-");
        calculator.add(buttonMinuse, new com.intellij.uiDesigner.core.GridConstraints(3, 3, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        button1 = new JButton();
        Font button1Font = this.$$$getFont$$$(null, -1, 22, button1.getFont());
        if (button1Font != null) button1.setFont(button1Font);
        button1.setText("1");
        calculator.add(button1, new com.intellij.uiDesigner.core.GridConstraints(4, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        button2 = new JButton();
        Font button2Font = this.$$$getFont$$$(null, -1, 22, button2.getFont());
        if (button2Font != null) button2.setFont(button2Font);
        button2.setText("2");
        calculator.add(button2, new com.intellij.uiDesigner.core.GridConstraints(4, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        button3 = new JButton();
        Font button3Font = this.$$$getFont$$$(null, -1, 22, button3.getFont());
        if (button3Font != null) button3.setFont(button3Font);
        button3.setText("3");
        calculator.add(button3, new com.intellij.uiDesigner.core.GridConstraints(4, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        buttonPlus = new JButton();
        buttonPlus.setBackground(new Color(-7254770));
        Font buttonPlusFont = this.$$$getFont$$$(null, -1, 22, buttonPlus.getFont());
        if (buttonPlusFont != null) buttonPlus.setFont(buttonPlusFont);
        buttonPlus.setText("+");
        calculator.add(buttonPlus, new com.intellij.uiDesigner.core.GridConstraints(4, 3, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        buttonEqual = new JButton();
        buttonEqual.setBackground(new Color(-7254770));
        Font buttonEqualFont = this.$$$getFont$$$(null, -1, 22, buttonEqual.getFont());
        if (buttonEqualFont != null) buttonEqual.setFont(buttonEqualFont);
        buttonEqual.setRolloverEnabled(false);
        buttonEqual.setText("=");
        calculator.add(buttonEqual, new com.intellij.uiDesigner.core.GridConstraints(5, 3, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, new Dimension(-1, 10), null, null, 0, false));
        buttonSeparate = new JButton();
        Font buttonSeparateFont = this.$$$getFont$$$(null, -1, 22, buttonSeparate.getFont());
        if (buttonSeparateFont != null) buttonSeparate.setFont(buttonSeparateFont);
        buttonSeparate.setText(",");
        calculator.add(buttonSeparate, new com.intellij.uiDesigner.core.GridConstraints(5, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        button0 = new JButton();
        Font button0Font = this.$$$getFont$$$(null, -1, 22, button0.getFont());
        if (button0Font != null) button0.setFont(button0Font);
        button0.setText("0");
        calculator.add(button0, new com.intellij.uiDesigner.core.GridConstraints(5, 0, 1, 2, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    private Font $$$getFont$$$(String fontName, int style, int size, Font currentFont) {
        if (currentFont == null) return null;
        String resultName;
        if (fontName == null) {
            resultName = currentFont.getName();
        } else {
            Font testFont = new Font(fontName, Font.PLAIN, 10);
            if (testFont.canDisplay('a') && testFont.canDisplay('1')) {
                resultName = fontName;
            } else {
                resultName = currentFont.getName();
            }
        }
        return new Font(resultName, style >= 0 ? style : currentFont.getStyle(), size >= 0 ? size : currentFont.getSize());
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return calculator;
    }
}

