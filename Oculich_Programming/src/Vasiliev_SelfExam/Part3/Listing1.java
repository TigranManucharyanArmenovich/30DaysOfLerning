package Vasiliev_SelfExam.Part3;

import javax.swing.*;
import java.time.temporal.JulianFields;

public class Listing1 {
    public static void main(String[] args) {

        int number = Integer.parseInt(JOptionPane.showInputDialog(null, "Введите число: "));

        String text = number % 2 ==0?" Чётеое ":" Нечётное ";

        JOptionPane.showMessageDialog(null, "Вы ввели" + text + "Число");

    }
}
