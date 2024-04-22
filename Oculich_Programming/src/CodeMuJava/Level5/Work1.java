package CodeMuJava.Level5;

import CodeMuJava.Level4.Work2;

public class Work1 {
    public static void main(String[] args) {
        Work2.Exercise work = new Work2.Exercise();

        System.out.println();
        work.ex1();
    }

    public static class  Exercise{
        public  void ex1(){
            System.out.println("Задание 1");
            System.out.println(" ");
        }

    }
}