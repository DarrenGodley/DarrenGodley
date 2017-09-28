import javax.swing.*;

public class problemSet02 {
    public static void main(String args[]) {
        String firstName, lastName, initial;
        int distance;
        double raised;

        firstName = JOptionPane.showInputDialog("Please enter your first name: ");
        lastName = JOptionPane.showInputDialog("Please enter your last name: ");
        initial = JOptionPane.showInputDialog("Please enter your initials: ");

        distance = Integer.parseInt(JOptionPane.showInputDialog("Please enter a distance"));

        raised = 0.0;

        if (distance < 10) {
            raised = distance * 0.07;
        } else if (distance > 10) {
          raised = 0.07 * 10 + ((distance - 10) * 0.1);
        }

        JOptionPane.showMessageDialog(null, "First name: " +
        firstName + "\nLast name: " + lastName + "\nInitials: " + initial + "\nDistance travelled: " + distance +
                        "\nMoney raised: " + raised, "Results",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
