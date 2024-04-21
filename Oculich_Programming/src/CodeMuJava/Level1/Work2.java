package CodeMuJava.Level1;

public class Work2 {
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

        System.out.println();

        work.ex5();

    }

    public static class Exercise{
        public void ex1() {
            System.out.println("Задание 1");
            System.out.println("Дано целое число. Выведите в консоль первую цифру этого числа.");

            System.out.println();

            int OriginalNumber = 12345;
            int number = OriginalNumber;
            int reversedNumber = 0;

            while (number != 0) {
                reversedNumber = reversedNumber * 10 + number % 10;
                number /= 10;
            }

            System.out.println("Число для примера: " + OriginalNumber);
            System.out.println("Первое число: " + reversedNumber % 10);
        }

        public void ex2() {
            System.out.println("Задание 2");
            System.out.println("Дано целое число. Выведите в консоль последнюю цифру этого числа.");

            System.out.println();

            int number = 12345;

            System.out.println("Число для примера: " + number);
            System.out.println("Последнее число: " + number % 10);
        }

        public void ex3() {
            System.out.println("Задание 3");
            System.out.println("Дано целое число. Выведите в консоль сумму первой и последней цифры этого числа.");

            System.out.println();

            int OriginNumber = 12345;
            int number = OriginNumber;
            int reversedNumber = 0;

            while (number != 0) {
                reversedNumber = reversedNumber * 10 + number % 10;
                number /= 10;
            }

            System.out.println("Число для примера: " + OriginNumber);
            System.out.println("Сумма первого и последнего числа: " + ((reversedNumber %10) + (OriginNumber % 10)));
        }

        public void ex4(){
            System.out.println("Задание 4");
            System.out.println("Дано целое число. Выведите количество цифр в этом числе.");

            System.out.println();

            int OriginalNumber = 12345;
            int number = OriginalNumber;
            int counter = 0;

            while (number != 0) {
                counter ++;
                number /= 10;
            }

            System.out.println("Число для примера: " + OriginalNumber);
            System.out.println("Количество символов: " + counter);
        }

        public void ex5() {
            System.out.println("Задание 5");
            System.out.println("Даны два целых числа. Проверьте, что первые цифры этих чисел совпадают.");

            System.out.println();

            int OriginalNumber = 12345;
            int number = OriginalNumber;

            int OriginalNumber2 = 92345;
            int number2 = OriginalNumber2;

            int reversedNumber = 0;
            int reversedNumber2 = 0;

            while (number != 0 && number2 != 0) {
                reversedNumber = reversedNumber * 10 + number % 10;
                reversedNumber2 = reversedNumber2 * 10 + number2 % 10;

                number /= 10;
                number2 /= 10;
            }

            System.out.println("Первое число: " + OriginalNumber + "\nВторое число: " + OriginalNumber2);
            System.out.println();

            if ((reversedNumber % 10) == (reversedNumber2 % 10)) {
                System.out.println("Первые чила обоих значений совпадают");
            }
            else {
                System.out.println("Первые чила обоих значений не совпадают");
            }


        }
    }
}
