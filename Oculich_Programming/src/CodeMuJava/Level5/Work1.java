package CodeMuJava.Level5;

import java.util.Scanner;

public class Work1 {
    public static void main(String[] args) {
        Exercise work = new Exercise();

        System.out.println();
        work.ex1();
    }

    public static class  Exercise{
        public  void ex1(){
            System.out.println("Задание 1");
            System.out.println("Попросите у пользователя ввести через консоль два числа. Выведите сумму этих чисел.");

            Scanner userString = new Scanner(System.in);

            System.out.print("Введите первое значение: ");
            int num1 = userString.nextInt();

            System.out.print("\nВведите второе значение: ");
            int num2 = userString.nextInt();

            System.out.println("Результат: " + (num1 + num2));

        }

    }
}