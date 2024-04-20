package Vasiliev_SelfExam.Part4;

import javax.swing.*;

public class Listing2 {
    public static void main(String[] args) {
        // Текстовая переменная для считывания ввода пользователя
        // и записи текста, выводимого в диалоговом окне:
        String text, str;
        // Считывание текста (числа), выводимого в диалоговом окне:
        text = JOptionPane.showInputDialog("Введите целое число: ");
        // Провера корректности ввода:
        if (text == null) {
            System.exit(0);
        }
        // Определение числа (преобразование текста в число);
        int num = Integer.parseInt(text);
        // Вложенные условные операторы:
        if (num < 0) {str = "Вы ввели отрицательное число!";}
        else if (num > 100) {str = "Это очень большое число!";}
        else if (num > 10) {str = "Это число больше 10!";}
        else {str = "Число в пределах от 0 до 10!";}
        // Отображение диалогового окна:
        JOptionPane.showMessageDialog(null, str);
    }
}