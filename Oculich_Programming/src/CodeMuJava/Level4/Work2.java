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
            System.out.println("Выведите в консоль все числа в промежутке от 10 до 1000, у которых первая цифра четная.");
            System.out.println();


            for (int i = 1; i < 1000; i++) {
                int number = i;
                int reversedNumber = 0;

                while (number != 0) {
                    reversedNumber = reversedNumber * 10 + number % 10;
                    number /= 10;
                }

                if ((reversedNumber % 10) % 2 == 0){
                    System.out.println("Первое число: " + i);
                }
            }
        }
    }
}

