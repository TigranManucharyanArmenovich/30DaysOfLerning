package Vasiliev_SelfExam.Part5;

import javax.swing.*;

public class Listing3 {
    public static void main(String[] args) {
        // Размер массива (количество строк) - случайное число от 2 до 4:
        int size = 2 + (int) (Math.random() * 3);
        // Переменная для записи количества элементов строке массива:
        int n;
        // Начальная буква для заполнения массива:
        char s = 'a';
        // Текст для вывода на экран в окне сообщения:
        String text = "\"Рваный\" символьный массив:";
        // Создание массива - задано количество строк:
        char[][] symbs = new char[size][];
        // Добавление строк в массив:
        for(int k = 0; k < size; k++){
            // Случайное число от 1 до 8:
            n= 1 + (int) (Math.random() * 8);
            // Создание строки случайной длины:
            symbs[k] = new char[n];
        }
        // Заполнение массива буквами:
        for(int i = 0; i < symbs.length; i++) {
            // Переход на новую строку и символ вертикальной черты:
            text += "\n| ";
            // Переменная j для разных значений i имеет разные ограничения:
            for (int j = 0; j < symbs[i].length; j++) {
                // Заполнение элемента символом:
                symbs[i][j] = s;
                // Следующий символ:
                s++;
                // Добавление записи в текст:
                text += symbs[i][j] + " | ";
            }
        }
        // Вывод сообщения на экран:
        JOptionPane.showMessageDialog(null,text);
    }
}
