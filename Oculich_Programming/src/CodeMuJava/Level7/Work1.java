package CodeMuJava.Level7;

import java.time.LocalDate;

public class Work1 {
    public static void main(String[] args) {
        Exercise work = new Exercise();

        System.out.println();
        work.ex1();
    }

    public static class Exercise {
        public void ex1() {
            System.out.println("Задание 1");
            System.out.println("Сделайте метод, который вернет текущий день недели словом.");
            System.out.println();

            System.out.println(String.valueOf(LocalDate.now().getDayOfWeek()));
        }
    }
}
