import javax.swing.*;

public class Exercise1 {
    public static void main(String[] args) {

        double exchangeRate, euro, pound;
        int count=0;

        exchangeRate = Double.parseDouble((JOptionPane.showInputDialog("Enter the exchange rate: ")));

        while(count > 5){
            pound = Integer.parseInt(JOptionPane.showInputDialog("enter amount in pounds"));

            euro = pound/exchangeRate;

            JOptionPane.showMessageDialog(null, "Pound: " + pound + "exchangeRate" + exchangeRate +
            "euro" + euro + String.format("%.2f"));
        }
    }
}
