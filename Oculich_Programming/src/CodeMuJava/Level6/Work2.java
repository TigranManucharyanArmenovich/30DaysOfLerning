package CodeMuJava.Level6;

import java.time.LocalDate;

public class Work2 {
    public static void main(String[] args) {
        Exercise work = new Exercise();

        System.out.println();
        work.ex1();
    }

    public static class Exercise {
        public void ex1() {
            System.out.println("Задание 1");
            System.out.println("Выведите название завтрашнего дня недели.");


            int year = LocalDate.now().getYear();
            int month = LocalDate.now().getMonth().getValue();
            int day = LocalDate.now().getDayOfMonth() +1;

            String week = String.valueOf(LocalDate.of(year, month, day).getDayOfWeek());

            System.out.println("" + year + "-" + month + "-" + day + "-" + week);

        }
    }
}
