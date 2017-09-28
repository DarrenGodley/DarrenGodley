import javax.swing.*;

public class problemSet05 {
    public static void main(String[] args) {

        char letter;
        String letterAsString;
        float num1, num2, result;

        letterAsString = JOptionPane.showInputDialog("Please enter letter 'a', 's', 'm' or 'd'");

        letter=letterAsString.charAt(0);

        switch(letter)
        {
            case 'a':
                num1 = Float.parseFloat(JOptionPane.showInputDialog("Addition, please enter a number"));

                num2 = Float.parseFloat(JOptionPane.showInputDialog("Please enter another number"));

                result = num1 + num2;

                JOptionPane.showMessageDialog(null, "number 1: " + num1 +
                "\nnumber 2: " + num2 + "\nresult: " + result, "Addition", JOptionPane.INFORMATION_MESSAGE);
                break;

            case 's':
                num1 = Float.parseFloat(JOptionPane.showInputDialog("Subtraction, please enter a number"));

                num2 = Float.parseFloat(JOptionPane.showInputDialog("Please enter another number"));

                result = num1 - num2;

                JOptionPane.showMessageDialog(null, "number 1: " + num1 +
                        "\nnumber 2: " + num2 + "\nresult: " + result, "Subtraction", JOptionPane.INFORMATION_MESSAGE);
                break;

            case 'm':
                num1 = Float.parseFloat(JOptionPane.showInputDialog("Multiplication, please enter a number"));

                num2 = Float.parseFloat(JOptionPane.showInputDialog("Please enter another number"));

                result = num1 * num2;

                JOptionPane.showMessageDialog(null, "number 1: " + num1 +
                        "\nnumber 2: " + num2 + "\nresult: " + result, "Multiplication", JOptionPane.INFORMATION_MESSAGE);
                break;

            case 'd':
                num1 = Float.parseFloat(JOptionPane.showInputDialog("Division, please enter a number"));

                num2 = Float.parseFloat(JOptionPane.showInputDialog("Please enter another number"));

                result = num1 / num2;

                JOptionPane.showMessageDialog(null, "number 1: " + num1 +
                        "\nnumber 2: " + num2 + "\nresult: " + result, "Division", JOptionPane.INFORMATION_MESSAGE);
                break;

            default:
                JOptionPane.showMessageDialog(null, "You didn't enter a valid letter", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
