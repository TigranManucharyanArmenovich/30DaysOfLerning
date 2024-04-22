package CodeMuJava.Level4;

public class Work2 {

    public static void main(String[] args) {
        Exercise work = new Exercise();
        System.out.println();
        work.ex1();
    }
    public static class  Exercise{
        public  void ex1(){
            System.out.println("Задание 1");
            System.out.println("Дано целое число. Выведите в консоль первую цифру этого числа.");

            System.out.println();

            int OriginalNumber = 22345;
            int number = OriginalNumber;
            int reversedNumber = 0;

            while (number != 0) {
                reversedNumber = reversedNumber * 10 + number % 10;
                number /= 10;
            }

            
            System.out.println("Число для примера: " + OriginalNumber);
            System.out.println("Первое число: " + reversedNumber % 10);
        }
    }
}

