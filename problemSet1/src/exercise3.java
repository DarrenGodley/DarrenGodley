import javax.swing.*;
import java.awt.*;

public class exercise3 {
    public static void main(String[] args) {
        String name, output;
        double length, breadth, cost, area, total;

        Font textAreaFont = new Font ("monospaced",Font.PLAIN,12);
        JTextArea textArea = new JTextArea(20,15);



        textArea.setFont(textAreaFont);

        name = JOptionPane.showInputDialog("Please enter your name: ");
        length = Double.parseDouble(JOptionPane.showInputDialog("Please enter the length of the room: "));
        breadth = Double.parseDouble(JOptionPane.showInputDialog("Please enter the breadth of the room: "));
        cost = Double.parseDouble(JOptionPane.showInputDialog("Enter the cost per square metre: "));

        textArea.setText(name+"\n");

        area = length*breadth;
        total = cost*area;
        output = String.format(" %-40s%.2f m.\n %-40s%.2f m.\n %-40s%.2f m.\n %-40s%.2f m.\n %-40s%.2f m.\n", "length of room:", length, "breadth of room:", breadth, "Total area of the room:", area, "Cost per square metre of carpet:", cost, "Total cost of carpet:", total);
        textArea.append(output);

        JOptionPane.showMessageDialog(null, textArea,"Cost of carpeting a room", JOptionPane.INFORMATION_MESSAGE);


    }
}
