package hust.soict.dsai.hedspi.lab01;

import javax.swing.JOptionPane;

public class TwoNumbersMath {
    public static void main(String[] args) {
        String strNum1, strNum2;
        strNum1 = JOptionPane.showInputDialog(null, "Please input the first number: ", "Input the first number", JOptionPane.INFORMATION_MESSAGE);
        double num1 = Double.parseDouble(strNum1);
        strNum2 = JOptionPane.showInputDialog(null, "Please input the second number: ", "Input the second number", JOptionPane.INFORMATION_MESSAGE);
        double num2 = Double.parseDouble(strNum2);
        double sum = num1 + num2;
        double diff = num1 - num2;
        double prod = num1 * num2;
        double quot = num1 / num2;
        JOptionPane.showMessageDialog(null, "Sum: " + sum + "\n" + "Difference: " + diff + "\n" + "Product: " + prod + "\n" + "Quotient: " + quot + "\n", "Result", JOptionPane.INFORMATION_MESSAGE);
    }
}