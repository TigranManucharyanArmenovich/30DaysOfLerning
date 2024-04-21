package CodeMuJava.Level1;

public class Work3 {
    public static void main(String[] args) {
        Exercise work = new Exercise();

        System.out.println();
        work.ex1();

        System.out.println();
        work.ex2();

        System.out.println();
        work.ex3();

        System.out.println();
        work.ex4();

    }

    public static class Exercise {
        static void ex1() {
            System.out.println("Задание 1");
            System.out.println("Выведите в консоль все целые числа от 1 до 100.");

            for (int i = 1; i <= 10; i++) {
                System.out.print(i + " ");
            }

            System.out.println();
        }

        static void ex2() {
            System.out.println("Задание 2");
            System.out.println("Дана строка. Если в этой строке более одного символа,\n" +
                    "выведите в консоль предпоследний символ этой строки.");
            System.out.println();

            String str = "3 часа ночи, а я так и программирую... надо кофе заварить";

            System.out.println("Строка для примера: " + str);

            if (str.length() > 0) {
                System.out.println("Последний символ в строке: " + str.charAt(str.length() - 1));
            } else {
                System.out.println("Вы ввели пустую строку");
            }

        }

        static void ex3() {
            System.out.println("Задание 3");
            System.out.println("Даны два целых числа. Найдите остаток от деления первого числа на второе.");

            int num1 = 2;
            int num2 = 5;

            System.out.println("Число первое: " + num1 + "\nЧисло второе: " + num2);
            System.out.println("остаток от деления " + num1 + " на " + num2 + " = " + (num1 % num2));

        }

        static void ex4(){
            System.out.println("Задание 4");
            System.out.println("Дано целое число, содержащее номер месяца от 1 до 12:" + "\n" +
                    "byte num = 1;\n"  + "Определите, в какую пору года попадает этот месяц.\n");

            byte num = 6;
            String str = "";

            switch (num){
                case 12:
                case 1:
                case 2:
                    str = "Зима";
                    break;
                case 3:
                case 4:
                case 5:
                    str = "Весна";
                    break;
                case 6:
                case 7:
                case 8:
                    str = "Лето";
                    break;
                case 9:
                case 10:
                case 11:
                    str = "Осень";
                    break;
            }

            System.out.println("Месяц нпопадает на " + str);
        }
    }
}
