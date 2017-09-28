import javax.swing.*;

public class problemSet03 {//opening
    public static void main (String args[])
    {
        String name = JOptionPane.showInputDialog("Please enter your name: ");
        double income = Double.parseDouble(JOptionPane.showInputDialog("Please enter your taxable income"));

        double taxDue = 0.0, incomeAT = 0;
        if(income >= 0.00 && income <= 20000.00){
            taxDue = (income/100)*0;
            incomeAT = income - taxDue;
    }
        else if(income >= 20000.01 && income <= 36000.00){
            taxDue = (income/100)*20;
            incomeAT = income - taxDue;
        }
        else if(income > 36000.01){
            taxDue = (income/100)*41;
            incomeAT = income - taxDue;
        }

        JOptionPane.showMessageDialog(null, "Name: " + name + "\nGross income: " +
        income + "\nTax due: " + taxDue + "\nIncome after tax: " + incomeAT, "tax",
                JOptionPane.INFORMATION_MESSAGE);
    }
}//closing
