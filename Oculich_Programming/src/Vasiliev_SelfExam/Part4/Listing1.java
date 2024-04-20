package Vasiliev_SelfExam.Part4;

import javax.swing.*;

public class Listing1 {
    public static void main(String[] args) {
        //Числа (числитель и знаменатель)
        double x,y;
        //Заголовок окна
        String title = "Деление числа";
        //Текст сообщения (начальное деление)
        String text = "Результат деления: ";
        //переменная определяет тип сообщения
        int type;
        //Считываение числителя
        x = Double.parseDouble(JOptionPane.showInputDialog(null, "Числитель: "));
        //Считывание знаменателя
        y = Double.parseDouble(JOptionPane.showInputDialog(null, "Знаменатель: "));
        //Условный оператор: Равен ли нулю знаменатель?
        if (y != 0){                                //Знаменатель не равен нулю
            type = JOptionPane.PLAIN_MESSAGE;
            text += x + " / " + y + " = " + x/y;
        }
        else {                                      //Знаменатель равен нулю
            type = JOptionPane.ERROR_MESSAGE;
            text = "Деление на 0";
        }
        //Отображение окна с сообщением
        JOptionPane.showMessageDialog(null, text, title, type);
    }
}
