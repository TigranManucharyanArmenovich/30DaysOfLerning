package Vasiliev_SelfExam.Part2;

import javax.swing.*;

public class Listing2 {
    public static void main(String[] args) {
        int Number = 123;
        String NotANumber = "321";
        int ANumber =  Integer.parseInt(NotANumber);

        String title1 = "Команда Number + NotANumber";
        String title2 = "Команда Number + ANumber";

        int type1 = JOptionPane.ERROR_MESSAGE;
        int type2 = JOptionPane.WARNING_MESSAGE;

        JOptionPane.showMessageDialog(null, Number + NotANumber, title1,type1);
        JOptionPane.showMessageDialog(null, Number + ANumber, title2,type2);
    }
}
