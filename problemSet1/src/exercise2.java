import javax.swing.*;

public class exercise2 {
    public static void main(String[] args) {

        int inches=0, yards=1;

        JTextArea textArea = new JTextArea(10,2);

        textArea.setText("yards \tinches\n\n");

        for(yards=1; yards < 11; yards++) {
            inches = yards * 36;

            textArea.append("\n" + yards+ "\t" + inches);
        }
        JOptionPane.showMessageDialog(null, textArea, "Yards and inches",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
