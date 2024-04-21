package CodeMuJava.Level1;

public class Work4 {
    public static void main(String[] args) {
        Exercise work = new Exercise();

        System.out.println();
        work.ex1();

        System.out.println();
        work.ex2();

        System.out.println();
        work.ex3();


    }

    public static class Exercise{
        public void ex1(){
            System.out.println("Задание 1");
            System.out.println("Выведите в консоль все четные числа из промежутка от 1 до 100.");

            String str = "";

            for (int i = 1; i <= 10; i++){
                if ((i % 2) ==0){
                    str += i + " ";
                }
            }

            System.out.println("Результат: \n" + str);
        }

        public void ex2(){
            System.out.println("Задание 2");
            System.out.println(" ");


        }

        public void ex3(){
            System.out.println("Задание 3");
            System.out.println(" ");


        }
    }
}
