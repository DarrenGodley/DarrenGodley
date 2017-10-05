import javax.swing.*;

public class exercise4 {
    public static void main(String[] args) {

        String fullName, capital,surname, firstname;
        int nameLength;
        char first;


        fullName = JOptionPane.showInputDialog("Please enter your full name");

        nameLength = fullName.length();
        first = fullName.charAt(0);
        capital = fullName.toUpperCase();
        surname = fullName.substring(fullName.lastIndexOf(' '),nameLength);
        firstname = fullName.substring(0,fullName.indexOf(' '));


        //JOptionPane.showMessageDialog(null,"Name length: " + nameLength + "\nFirst initial: " + first + "\nName in upper case: " + capital , "Name details", JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, String.format("Name length: %d\n First initial: %c\n Name in upper case: %s\nSurname on its own: %s\n First name on its own: %s",
                nameLength, first, capital, surname, firstname), "Name details", JOptionPane.INFORMATION_MESSAGE);


    }
}
