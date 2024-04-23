package CodeMuJava.Level5;

import java.util.Arrays;
import java.util.Scanner;

public class Work2 {
    public static void main(String[] args) {
        Exercise work = new Exercise();

        System.out.println();
        work.ex1();
    }

    public static class  Exercise{
        public  void ex1(){
            System.out.println("Задание 1");
            System.out.println("Попросите у пользователя ввести через консоль 10 чисел. Заполните массив этими числами.");
            System.out.println();

            Scanner scan = new Scanner(System.in);

            int[] array = new int[10];

            for (int i = 0; i < array.length; i++) {

                System.out.print("Введите " + (i + 1) + " элемент массива: ");

                array[i] = scan.nextInt();

                System.out.println("\n");
            }

            String str = Arrays.toString(array);
            System.out.println("Итоговый массив: " + str);
        }

    }
}
