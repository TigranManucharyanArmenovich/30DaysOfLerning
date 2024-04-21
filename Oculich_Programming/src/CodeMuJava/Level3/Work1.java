package CodeMuJava.Level3;

import java.util.Arrays;

public class Work1 {
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

        System.out.println();
        work.ex6();
    }

    public static class  Exercise{
        public  void ex1(){
            System.out.println("Задание 1");
            System.out.println("Дан массив с целыми числами. "+
                    "Выведите в консоль только те числа, которые делятся на 5.");

            int[] array = new int[101];

            String str = "";

            for (int i = 0; i < array.length; i++){
                array[i] = i;

                if ((i % 5) == 0) {
                    str += i + ", ";
                }
            }

            System.out.println("Все числа массива, которые делыятся на 5: \n" + str);
        }

        public void ex2() {
            System.out.println("Задание 2");
            System.out.println("Дана строка: abcdef. Получите первые 3 символа этой строки.");
            System.out.println();

            String str = "abcdef";
            String newStr = "";
            for (int i = 0; i <3; i++){
                newStr += str.charAt(i);
            }

            System.out.println("Первые 3 символа строки" + str + ": " + newStr);
        }

        public void ex3(){
            System.out.println("Задание 3");
            System.out.println("Дан символ: а. Узнайте, в каком регистре этот символ: в верхнем или нижнем.");
            System.out.println();
            char chr = 'а';

            //Решил усложнить себе задачу и заставить распознавать регистр всех символов обоих алфавитов
            if (((((int) chr) >= 65) && ((int) chr) <= 90) || ((((int) chr) >= 1040) && ((int) chr) <= 1071)){
                System.out.println("Символ: " + chr + " находитсяв верхнем регистре");
            }
            else {
                System.out.println("Символ: " + chr + " находитсяв нижнем регистре");
            }

        }

        public void ex4(){
            System.out.println("Задание 4");
            System.out.println("Дан массив: 1,2,3,4,5,6. получите из него следующий разрез: 1,2,3");

            int[] array = {1,2,3,4,5,6};
            int[] shortArray = new int[array.length / 2];

            for (int i = 0; i < array.length /2; i++){
                shortArray[i] = array[i];
            }

            String ResultArray = Arrays.toString(shortArray);

            System.out.println("Разрез масива: " + ResultArray);
        }

        public void ex5(){
            System.out.println("Задание 5");
            System.out.println("Дан масив целых чисел: 1, 2, 3, 0, 4, 5. \n" +
                                "Выведите позицию в массиве первого нуля");
            System.out.println();

            int[] array = {1, 2, 3, 0, 4, 5};
            int position = 0;

            for (int i = 0; i < array.length; i++){

                if (array[i] == 0){
                    position = i;
                    break;
                }
            }

            System.out.println("Позиция первого нуля в массиве:" + position);
        }

        public void ex6(){
            System.out.println("Задание 6");
            System.out.println("Дана строка: \"123-456-789\". Замените все деыисы на пробелы");
            System.out.println();


            String str = "123-456-789";
            String cloneStr = "";
            for (int i = 0; i < str.length(); i++){
                if (str.charAt(i) == '-'){
                    cloneStr += " ";
                }
                else {
                    cloneStr += str.charAt(i);
                }
            }

            System.out.println(cloneStr);

        }

    }
}
