package CodeMuJava.Level2;

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

    }

    public static class Exercise{
        public void ex1(){
            System.out.println("Задание 1");
            System.out.println("Найдите среднее арифметическое всех целых чисел от 1 до 100.");

            double sum = 0;
            String s = "";
            for (int i = 1; i <= 100; i++){
                //s += i + ", ";
                sum += i;
            }
            //System.out.println(s);
            //System.out.println("Сумма всех чисел от одного до 100: " + sum);

            System.out.println("Среднее арифметическое: " + (sum / 100));

        }

        public void ex2() {
            System.out.println("Задание 2");
            System.out.println("Дано число: 12345. Выведите в консоль сумму первой и последней цифры этого числа.");
            System.out.println();

            int OriginNumber = 12345;
            int number = OriginNumber;
            int reversedNumber = 0;

            while (number != 0) {
                reversedNumber = reversedNumber * 10 + number % 10;
                number /= 10;
            }
            ;
            System.out.println("Сумма первого и последнего числа: " + ((reversedNumber %10) + (OriginNumber % 10)));
        }

        public void ex3(){
            System.out.println("Задание 3");
            System.out.println("Дан массив с целыми числвами: 1,2,3,4,5. \nНайти сумму элементов массива.");
            System.out.println();

            int[] array = {1,2,3,4,5};
            int sum = 0;
            for (int i = 0; i < array.length; i++){
                sum += array[i];
            }

            System.out.println("Сумма элементов массива: " + sum);
        }

        public void ex4() {
            System.out.println("Задание 4");
            System.out.println("Дано целое число: 12345 Выведите в консоль все его цифры с конца.");

            System.out.println();

            int OriginNumber = 12345;
            int number = OriginNumber;

            String str = "";

            while (number != 0) {
                str += (number % 10) + ", ";
                number /= 10;
            }

            System.out.println("Элементы числа " +OriginNumber + " с конца: " + str);
        }
    }
}
