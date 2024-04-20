package Vasiliev_SelfExam.Part4;

import javax.swing.*;

public class Listing5 {
    public static void main(String[] args) {
        // Граница суммы, индекснай переменная и переменная для записи суммы:
        int count, i, s = 0;
        // Считываем границу суммы:
        count = Integer.parseInt(JOptionPane.showInputDialog("Введите границу суммы: "));
        // Текстовая переменная:
        String text = "Сумма натуральных чисел от 1 до " + count + ": ";
        // Вычисление суммы оператором For:
        for (i = 1; i <= count; i++){
            s += i;}
        // Вывод окна сообщения на экран:
        JOptionPane.showMessageDialog(null, text + s);
    }
}
