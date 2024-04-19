package Vasiliev_SelfExam.Part2;

import javax.swing.*;
import java.util.Calendar;

public class Listing1 {
    public static void main(String[] args) {
        String name = "Манучарян Тигран Арменович";
        int age = 22;
        char category = '-';

        String text = "Водитель: " + name;
        text += "\n" + "Возраст: "+ age + " лет";
        text += "\n" + "Права категории: "+ category;

        JOptionPane.showMessageDialog(null, text);
    }
}
