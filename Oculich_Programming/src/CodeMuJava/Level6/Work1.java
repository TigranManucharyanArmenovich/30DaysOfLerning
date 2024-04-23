package CodeMuJava.Level6;


import java.time.LocalDate;

public class Work1 {
    public static void main(String[] args) {
        Exercise work = new Exercise();

        System.out.println();
        work.ex1();
    }

    public static class Exercise{
        public void ex1(){
            System.out.println("Задание 1");
            System.out.println("Выведите текущую дату в формате год-месяц-день.");

            LocalDate currentDate = java.time.LocalDate.now();
            System.out.println(currentDate);
        }
    }
}
