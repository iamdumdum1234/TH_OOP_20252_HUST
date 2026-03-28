// I JUST MADE SOME BS!!!!!!!!
import javax.swing.JOptionPane;
public class EquationSolver {
    public static void firstDegree(double a, double b) {
        if (a == 0) {
            JOptionPane.showMessageDialog(null, "Invalid!");
        }
        else {
            JOptionPane.showMessageDialog(null, "The result is: " + (-b /a));
        }
    }
    public static void firstDegSeries(double a1, double b1, double a2, double b2, double c1, double c2)  {
        // Use Cramer's rule for easier implementation
        double det = (a1 * b2) - (a2 * b1);
        double detx = (c1 * b2) - (c2 * b1);
        double dety = (a1 * c2) - (a2 * c1);

        if (det != 0) {
            double x = detx / det;
            double y = dety / det;
            JOptionPane.showMessageDialog(null, "The results are: " + x + " and " + y);
        } else {
            if (detx == 0 && dety == 0) {
                JOptionPane.showMessageDialog(null, "Function has infinite solutions!");
            } else {
                JOptionPane.showMessageDialog(null, "Function has no solutions!");
            }
        }
    }
    public static void secondDegree(double a, double b, double c) {
        double delta = Math.pow(b, 2) - (4 * a * c);
        if (delta == 0) {
            JOptionPane.showMessageDialog(null, "Function has infinite solutions!");
        }
        else if (delta < 0) {
            JOptionPane.showMessageDialog(null, "Function has no solutions!");
        }
        else if (a == 0) {
            firstDegree(b, c);
        }
        else {
            double sum1 = (-b + Math.sqrt(delta)) / (2 * a);
            double sum2 = (-b - Math.sqrt(delta)) / (2 * a);
            JOptionPane.showMessageDialog(null, "The results are: " + sum1 + " and " + sum2);
        }
    }
    public static void main(String[] args) {
        String selection;
        // not that good at Java yet so this will make do
        selection = JOptionPane.showInputDialog(null, "Please select your choice:\n1 for First Degree\n2 for First Degree Series\n3 for Second Degree", "Welcome!", JOptionPane.INFORMATION_MESSAGE);
        // thanks intellij for telling me that i can use a switch statement instead
        switch(selection) {
            case "1": {
                String astr, bstr;
                astr = JOptionPane.showInputDialog(null, "Enter the first number: ");
                bstr = JOptionPane.showInputDialog(null, "Enter the second number: ");
                double a = Double.parseDouble(astr);
                double b = Double.parseDouble(bstr);
                firstDegree(a, b);
                break;
            }
            case "2": {
                String a1str, b1str, a2str, b2str, c1str, c2str;
                a1str = JOptionPane.showInputDialog(null, "Enter a1: ");
                b1str = JOptionPane.showInputDialog(null, "Enter b1: ");
                a2str = JOptionPane.showInputDialog(null, "Enter a2: ");
                b2str = JOptionPane.showInputDialog(null, "Enter b2: ");
                c1str = JOptionPane.showInputDialog(null, "Enter c1: ");
                c2str = JOptionPane.showInputDialog(null, "Enter c2: ");
                double a1 = Double.parseDouble(a1str);
                double b1 = Double.parseDouble(b1str);
                double a2 = Double.parseDouble(a2str);
                double b2 = Double.parseDouble(b2str);
                double c1 = Double.parseDouble(c1str);
                double c2 = Double.parseDouble(c2str);
                firstDegSeries(a1, b1, a2, b2, c1, c2);
                break;
            }
            case "3": {
                String astr, bstr, cstr;
                astr = JOptionPane.showInputDialog(null, "Enter a: ");
                bstr = JOptionPane.showInputDialog(null, "Enter b: ");
                cstr = JOptionPane.showInputDialog(null, "Enter c: ");
                double a = Double.parseDouble(astr);
                double b = Double.parseDouble(bstr);
                double c = Double.parseDouble(cstr);
                secondDegree(a, b, c);
                break;
            }
        }
    }
}