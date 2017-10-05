import javax.swing.*;

public class exercise4 {
    public static void main(String[] args) {

        String fullName, capital;
        int nameLength;
        char first;


        fullName = JOptionPane.showInputDialog("Please enter your full name");

        nameLength = fullName.length();
        first = fullName.charAt(0);
        capital = fullName.toUpperCase();


    }
}
