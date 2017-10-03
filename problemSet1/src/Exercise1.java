import javax.swing.*;

public class Exercise1 {
    public static void main(String[] args) {

        double exchangeRate, euro, pound=1;

        exchangeRate = Double.parseDouble((JOptionPane.showInputDialog("Enter the exchange rate: ")));

        while(pound != 0){
            pound = Integer.parseInt(JOptionPane.showInputDialog("enter amount in pounds"));

            euro = pound/exchangeRate;

            JOptionPane.showMessageDialog(null, String.format("Pounds: %1.2f\n Exchange Rate: %1.2f\n Euro: %1.2f", pound, exchangeRate, euro),
                    "Money Converter", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
